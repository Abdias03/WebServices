<?php

declare(strict_types=1);

namespace RagPilot;

/**
 * Small deterministic pricing rules for the RAG pilot.
 *
 * All monetary inputs and outputs are integer cents, never floating-point money.
 * Supported inputs are nonnegative amounts/quantities whose operations fit PHP_INT_MAX.
 * Input validation and overflow policies are outside this deliberately small pilot.
 */
final class PriceCalculator
{
    /** Return unit price multiplied by quantity, in cents. */
    public function subtotalCents(int $unitPriceCents, int $quantity): int
    {
        return $unitPriceCents * $quantity;
    }

    /** Return subtotal plus one handling fee per order, including an empty order. */
    public function totalIncludingHandlingCents(int $unitPriceCents, int $quantity, int $handlingFeeCents): int
    {
        return $this->subtotalCents($unitPriceCents, $quantity) + $handlingFeeCents;
    }
}
