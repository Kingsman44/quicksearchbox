package com.google.android.libraries.assistant.p1594s.p1597b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48670ae;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.am */
/* compiled from: PG */
public final class C19152am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C19152am f53639d;

    /* renamed from: e */
    private static volatile C63010eb f53640e;

    /* renamed from: a */
    public int f53641a;

    /* renamed from: b */
    public int f53642b;

    /* renamed from: c */
    public int f53643c;

    static {
        C19152am amVar = new C19152am();
        f53639d = amVar;
        C62942bv.registerDefaultInstance(C19152am.class, amVar);
    }

    private C19152am() {
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
                return newMessageInfo(f53639d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C48670ae.m85257b(), C45240c.f118157a});
            case 3:
                return new C19152am();
            case 4:
                return new C19151al();
            case 5:
                return f53639d;
            case 6:
                C63010eb ebVar = f53640e;
                if (ebVar == null) {
                    synchronized (C19152am.class) {
                        ebVar = f53640e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53639d);
                            f53640e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
