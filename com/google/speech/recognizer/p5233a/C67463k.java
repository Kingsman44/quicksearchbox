package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.recognizer.a.k */
/* compiled from: PG */
public enum C67463k implements C62957cd {
    START_OF_SPEECH(0),
    END_OF_SPEECH(1),
    END_OF_AUDIO(2),
    END_OF_UTTERANCE(3);
    

    /* renamed from: e */
    public final int f183355e;

    private C67463k(int i) {
        this.f183355e = i;
    }

    /* renamed from: a */
    public static C67463k m97475a(int i) {
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
    public static C62959cf m97476b() {
        return C67462j.f183349a;
    }

    public final int getNumber() {
        return this.f183355e;
    }

    public final String toString() {
        return Integer.toString(this.f183355e);
    }
}
