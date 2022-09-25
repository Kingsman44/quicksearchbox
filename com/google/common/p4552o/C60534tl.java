package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.tl */
/* compiled from: PG */
public enum C60534tl implements C62957cd {
    COMMIT(1),
    MIC_CLOSE(2),
    END_OF_SPEECH(3),
    APPLICATION_CREATE(4),
    ACTIVITY_CREATE(5),
    SEARCH_INTENT(6),
    QUERY_FORMULATION_START(7),
    E2E_START(8),
    SUBMIT(9),
    EXTERNAL_SEARCH_START(10),
    NOW_REFRESH_INTENT(11),
    NOW_NETWORK_REQUEST(12),
    NOW_LOADING_RESPONSE(15),
    NOW_PARSING_RESPONSE(13),
    NOW_CARD_RENDERING(14),
    NOW_FIRST_CLUSTER_RENDERING(16),
    INLINE_VIDEO_PLAYER_INIT(17),
    INLINE_VIDEO_IMPRESSED(18),
    INLINE_VIDEO_LOAD(19),
    INLINE_VIDEO_UP_LOAD(20),
    INLINE_VIDEO_PLAY(21);
    

    /* renamed from: v */
    public final int f163948v;

    private C60534tl(int i) {
        this.f163948v = i;
    }

    /* renamed from: a */
    public static C60534tl m92605a(int i) {
        switch (i) {
            case 1:
                return COMMIT;
            case 2:
                return MIC_CLOSE;
            case 3:
                return END_OF_SPEECH;
            case 4:
                return APPLICATION_CREATE;
            case 5:
                return ACTIVITY_CREATE;
            case 6:
                return SEARCH_INTENT;
            case 7:
                return QUERY_FORMULATION_START;
            case 8:
                return E2E_START;
            case 9:
                return SUBMIT;
            case 10:
                return EXTERNAL_SEARCH_START;
            case 11:
                return NOW_REFRESH_INTENT;
            case 12:
                return NOW_NETWORK_REQUEST;
            case 13:
                return NOW_PARSING_RESPONSE;
            case 14:
                return NOW_CARD_RENDERING;
            case 15:
                return NOW_LOADING_RESPONSE;
            case 16:
                return NOW_FIRST_CLUSTER_RENDERING;
            case 17:
                return INLINE_VIDEO_PLAYER_INIT;
            case 18:
                return INLINE_VIDEO_IMPRESSED;
            case 19:
                return INLINE_VIDEO_LOAD;
            case 20:
                return INLINE_VIDEO_UP_LOAD;
            case 21:
                return INLINE_VIDEO_PLAY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92606b() {
        return C60533tk.f163925a;
    }

    public final int getNumber() {
        return this.f163948v;
    }

    public final String toString() {
        return Integer.toString(this.f163948v);
    }
}
