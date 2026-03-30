package com.nuxx.savings_app.model;

public enum MetodoAhorro
{
    KAKEIBO("metodo.kakeibo.descripcion"),
    CINCUENTA_TREINTA_VEINTE("metodo.cincuenta_treinta_veinte.descripcion"),
    PAY_YOURSELF_FIRST("metodo.pay_yourself_first.descripcion"),
    SETENTA_VEINTE_DIEZ("metodo.setenta_veinte_diez.descripcion"),
    ZERO_BASED_BUDGET("metodo.zero_based_budget.descripcion");

    private final String descripcionKey;

    MetodoAhorro(String descripcionKey)
    {
        this.descripcionKey = descripcionKey;
    }

    public String getDescripcionKey()
    {
        return descripcionKey;
    }
}
