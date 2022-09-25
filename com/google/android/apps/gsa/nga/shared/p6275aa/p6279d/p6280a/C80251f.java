package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.f */
/* compiled from: PG */
public enum C80251f implements C62957cd {
    ASSISTANT_TRIGGER_UNKNOWN(0),
    HOTWORD(1),
    SQUEEZE(2),
    CORNER_SWIPE(3),
    HOME_BUTTON(4),
    QSB_BUTTON(5);
    

    /* renamed from: g */
    public final int f220182g;

    private C80251f(int i) {
        this.f220182g = i;
    }

    /* renamed from: a */
    public static C80251f m128106a(int i) {
        if (i == 0) {
            return ASSISTANT_TRIGGER_UNKNOWN;
        }
        if (i == 1) {
            return HOTWORD;
        }
        if (i == 2) {
            return SQUEEZE;
        }
        if (i == 3) {
            return CORNER_SWIPE;
        }
        if (i == 4) {
            return HOME_BUTTON;
        }
        if (i != 5) {
            return null;
        }
        return QSB_BUTTON;
    }

    /* renamed from: b */
    public static C62959cf m128107b() {
        return C80250e.f220174a;
    }

    public final int getNumber() {
        return this.f220182g;
    }

    public final String toString() {
        return Integer.toString(this.f220182g);
    }
}
