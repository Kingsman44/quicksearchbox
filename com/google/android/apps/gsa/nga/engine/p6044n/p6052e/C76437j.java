package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.j */
/* compiled from: PG */
public enum C76437j {
    NOT,
    ANY_OF,
    ALL_OF,
    IS_REWRITE,
    IS_ONE_WORD,
    IS_WHOLE_QUERY_ONE_ARGUMENT,
    FLAG_VALUE,
    ARGUMENT_VALUE,
    ARGUMENT_EXTENDABLE,
    CONDITION_NOT_SET;

    /* renamed from: a */
    public static C76437j m123054a(int i) {
        if (i == 0) {
            return CONDITION_NOT_SET;
        }
        if (i == 251) {
            return FLAG_VALUE;
        }
        if (i == 301) {
            return ARGUMENT_VALUE;
        }
        if (i == 302) {
            return ARGUMENT_EXTENDABLE;
        }
        switch (i) {
            case 101:
                return NOT;
            case 102:
                return ANY_OF;
            case 103:
                return ALL_OF;
            default:
                switch (i) {
                    case 201:
                        return IS_REWRITE;
                    case 202:
                        return IS_ONE_WORD;
                    case 203:
                        return IS_WHOLE_QUERY_ONE_ARGUMENT;
                    default:
                        return null;
                }
        }
    }
}
