package com.google.android.apps.search.googleapp.urlhandler.internal;

import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.common.p4552o.C60494rz;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.e */
/* compiled from: PG */
public final class C139803e {
    /* renamed from: a */
    public static C60494rz m227311a(C139851q qVar) {
        C60494rz rzVar = C60494rz.UNKNOWN;
        C139851q qVar2 = C139851q.UNKNOWN;
        switch (qVar.ordinal()) {
            case 0:
                return C60494rz.UNKNOWN;
            case 1:
                return C60494rz.SRP;
            case 2:
                return C60494rz.SUGGEST;
            case 3:
                return C60494rz.NOW;
            case 4:
                return C60494rz.AMP;
            case 5:
                return C60494rz.AMP_NOW;
            case 6:
                return C60494rz.COLLECTIONS;
            case 7:
                return C60494rz.DOODLE;
            case 8:
                return C60494rz.MENU;
            case 9:
                return C60494rz.TABS_MANAGER;
            case 10:
                return C60494rz.SETTINGS;
            case 11:
                return C60494rz.PROMO_MANAGER;
            default:
                int i = qVar.f380143m;
                throw new AssertionError("Invalid source: " + i);
        }
    }
}
