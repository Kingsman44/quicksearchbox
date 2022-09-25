package com.google.android.libraries.p2259n.p2260a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.n.a.b */
/* compiled from: PG */
public enum C29763b implements C62957cd {
    ENTRY_POINT_ID_UNKNOWN(0),
    TRANSLATE_ONE_BOX(1),
    MAPS_LOCAL_UNIVERSAL(2),
    MARKETING(3),
    SCREENSHOT_TRANSLATE(4),
    SCREENSHOT_SHOPPING(5),
    SEARCH_EDU_MATH_SOLVER(6),
    SEARCH_EDU_HOMEWORK_QA(7),
    LENS_IN_GOOGLE_APP_BROWSER(8),
    SHARE_TRANSLATE(9),
    SHARE_TO_WHATSAPP_TRANSLATE(10),
    SPOTLIGHT(11),
    WEB_GOOGLE_SEARCH_BAR(12),
    WEB_GOOGLE_TRANSLATE_PROMO(13),
    RECIPE_PROMO(14),
    SHOPPING_PROMO(15),
    IMAGES_UNIVERSAL_PROMO(16),
    WEB_IMAGES_GOOGLE_SEARCH_BAR(17),
    IGA_ACCESSORY_WIDGET(18);
    

    /* renamed from: t */
    public final int f80662t;

    private C29763b(int i) {
        this.f80662t = i;
    }

    /* renamed from: a */
    public static C29763b m54880a(int i) {
        switch (i) {
            case 0:
                return ENTRY_POINT_ID_UNKNOWN;
            case 1:
                return TRANSLATE_ONE_BOX;
            case 2:
                return MAPS_LOCAL_UNIVERSAL;
            case 3:
                return MARKETING;
            case 4:
                return SCREENSHOT_TRANSLATE;
            case 5:
                return SCREENSHOT_SHOPPING;
            case 6:
                return SEARCH_EDU_MATH_SOLVER;
            case 7:
                return SEARCH_EDU_HOMEWORK_QA;
            case 8:
                return LENS_IN_GOOGLE_APP_BROWSER;
            case 9:
                return SHARE_TRANSLATE;
            case 10:
                return SHARE_TO_WHATSAPP_TRANSLATE;
            case 11:
                return SPOTLIGHT;
            case 12:
                return WEB_GOOGLE_SEARCH_BAR;
            case 13:
                return WEB_GOOGLE_TRANSLATE_PROMO;
            case 14:
                return RECIPE_PROMO;
            case 15:
                return SHOPPING_PROMO;
            case 16:
                return IMAGES_UNIVERSAL_PROMO;
            case 17:
                return WEB_IMAGES_GOOGLE_SEARCH_BAR;
            case 18:
                return IGA_ACCESSORY_WIDGET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m54881b() {
        return C29762a.f80641a;
    }

    public final int getNumber() {
        return this.f80662t;
    }

    public final String toString() {
        return Integer.toString(this.f80662t);
    }
}
