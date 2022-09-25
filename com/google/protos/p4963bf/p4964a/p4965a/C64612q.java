package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.q */
/* compiled from: PG */
public final class C64612q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64612q f175161a;

    /* renamed from: b */
    private static volatile C63010eb f175162b;

    static {
        C64612q qVar = new C64612q();
        f175161a = qVar;
        C62942bv.registerDefaultInstance(C64612q.class, qVar);
    }

    private C64612q() {
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
                return newMessageInfo(f175161a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64612q();
            case 4:
                return new C64611p();
            case 5:
                return f175161a;
            case 6:
                C63010eb ebVar = f175162b;
                if (ebVar == null) {
                    synchronized (C64612q.class) {
                        ebVar = f175162b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175161a);
                            f175162b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
