package com.google.protos.p4816ai.p4820d.p4829f.p4830a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.ai.d.f.a.b */
/* compiled from: PG */
public enum C63257b implements C62957cd {
    EXEC_NAME_UNKNOWN(0),
    EXEC_NAME_BASELINE_EVAL(1),
    EXEC_NAME_P13N_TRAIN(2),
    EXEC_NAME_P13N_TRAIN_PER_EPOCH(3),
    EXEC_NAME_P13N_EVAL(4),
    EXEC_NAME_REGRESSION_EVAL(5),
    EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA(6),
    EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA(7),
    EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL(8),
    EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL(9),
    EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL(10),
    EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL(11),
    EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL(12);
    

    /* renamed from: n */
    public final int f170933n;

    private C63257b(int i) {
        this.f170933n = i;
    }

    /* renamed from: a */
    public static C63257b m96214a(int i) {
        switch (i) {
            case 0:
                return EXEC_NAME_UNKNOWN;
            case 1:
                return EXEC_NAME_BASELINE_EVAL;
            case 2:
                return EXEC_NAME_P13N_TRAIN;
            case 3:
                return EXEC_NAME_P13N_TRAIN_PER_EPOCH;
            case 4:
                return EXEC_NAME_P13N_EVAL;
            case 5:
                return EXEC_NAME_REGRESSION_EVAL;
            case 6:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_TRAIN_DATA;
            case 7:
                return EXEC_NAME_EXTRA_EVALS_P13N_TRAIN_DATA;
            case 8:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_UNEDITED_EVAL;
            case 9:
                return EXEC_NAME_EXTRA_EVALS_P13N_UNEDITED_EVAL;
            case 10:
                return EXEC_NAME_EXTRA_EVALS_BASELINE_SPEECH_EVAL;
            case 11:
                return EXEC_NAME_EXTRA_EVALS_P13N_SPEECH_EVAL;
            case 12:
                return EXEC_NAME_EXTRA_EVALS_REGRESSION_SPEECH_EVAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96215b() {
        return C63256a.f170918a;
    }

    public final int getNumber() {
        return this.f170933n;
    }

    public final String toString() {
        return Integer.toString(this.f170933n);
    }
}
