package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ab */
/* compiled from: PG */
public final class C51668ab extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51668ab f134688a;

    /* renamed from: b */
    private static volatile C63010eb f134689b;

    static {
        C51668ab abVar = new C51668ab();
        f134688a = abVar;
        C62942bv.registerDefaultInstance(C51668ab.class, abVar);
    }

    private C51668ab() {
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
                return newMessageInfo(f134688a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51668ab();
            case 4:
                return new C51667aa();
            case 5:
                return f134688a;
            case 6:
                C63010eb ebVar = f134689b;
                if (ebVar == null) {
                    synchronized (C51668ab.class) {
                        ebVar = f134689b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134688a);
                            f134689b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
