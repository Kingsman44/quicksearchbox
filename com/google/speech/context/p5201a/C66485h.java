package com.google.speech.context.p5201a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.context.a.h */
/* compiled from: PG */
public final class C66485h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66485h f180782d;

    /* renamed from: e */
    private static volatile C63010eb f180783e;

    /* renamed from: a */
    public int f180784a;

    /* renamed from: b */
    public C66481d f180785b;

    /* renamed from: c */
    public C66483f f180786c;

    static {
        C66485h hVar = new C66485h();
        f180782d = hVar;
        C62942bv.registerDefaultInstance(C66485h.class, hVar);
    }

    private C66485h() {
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
                return newMessageInfo(f180782d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66485h();
            case 4:
                return new C66484g();
            case 5:
                return f180782d;
            case 6:
                C63010eb ebVar = f180783e;
                if (ebVar == null) {
                    synchronized (C66485h.class) {
                        ebVar = f180783e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180782d);
                            f180783e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
