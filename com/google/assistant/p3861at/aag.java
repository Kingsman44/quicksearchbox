package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aag */
/* compiled from: PG */
public final class aag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final aag f128695b;

    /* renamed from: c */
    private static volatile C63010eb f128696c;

    /* renamed from: a */
    public C62995dn f128697a = C62995dn.f170057a;

    static {
        aag aag = new aag();
        f128695b = aag;
        C62942bv.registerDefaultInstance(aag.class, aag);
    }

    private aag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f128695b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", aaf.f128694a});
            case 3:
                return new aag();
            case 4:
                return new aae();
            case 5:
                return f128695b;
            case 6:
                C63010eb ebVar = f128696c;
                if (ebVar == null) {
                    synchronized (aag.class) {
                        ebVar = f128696c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128695b);
                            f128696c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
