package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.kr */
/* compiled from: PG */
public final class C7807kr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C7807kr f27293c;

    /* renamed from: d */
    private static volatile C63010eb f27294d;

    /* renamed from: a */
    public int f27295a;

    /* renamed from: b */
    public C7805kp f27296b;

    static {
        C7807kr krVar = new C7807kr();
        f27293c = krVar;
        C62942bv.registerDefaultInstance(C7807kr.class, krVar);
    }

    private C7807kr() {
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
                return newMessageInfo(f27293c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C7807kr();
            case 4:
                return new C7806kq();
            case 5:
                return f27293c;
            case 6:
                C63010eb ebVar = f27294d;
                if (ebVar == null) {
                    synchronized (C7807kr.class) {
                        ebVar = f27294d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27293c);
                            f27294d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
