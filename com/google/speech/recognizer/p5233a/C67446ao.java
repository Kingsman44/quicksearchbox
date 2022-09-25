package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.recognizer.a.ao */
/* compiled from: PG */
public enum C67446ao implements C62957cd {
    STATUS_SUCCESS(0),
    STATUS_INITIALIZATION_ERROR(1),
    STATUS_RECOGNITION_ERROR(2),
    STATUS_STREAM_BROKEN(3),
    STATUS_CANCELED(4);
    

    /* renamed from: f */
    public final int f183298f;

    private C67446ao(int i) {
        this.f183298f = i;
    }

    /* renamed from: a */
    public static C67446ao m97470a(int i) {
        if (i == 0) {
            return STATUS_SUCCESS;
        }
        if (i == 1) {
            return STATUS_INITIALIZATION_ERROR;
        }
        if (i == 2) {
            return STATUS_RECOGNITION_ERROR;
        }
        if (i == 3) {
            return STATUS_STREAM_BROKEN;
        }
        if (i != 4) {
            return null;
        }
        return STATUS_CANCELED;
    }

    /* renamed from: b */
    public static C62959cf m97471b() {
        return C67445an.f183291a;
    }

    public final int getNumber() {
        return this.f183298f;
    }

    public final String toString() {
        return Integer.toString(this.f183298f);
    }
}
