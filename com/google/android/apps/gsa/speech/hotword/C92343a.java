package com.google.android.apps.gsa.speech.hotword;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.speech.hotword.a */
/* compiled from: PG */
public enum C92343a implements C62957cd {
    AVAILABLE(0),
    LOW_RAM_DEVICE(1),
    CAPTURE_AUDIO_HOTWORD_NOT_PERMITTED(2);
    

    /* renamed from: d */
    private final int f257447d;

    private C92343a(int i) {
        this.f257447d = i;
    }

    public final int getNumber() {
        return this.f257447d;
    }

    public final String toString() {
        return Integer.toString(this.f257447d);
    }
}
