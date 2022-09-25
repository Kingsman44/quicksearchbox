package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.et */
/* compiled from: PG */
public enum C82904et implements C62957cd {
    UNKNOWN(0),
    MISSING_CLIENT_CONVERSATION_DONE(1),
    FAILED_TO_START_GRAPH(2),
    STUCK_IN_PLAYING_TTS(3),
    STUCK_IN_PLAYING_TTS_OUTSIDE_OF_UTTERANCE(4),
    GRAPH_FAILED(5);
    

    /* renamed from: g */
    public final int f226153g;

    private C82904et(int i) {
        this.f226153g = i;
    }

    /* renamed from: a */
    public static C82904et m132423a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return MISSING_CLIENT_CONVERSATION_DONE;
        }
        if (i == 2) {
            return FAILED_TO_START_GRAPH;
        }
        if (i == 3) {
            return STUCK_IN_PLAYING_TTS;
        }
        if (i == 4) {
            return STUCK_IN_PLAYING_TTS_OUTSIDE_OF_UTTERANCE;
        }
        if (i != 5) {
            return null;
        }
        return GRAPH_FAILED;
    }

    /* renamed from: b */
    public static C62959cf m132424b() {
        return C82903es.f226145a;
    }

    public final int getNumber() {
        return this.f226153g;
    }

    public final String toString() {
        return Integer.toString(this.f226153g);
    }
}
