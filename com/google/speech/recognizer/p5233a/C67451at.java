package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.speech.recognizer.a.at */
/* compiled from: PG */
public enum C67451at implements C62957cd {
    LINEAR16(0),
    FLOAT32(1),
    FLAC(2),
    AMR(3),
    MULAW(4),
    SPEEX_NB(5),
    SPEEX_WB(6),
    OGG_VORBIS(7),
    ADTS_AAC(8),
    AMR_WB(9),
    OGG_OPUS(10),
    WEBM_OPUS(11),
    MKV(12),
    MP3(13),
    OPUS(14);
    

    /* renamed from: p */
    public final int f183321p;

    private C67451at(int i) {
        this.f183321p = i;
    }

    /* renamed from: a */
    public static C67451at m97473a(int i) {
        switch (i) {
            case 0:
                return LINEAR16;
            case 1:
                return FLOAT32;
            case 2:
                return FLAC;
            case 3:
                return AMR;
            case 4:
                return MULAW;
            case 5:
                return SPEEX_NB;
            case 6:
                return SPEEX_WB;
            case 7:
                return OGG_VORBIS;
            case 8:
                return ADTS_AAC;
            case 9:
                return AMR_WB;
            case 10:
                return OGG_OPUS;
            case 11:
                return WEBM_OPUS;
            case 12:
                return MKV;
            case 13:
                return MP3;
            case 14:
                return OPUS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97474b() {
        return C67450as.f183304a;
    }

    public final int getNumber() {
        return this.f183321p;
    }

    public final String toString() {
        return Integer.toString(this.f183321p);
    }
}
