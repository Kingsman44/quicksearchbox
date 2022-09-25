package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.search.c.fa */
/* compiled from: PG */
public enum C37589fa implements C62957cd {
    OUTCOME_UNKNOWN_BUFFER_AUDIO(0),
    OUTCOME_BUFFER_CLOSED(1),
    OUTCOME_BUFFER_OVERFLOW(2),
    OUTCOME_BUFFER_COUNTER_OVERFLOW(3),
    OUTCOME_BUFFER_READ_ERROR(4),
    OUTCOME_BUFFER_READ_IOEXCEPTION(5),
    OUTCOME_BUFFER_COPY_INTERRUPTED(6),
    OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED(100),
    OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED_WITH_OFFSET(101),
    OUTCOME_AUDIO_BYTES_RECEIVER_BYTES_DISPOSED(102),
    OUTCOME_AUDIO_BYTES_RECEIVER_WITH_OFFSET_BYTES_DISPOSED(103);
    

    /* renamed from: l */
    public final int f99887l;

    private C37589fa(int i) {
        this.f99887l = i;
    }

    /* renamed from: a */
    public static C37589fa m66582a(int i) {
        switch (i) {
            case 0:
                return OUTCOME_UNKNOWN_BUFFER_AUDIO;
            case 1:
                return OUTCOME_BUFFER_CLOSED;
            case 2:
                return OUTCOME_BUFFER_OVERFLOW;
            case 3:
                return OUTCOME_BUFFER_COUNTER_OVERFLOW;
            case 4:
                return OUTCOME_BUFFER_READ_ERROR;
            case 5:
                return OUTCOME_BUFFER_READ_IOEXCEPTION;
            case 6:
                return OUTCOME_BUFFER_COPY_INTERRUPTED;
            default:
                switch (i) {
                    case 100:
                        return OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED;
                    case 101:
                        return OUTCOME_AUDIO_BYTES_RECEIVER_REGISTERED_WITH_OFFSET;
                    case 102:
                        return OUTCOME_AUDIO_BYTES_RECEIVER_BYTES_DISPOSED;
                    case 103:
                        return OUTCOME_AUDIO_BYTES_RECEIVER_WITH_OFFSET_BYTES_DISPOSED;
                    default:
                        return null;
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m66583b() {
        return C37585ez.f99869a;
    }

    public final int getNumber() {
        return this.f99887l;
    }

    public final String toString() {
        return Integer.toString(this.f99887l);
    }
}
