package p5285d.p5286a.p5287a.p5288a.p5289a;

import com.google.protobuf.C62957cd;

/* renamed from: d.a.a.a.a.o */
/* compiled from: PG */
public enum C68122o implements C62957cd {
    SPEAKR_ITEM_STATE_UNKNOWN(0),
    SPEAKR_ITEM_STATE_FULLY_READ(1),
    SPEAKR_ITEM_STATE_PARTIALLY_READ(2),
    SPEAKR_ITEM_STATE_UNREAD(3),
    SPEAKR_ITEM_STATE_ARCHIVED(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f184383g;

    private C68122o(int i) {
        this.f184383g = i;
    }

    /* renamed from: a */
    public static C68122o m98452a(int i) {
        if (i == 0) {
            return SPEAKR_ITEM_STATE_UNKNOWN;
        }
        if (i == 1) {
            return SPEAKR_ITEM_STATE_FULLY_READ;
        }
        if (i == 2) {
            return SPEAKR_ITEM_STATE_PARTIALLY_READ;
        }
        if (i == 3) {
            return SPEAKR_ITEM_STATE_UNREAD;
        }
        if (i != 4) {
            return null;
        }
        return SPEAKR_ITEM_STATE_ARCHIVED;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f184383g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
