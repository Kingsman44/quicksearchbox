package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9792b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.b.h */
/* compiled from: PG */
public enum C129022h implements C62957cd {
    PRIORITY_UNDEFINED(0),
    PRIORITY_LEGAL_NOTICE(10000),
    PRIORITY_FINISH_SETUP(20000),
    PRIORITY_SWIPE_UP_HINT(30000),
    PRIORITY_POST_RESPONSE_HINT(40000);
    

    /* renamed from: f */
    public final int f354482f;

    private C129022h(int i) {
        this.f354482f = i;
    }

    public final int getNumber() {
        return this.f354482f;
    }

    public final String toString() {
        return Integer.toString(this.f354482f);
    }
}
