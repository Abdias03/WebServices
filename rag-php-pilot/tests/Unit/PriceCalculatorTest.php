<?php

declare(strict_types=1);

namespace RagPilot\Tests\Unit;

use PHPUnit\Framework\Attributes\DataProvider;
use PHPUnit\Framework\TestCase;
use RagPilot\PriceCalculator;

final class PriceCalculatorTest extends TestCase
{
    #[DataProvider('subtotalCases')]
    public function testSubtotalUsesIntegerCents(int $price, int $quantity, int $expected): void
    {
        self::assertSame($expected, (new PriceCalculator())->subtotalCents($price, $quantity));
    }

    public static function subtotalCases(): array
    {
        return [
            'one unit' => [1250, 1, 1250],
            'multiple units' => [1250, 3, 3750],
            'empty order' => [1250, 0, 0],
            'free unit' => [0, 5, 0],
            'single cent' => [1, 3, 3],
            'larger supported order' => [999999, 1000, 999999000],
        ];
    }
}
