package com.google.android.libraries.home.p1948c.p1949a;

import com.google.android.libraries.home.coreui.devicetile.p1954a.C23649k;

/* renamed from: com.google.android.libraries.home.c.a.o */
/* compiled from: PG */
public final class C23633o {
    /* renamed from: a */
    public static final C23649k m44116a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1100544711:
                    if (str.equals("heatcool")) {
                        return C23649k.HEAT_COOL;
                    }
                    break;
                case 100241:
                    if (str.equals("eco")) {
                        return C23649k.ECO;
                    }
                    break;
                case 109935:
                    if (str.equals("off")) {
                        return C23649k.OFF;
                    }
                    break;
                case 3059529:
                    if (str.equals("cool")) {
                        return C23649k.COOL;
                    }
                    break;
                case 3198448:
                    if (str.equals("heat")) {
                        return C23649k.HEAT;
                    }
                    break;
            }
        }
        return C23649k.UNKNOWN;
    }
}
