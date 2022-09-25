package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.c.a.cb */
/* compiled from: PG */
public enum C57404cb implements C62957cd {
    ERR_UNSPECIFIED(0),
    ERR_MISSING_SHARED_STATE(12),
    ERR_MISSING_TEMPLATE(5),
    ERR_DUPLICATE_TEMPLATE(6),
    ERR_MISSING_STYLESHEET(1),
    ERR_DUPLICATE_STYLESHEET(2),
    ERR_MISSING_STYLE(3),
    ERR_DUPLICATE_STYLE(4),
    ERR_MISSING_BINDING_VALUE(8),
    ERR_DUPLICATE_BINDING_VALUE(9),
    ERR_BINDING_VALUE_TYPE_MISMATCH(10),
    ERR_UNSUPPORTED_CONTEXT_FOR_BINDING(11),
    ERR_MISSING_FONTS(101),
    ERR_MISSING_IMAGE_URL(102),
    ERR_IMAGE_UNAVAILABLE(103),
    ERR_MISSING_CUSTOM_ELEMENT_RENDERER(104),
    ERR_INVALID_GRADIENT_DIRECTION(105),
    ERR_MISSING_ACTION_HANDLER(106),
    ERR_CONTENT_WIDTH_GRID_CELL_WITH_INVALID_CONTENT(107),
    ERR_GRID_CELL_WIDTH_WITHOUT_CONTENTS(108),
    ERR_INVALID_MEDIA_QUERY_CONDITION(109),
    ERR_MISSING_ELEMENT_CONTENTS(110),
    ERR_MISSING_OR_UNHANDLED_CONTENT(111),
    ERR_UNSUPPORTED_FEATURE(201),
    ERR_PROTO_TOO_LARGE(202),
    ERR_POOR_FRAME_RATE(203),
    ERR_CHUNKED_TEXT_WITH_SINGLE_CHUNK(204);
    

    /* renamed from: B */
    public final int f153363B;

    private C57404cb(int i) {
        this.f153363B = i;
    }

    /* renamed from: a */
    public static C57404cb m88345a(int i) {
        switch (i) {
            case 0:
                return ERR_UNSPECIFIED;
            case 1:
                return ERR_MISSING_STYLESHEET;
            case 2:
                return ERR_DUPLICATE_STYLESHEET;
            case 3:
                return ERR_MISSING_STYLE;
            case 4:
                return ERR_DUPLICATE_STYLE;
            case 5:
                return ERR_MISSING_TEMPLATE;
            case 6:
                return ERR_DUPLICATE_TEMPLATE;
            default:
                switch (i) {
                    case 8:
                        return ERR_MISSING_BINDING_VALUE;
                    case 9:
                        return ERR_DUPLICATE_BINDING_VALUE;
                    case 10:
                        return ERR_BINDING_VALUE_TYPE_MISMATCH;
                    case 11:
                        return ERR_UNSUPPORTED_CONTEXT_FOR_BINDING;
                    case 12:
                        return ERR_MISSING_SHARED_STATE;
                    default:
                        switch (i) {
                            case 101:
                                return ERR_MISSING_FONTS;
                            case 102:
                                return ERR_MISSING_IMAGE_URL;
                            case 103:
                                return ERR_IMAGE_UNAVAILABLE;
                            case 104:
                                return ERR_MISSING_CUSTOM_ELEMENT_RENDERER;
                            case 105:
                                return ERR_INVALID_GRADIENT_DIRECTION;
                            case 106:
                                return ERR_MISSING_ACTION_HANDLER;
                            case 107:
                                return ERR_CONTENT_WIDTH_GRID_CELL_WITH_INVALID_CONTENT;
                            case 108:
                                return ERR_GRID_CELL_WIDTH_WITHOUT_CONTENTS;
                            case 109:
                                return ERR_INVALID_MEDIA_QUERY_CONDITION;
                            case 110:
                                return ERR_MISSING_ELEMENT_CONTENTS;
                            case 111:
                                return ERR_MISSING_OR_UNHANDLED_CONTENT;
                            default:
                                switch (i) {
                                    case 201:
                                        return ERR_UNSUPPORTED_FEATURE;
                                    case 202:
                                        return ERR_PROTO_TOO_LARGE;
                                    case 203:
                                        return ERR_POOR_FRAME_RATE;
                                    case 204:
                                        return ERR_CHUNKED_TEXT_WITH_SINGLE_CHUNK;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m88346b() {
        return C57403ca.f153334a;
    }

    public final int getNumber() {
        return this.f153363B;
    }

    public final String toString() {
        return Integer.toString(this.f153363B);
    }
}
