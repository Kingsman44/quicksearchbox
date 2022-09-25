package com.google.protos.p5132q;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.q.p */
/* compiled from: PG */
public enum C65873p implements C62957cd {
    WORD(0),
    SPAN(1),
    LINE(2),
    PARAGRAPH(3),
    BLOCK(4),
    SYMBOL(5),
    PAGE(6),
    DOCUMENT(7),
    TABLE(8),
    TABLE_ROW(9),
    TABLE_COLUMN(10),
    TABLE_CELL(11),
    BRANCH(12),
    LOGICAL_ENTITY(13);
    

    /* renamed from: o */
    private final int f179079o;

    private C65873p(int i) {
        this.f179079o = i;
    }

    /* renamed from: a */
    public static C65873p m96817a(int i) {
        switch (i) {
            case 0:
                return WORD;
            case 1:
                return SPAN;
            case 2:
                return LINE;
            case 3:
                return PARAGRAPH;
            case 4:
                return BLOCK;
            case 5:
                return SYMBOL;
            case 6:
                return PAGE;
            case 7:
                return DOCUMENT;
            case 8:
                return TABLE;
            case 9:
                return TABLE_ROW;
            case 10:
                return TABLE_COLUMN;
            case 11:
                return TABLE_CELL;
            case 12:
                return BRANCH;
            case 13:
                return LOGICAL_ENTITY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96818b() {
        return C65872o.f179063a;
    }

    public final int getNumber() {
        return this.f179079o;
    }

    public final String toString() {
        return Integer.toString(this.f179079o);
    }
}
