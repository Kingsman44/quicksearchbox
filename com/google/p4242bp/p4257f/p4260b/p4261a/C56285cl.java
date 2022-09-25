package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.f.b.a.cl */
/* compiled from: PG */
public enum C56285cl implements C62957cd {
    UNSPECIFIED(0),
    MENU(1),
    RECEIPT(2),
    RECIPE(3),
    FOOD(4),
    DRINK(5),
    FOOD_PRODUCT(6);
    

    /* renamed from: h */
    private final int f150004h;

    private C56285cl(int i) {
        this.f150004h = i;
    }

    /* renamed from: a */
    public static C56285cl m87958a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return MENU;
            case 2:
                return RECEIPT;
            case 3:
                return RECIPE;
            case 4:
                return FOOD;
            case 5:
                return DRINK;
            case 6:
                return FOOD_PRODUCT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87959b() {
        return C56284ck.f149995a;
    }

    public final int getNumber() {
        return this.f150004h;
    }

    public final String toString() {
        return Integer.toString(this.f150004h);
    }
}
