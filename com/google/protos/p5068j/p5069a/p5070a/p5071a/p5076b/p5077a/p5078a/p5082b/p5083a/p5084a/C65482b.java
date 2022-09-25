package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5082b.p5083a.p5084a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.protos.j.a.a.a.b.a.a.b.a.a.b */
/* compiled from: PG */
public enum C65482b implements C62957cd {
    UNKNOWN(0),
    ONLINE_SPEECH_RECOGNITION_TIMEOUT(1),
    ASSISTANT_RESULT_TIMEOUT(2),
    UNEXPECTED_PREFETCH(3),
    UNEXPECTED_PREFETCH_IN_ONLINE_PROCESSING_GRAPH(4),
    UNEXPECTED_PREFETCH_IN_GRAPH_USING_OFFLINE_ASR(5),
    UNEXPECTED_PREFETCH_IN_SINGLE_SHOT_GRAPH(6),
    SPEECH_RECOGNITION_REQUESTED_IN_ILLEGAL_STATE(7),
    SPEECH_RECOGNITION_ENDED_WITHOUT_FINAL_RESULT(8),
    UNEXPECTED_END_OF_CONVERSATION_DELTA_STREAM(9),
    SPEECH_RECOGNITION_EMPTY_FINAL_RESULT(10),
    INVALID_REQUEST(11),
    PREFETCH_FAILED_QUEUE_CLOSED(12),
    SPEECH_RECOGNITION_S3_GENERIC_ERROR(13),
    SPEECH_RECOGNITION_S3_IO_EXCEPTION(14),
    SPEECH_RECOGNITION_S3_GRPC_UNAVAILABLE(15),
    SPEECH_RECOGNITION_S3_GRPC_CANCELLED(16),
    SPEECH_RECOGNITION_S3_GRPC_INVALID_ARGUMENT(17),
    INVALID_ENDPOINTER_AUDIO_CONFIG(18),
    ARBITRATION_LOST(20);
    

    /* renamed from: u */
    public static final C62958ce f178020u = null;

    /* renamed from: v */
    public final int f178022v;

    static {
        f178020u = new C65481a();
    }

    private C65482b(int i) {
        this.f178022v = i;
    }

    /* renamed from: a */
    public static C65482b m96693a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ONLINE_SPEECH_RECOGNITION_TIMEOUT;
            case 2:
                return ASSISTANT_RESULT_TIMEOUT;
            case 3:
                return UNEXPECTED_PREFETCH;
            case 4:
                return UNEXPECTED_PREFETCH_IN_ONLINE_PROCESSING_GRAPH;
            case 5:
                return UNEXPECTED_PREFETCH_IN_GRAPH_USING_OFFLINE_ASR;
            case 6:
                return UNEXPECTED_PREFETCH_IN_SINGLE_SHOT_GRAPH;
            case 7:
                return SPEECH_RECOGNITION_REQUESTED_IN_ILLEGAL_STATE;
            case 8:
                return SPEECH_RECOGNITION_ENDED_WITHOUT_FINAL_RESULT;
            case 9:
                return UNEXPECTED_END_OF_CONVERSATION_DELTA_STREAM;
            case 10:
                return SPEECH_RECOGNITION_EMPTY_FINAL_RESULT;
            case 11:
                return INVALID_REQUEST;
            case 12:
                return PREFETCH_FAILED_QUEUE_CLOSED;
            case 13:
                return SPEECH_RECOGNITION_S3_GENERIC_ERROR;
            case 14:
                return SPEECH_RECOGNITION_S3_IO_EXCEPTION;
            case 15:
                return SPEECH_RECOGNITION_S3_GRPC_UNAVAILABLE;
            case 16:
                return SPEECH_RECOGNITION_S3_GRPC_CANCELLED;
            case 17:
                return SPEECH_RECOGNITION_S3_GRPC_INVALID_ARGUMENT;
            case 18:
                return INVALID_ENDPOINTER_AUDIO_CONFIG;
            case 20:
                return ARBITRATION_LOST;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f178022v;
    }

    public final String toString() {
        return Integer.toString(this.f178022v);
    }
}
