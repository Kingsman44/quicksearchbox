package com.google.speech.p5195a.p5196a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.a.a.u */
/* compiled from: PG */
public final class C66441u extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66441u f180652b;

    /* renamed from: c */
    private static volatile C63010eb f180653c;

    /* renamed from: a */
    public C62971cq f180654a = emptyProtobufList();

    static {
        C66441u uVar = new C66441u();
        f180652b = uVar;
        C62942bv.registerDefaultInstance(C66441u.class, uVar);
    }

    private C66441u() {
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
                return newMessageInfo(f180652b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66439s.class});
            case 3:
                return new C66441u();
            case 4:
                return new C66440t();
            case 5:
                return f180652b;
            case 6:
                C63010eb ebVar = f180653c;
                if (ebVar == null) {
                    synchronized (C66441u.class) {
                        ebVar = f180653c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180652b);
                            f180653c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
