package com.google.android.libraries.lens.view.infopanel.p2138a;

import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.infopanel.a.e */
/* compiled from: PG */
public final /* synthetic */ class C26969e {
    /* renamed from: a */
    public static C26968d m50032a(int i) {
        switch (i) {
            case 1:
            case 2:
                return C26968d.MOVING;
            case 3:
                return C26968d.FULLY_EXPANDED;
            case 4:
                return C26968d.HEADER;
            case 5:
                return C26968d.HIDDEN;
            case 6:
                return C26968d.OPEN;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported state %d", new Object[]{Integer.valueOf(i)}));
        }
    }
}
