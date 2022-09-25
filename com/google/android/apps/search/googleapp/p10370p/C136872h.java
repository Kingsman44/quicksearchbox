package com.google.android.apps.search.googleapp.p10370p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5145v.C65913q;

/* renamed from: com.google.android.apps.search.googleapp.p.h */
/* compiled from: PG */
public final class C136872h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136872h f372531d;

    /* renamed from: e */
    private static volatile C63010eb f372532e;

    /* renamed from: a */
    public int f372533a;

    /* renamed from: b */
    public int f372534b;

    /* renamed from: c */
    public int f372535c;

    static {
        C136872h hVar = new C136872h();
        f372531d = hVar;
        C62942bv.registerDefaultInstance(C136872h.class, hVar);
    }

    private C136872h() {
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
                return newMessageInfo(f372531d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C65913q.m96826b(), C45240c.f118157a});
            case 3:
                return new C136872h();
            case 4:
                return new C136871g();
            case 5:
                return f372531d;
            case 6:
                C63010eb ebVar = f372532e;
                if (ebVar == null) {
                    synchronized (C136872h.class) {
                        ebVar = f372532e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372531d);
                            f372532e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
