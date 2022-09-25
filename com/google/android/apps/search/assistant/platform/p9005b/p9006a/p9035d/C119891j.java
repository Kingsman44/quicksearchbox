package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.j */
/* compiled from: PG */
public enum C119891j implements C62957cd {
    DEFAULT_AUDIO_ENCODING(0),
    PCM_16BIT_AUDIO_ENCODING(1),
    OGG_OPUS_AUDIO_ENCODING(2);
    

    /* renamed from: d */
    public final int f333891d;

    private C119891j(int i) {
        this.f333891d = i;
    }

    /* renamed from: a */
    public static C119891j m198765a(int i) {
        if (i == 0) {
            return DEFAULT_AUDIO_ENCODING;
        }
        if (i == 1) {
            return PCM_16BIT_AUDIO_ENCODING;
        }
        if (i != 2) {
            return null;
        }
        return OGG_OPUS_AUDIO_ENCODING;
    }

    /* renamed from: b */
    public static C62959cf m198766b() {
        return C119890i.f333886a;
    }

    public final int getNumber() {
        return this.f333891d;
    }

    public final String toString() {
        return Integer.toString(this.f333891d);
    }
}
