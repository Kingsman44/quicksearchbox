package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.d.d */
/* compiled from: PG */
public enum C128539d implements C62957cd {
    WARM_ACTIONS_UI_ACTION_CATEGORY_UNSPECIFIED(0),
    WARM_ACTIONS_UI_ACTION_CATEGORY_OPEN_SETTINGS(1);
    

    /* renamed from: c */
    public final int f353455c;

    private C128539d(int i) {
        this.f353455c = i;
    }

    /* renamed from: a */
    public static C128539d m209783a(int i) {
        if (i == 0) {
            return WARM_ACTIONS_UI_ACTION_CATEGORY_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return WARM_ACTIONS_UI_ACTION_CATEGORY_OPEN_SETTINGS;
    }

    /* renamed from: b */
    public static C62959cf m209784b() {
        return C128538c.f353451a;
    }

    public final int getNumber() {
        return this.f353455c;
    }

    public final String toString() {
        return Integer.toString(this.f353455c);
    }
}
