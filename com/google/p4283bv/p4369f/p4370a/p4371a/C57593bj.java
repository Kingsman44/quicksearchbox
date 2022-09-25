package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bj */
/* compiled from: PG */
public final class C57593bj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57593bj f153862a;

    /* renamed from: b */
    private static volatile C63010eb f153863b;

    static {
        C57593bj bjVar = new C57593bj();
        f153862a = bjVar;
        C62942bv.registerDefaultInstance(C57593bj.class, bjVar);
    }

    private C57593bj() {
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
                return newMessageInfo(f153862a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57593bj();
            case 4:
                return new C57592bi();
            case 5:
                return f153862a;
            case 6:
                C63010eb ebVar = f153863b;
                if (ebVar == null) {
                    synchronized (C57593bj.class) {
                        ebVar = f153863b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153862a);
                            f153863b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
