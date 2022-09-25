package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.ad.d.b.ab */
/* compiled from: PG */
public enum C48667ab implements C62957cd {
    UNSPECIFIED_MIX_ADJUSTER(0),
    DUPLICATE_SUGGESTIONS_SUPPRESSOR(1),
    TAPAS_SUGGESTIONS_TRUNCATOR(2),
    REFLECTION_SUGGESTION_ADJUSTER(3),
    REFLECTION_SUGGESTIONS_ADJUSTER(4),
    LOW_SCORE_SUPPRESSOR(5),
    CORTEX_SCORE_ADJUSTER(6),
    ZERO_STATE_ADJUSTER(8),
    ENTITY_TYPE_ADJUSTER(9),
    PERSONAL_PUBLIC_QUERY_ADJUSTER(10),
    COMMS_SOURCE_ADJUSTER(11),
    CONTEXTUAL_SUPPRESSOR(12),
    OFFLINE_CLIENT_SUPPRESSOR(13),
    HOME_AUTOMATION_ADJUSTER(14),
    TAPAS_APP_ACTIONS_SLICE_ADJUSTER(15),
    TF_TRIGGERING_ADJUSTER(16),
    NG3_SCORE_ADJUSTER(17);
    

    /* renamed from: r */
    public final int f125795r;

    private C48667ab(int i) {
        this.f125795r = i;
    }

    /* renamed from: a */
    public static C48667ab m85252a(String str) {
        return (C48667ab) Enum.valueOf(C48667ab.class, str);
    }

    /* renamed from: b */
    public static C48667ab m85253b(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_MIX_ADJUSTER;
            case 1:
                return DUPLICATE_SUGGESTIONS_SUPPRESSOR;
            case 2:
                return TAPAS_SUGGESTIONS_TRUNCATOR;
            case 3:
                return REFLECTION_SUGGESTION_ADJUSTER;
            case 4:
                return REFLECTION_SUGGESTIONS_ADJUSTER;
            case 5:
                return LOW_SCORE_SUPPRESSOR;
            case 6:
                return CORTEX_SCORE_ADJUSTER;
            case 8:
                return ZERO_STATE_ADJUSTER;
            case 9:
                return ENTITY_TYPE_ADJUSTER;
            case 10:
                return PERSONAL_PUBLIC_QUERY_ADJUSTER;
            case 11:
                return COMMS_SOURCE_ADJUSTER;
            case 12:
                return CONTEXTUAL_SUPPRESSOR;
            case 13:
                return OFFLINE_CLIENT_SUPPRESSOR;
            case 14:
                return HOME_AUTOMATION_ADJUSTER;
            case 15:
                return TAPAS_APP_ACTIONS_SLICE_ADJUSTER;
            case 16:
                return TF_TRIGGERING_ADJUSTER;
            case 17:
                return NG3_SCORE_ADJUSTER;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m85254c() {
        return C48666aa.f125776a;
    }

    public final int getNumber() {
        return this.f125795r;
    }

    public final String toString() {
        return Integer.toString(this.f125795r);
    }
}
