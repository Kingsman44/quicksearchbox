package com.google.speech.p5195a.p5196a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.a.a.k */
/* compiled from: PG */
public final class C66431k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66431k f180631c;

    /* renamed from: d */
    private static volatile C63010eb f180632d;

    /* renamed from: a */
    public int f180633a;

    /* renamed from: b */
    public C63088z f180634b = C63088z.f170246b;

    static {
        C66431k kVar = new C66431k();
        f180631c = kVar;
        C62942bv.registerDefaultInstance(C66431k.class, kVar);
    }

    private C66431k() {
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
                return newMessageInfo(f180631c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C66431k();
            case 4:
                return new C66430j();
            case 5:
                return f180631c;
            case 6:
                C63010eb ebVar = f180632d;
                if (ebVar == null) {
                    synchronized (C66431k.class) {
                        ebVar = f180632d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180631c);
                            f180632d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
