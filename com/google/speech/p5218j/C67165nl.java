package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.nl */
/* compiled from: PG */
public final class C67165nl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67165nl f182559d;

    /* renamed from: e */
    private static volatile C63010eb f182560e;

    /* renamed from: a */
    public int f182561a;

    /* renamed from: b */
    public int f182562b;

    /* renamed from: c */
    public C66946fi f182563c;

    static {
        C67165nl nlVar = new C67165nl();
        f182559d = nlVar;
        C62942bv.registerDefaultInstance(C67165nl.class, nlVar);
    }

    private C67165nl() {
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
                return newMessageInfo(f182559d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002", new Object[]{"a", "b", C67163nj.f182558a, C45240c.f118157a});
            case 3:
                return new C67165nl();
            case 4:
                return new C67162ni();
            case 5:
                return f182559d;
            case 6:
                C63010eb ebVar = f182560e;
                if (ebVar == null) {
                    synchronized (C67165nl.class) {
                        ebVar = f182560e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182559d);
                            f182560e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
