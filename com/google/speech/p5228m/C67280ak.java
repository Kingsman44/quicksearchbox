package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ak */
/* compiled from: PG */
public final class C67280ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67280ak f182882c;

    /* renamed from: e */
    private static volatile C63010eb f182883e;

    /* renamed from: a */
    public int f182884a;

    /* renamed from: b */
    public C67276ag f182885b;

    /* renamed from: d */
    private int f182886d;

    static {
        C67280ak akVar = new C67280ak();
        f182882c = akVar;
        C62942bv.registerDefaultInstance(C67280ak.class, akVar);
    }

    private C67280ak() {
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
                return newMessageInfo(f182882c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", C67277ah.f182881a, "b"});
            case 3:
                return new C67280ak();
            case 4:
                return new C67279aj();
            case 5:
                return f182882c;
            case 6:
                C63010eb ebVar = f182883e;
                if (ebVar == null) {
                    synchronized (C67280ak.class) {
                        ebVar = f182883e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182882c);
                            f182883e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
