package com.google.protos.p4985f.p5023n.p5024a.p5025a.p5026a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.f.n.a.a.a.h */
/* compiled from: PG */
public enum C64963h implements C62957cd {
    UNSPECIFIED(0),
    SET_FIELD(1),
    LIST_SELECTION(2),
    RELATIVE_SET_FIELD(3),
    REJECT_FIELD_VALUES(4),
    APPEND_TO_FIELD(5),
    REMOVE_FROM_FIELD(6),
    RELATIVE_LIST_SELECTION(7);
    

    /* renamed from: i */
    public final int f175936i;

    private C64963h(int i) {
        this.f175936i = i;
    }

    /* renamed from: a */
    public static C64963h m96486a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return SET_FIELD;
            case 2:
                return LIST_SELECTION;
            case 3:
                return RELATIVE_SET_FIELD;
            case 4:
                return REJECT_FIELD_VALUES;
            case 5:
                return APPEND_TO_FIELD;
            case 6:
                return REMOVE_FROM_FIELD;
            case 7:
                return RELATIVE_LIST_SELECTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96487b() {
        return C64962g.f175926a;
    }

    public final int getNumber() {
        return this.f175936i;
    }

    public final String toString() {
        return Integer.toString(this.f175936i);
    }
}
