package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.l */
/* compiled from: PG */
public final class C56620l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56620l f151173c;

    /* renamed from: d */
    private static volatile C63010eb f151174d;

    /* renamed from: a */
    public int f151175a;

    /* renamed from: b */
    public boolean f151176b;

    static {
        C56620l lVar = new C56620l();
        f151173c = lVar;
        C62942bv.registerDefaultInstance(C56620l.class, lVar);
    }

    private C56620l() {
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
                return newMessageInfo(f151173c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56620l();
            case 4:
                return new C56619k();
            case 5:
                return f151173c;
            case 6:
                C63010eb ebVar = f151174d;
                if (ebVar == null) {
                    synchronized (C56620l.class) {
                        ebVar = f151174d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151173c);
                            f151174d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
