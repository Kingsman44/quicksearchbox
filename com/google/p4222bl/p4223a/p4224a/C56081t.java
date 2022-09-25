package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.t */
/* compiled from: PG */
public final class C56081t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56081t f149421a;

    /* renamed from: b */
    private static volatile C63010eb f149422b;

    static {
        C56081t tVar = new C56081t();
        f149421a = tVar;
        C62942bv.registerDefaultInstance(C56081t.class, tVar);
    }

    private C56081t() {
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
                return newMessageInfo(f149421a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C56081t();
            case 4:
                return new C56080s();
            case 5:
                return f149421a;
            case 6:
                C63010eb ebVar = f149422b;
                if (ebVar == null) {
                    synchronized (C56081t.class) {
                        ebVar = f149422b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149421a);
                            f149422b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
