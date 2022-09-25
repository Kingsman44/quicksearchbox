package com.google.p4283bv.p4287b.p4288a.p4289a.p4311p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.p.d */
/* compiled from: PG */
public final class C56786d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56786d f151531d;

    /* renamed from: e */
    private static volatile C63010eb f151532e;

    /* renamed from: a */
    public int f151533a;

    /* renamed from: b */
    public int f151534b;

    /* renamed from: c */
    public int f151535c;

    static {
        C56786d dVar = new C56786d();
        f151531d = dVar;
        C62942bv.registerDefaultInstance(C56786d.class, dVar);
    }

    private C56786d() {
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
                return newMessageInfo(f151531d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C56786d();
            case 4:
                return new C56785c();
            case 5:
                return f151531d;
            case 6:
                C63010eb ebVar = f151532e;
                if (ebVar == null) {
                    synchronized (C56786d.class) {
                        ebVar = f151532e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151531d);
                            f151532e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
