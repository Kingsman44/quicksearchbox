package com.google.speech.p5218j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.j.is */
/* compiled from: PG */
public enum C67037is implements C62957cd {
    START_OF_SPEECH(0),
    END_OF_SPEECH(1),
    END_OF_AUDIO(2),
    END_OF_UTTERANCE(3);
    

    /* renamed from: e */
    public final int f182219e;

    private C67037is(int i) {
        this.f182219e = i;
    }

    /* renamed from: a */
    public static C67037is m97413a(int i) {
        if (i == 0) {
            return START_OF_SPEECH;
        }
        if (i == 1) {
            return END_OF_SPEECH;
        }
        if (i == 2) {
            return END_OF_AUDIO;
        }
        if (i != 3) {
            return null;
        }
        return END_OF_UTTERANCE;
    }

    /* renamed from: b */
    public static C62959cf m97414b() {
        return C67036ir.f182213a;
    }

    public final int getNumber() {
        return this.f182219e;
    }

    public final String toString() {
        return Integer.toString(this.f182219e);
    }
}
