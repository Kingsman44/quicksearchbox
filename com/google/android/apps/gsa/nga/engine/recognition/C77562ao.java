package com.google.android.apps.gsa.nga.engine.recognition;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82960gv;
import com.google.speech.p5218j.C67033io;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.ao */
/* compiled from: PG */
public enum C77562ao {
    UNKNOWN,
    GH_INTERVAL_GUEST,
    GH_INTERVAL_UNLIKELY_USER,
    GH_INTERVAL_USER,
    GH_INTERVAL_TRUSTED_USER;

    /* renamed from: a */
    public static C77562ao m124448a(C67033io ioVar) {
        C67033io ioVar2 = C67033io.GH_INTERVAL_GUEST;
        int ordinal = ioVar.ordinal();
        if (ordinal == 0) {
            return GH_INTERVAL_GUEST;
        }
        if (ordinal == 1) {
            return GH_INTERVAL_UNLIKELY_USER;
        }
        if (ordinal != 2) {
            return ordinal != 3 ? UNKNOWN : GH_INTERVAL_TRUSTED_USER;
        }
        return GH_INTERVAL_USER;
    }

    /* renamed from: b */
    public final C82960gv mo72667b() {
        C67033io ioVar = C67033io.GH_INTERVAL_GUEST;
        int ordinal = ordinal();
        if (ordinal == 0) {
            return C82960gv.UNKNOWN;
        }
        if (ordinal == 1) {
            return C82960gv.GH_INTERVAL_GUEST;
        }
        if (ordinal == 2) {
            return C82960gv.GH_INTERVAL_UNLIKELY_USER;
        }
        if (ordinal == 3) {
            return C82960gv.GH_INTERVAL_USER;
        }
        if (ordinal != 4) {
            return C82960gv.UNKNOWN;
        }
        return C82960gv.GH_INTERVAL_TRUSTED_USER;
    }
}
