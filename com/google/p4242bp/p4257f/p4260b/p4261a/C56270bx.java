package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.bx */
/* compiled from: PG */
public final class C56270bx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56270bx f149966a;

    /* renamed from: b */
    private static volatile C63010eb f149967b;

    static {
        C56270bx bxVar = new C56270bx();
        f149966a = bxVar;
        C62942bv.registerDefaultInstance(C56270bx.class, bxVar);
    }

    private C56270bx() {
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
                return newMessageInfo(f149966a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56270bx();
            case 4:
                return new C56269bw();
            case 5:
                return f149966a;
            case 6:
                C63010eb ebVar = f149967b;
                if (ebVar == null) {
                    synchronized (C56270bx.class) {
                        ebVar = f149967b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149966a);
                            f149967b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
