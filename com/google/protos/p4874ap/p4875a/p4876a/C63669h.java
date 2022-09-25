package com.google.protos.p4874ap.p4875a.p4876a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.protos.ap.a.a.h */
/* compiled from: PG */
public final class C63669h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63669h f172158e;

    /* renamed from: g */
    private static volatile C63010eb f172159g;

    /* renamed from: a */
    public int f172160a;

    /* renamed from: b */
    public int f172161b;

    /* renamed from: c */
    public int f172162c;

    /* renamed from: d */
    public boolean f172163d;

    /* renamed from: f */
    private int f172164f;

    static {
        C63669h hVar = new C63669h();
        f172158e = hVar;
        C62942bv.registerDefaultInstance(C63669h.class, hVar);
    }

    private C63669h() {
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
                return newMessageInfo(f172158e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{C10662f.f35572a, "a", C65753ak.m96798c(), "b", C63659a.f172140a, C45240c.f118157a, "d"});
            case 3:
                return new C63669h();
            case 4:
                return new C63668g();
            case 5:
                return f172158e;
            case 6:
                C63010eb ebVar = f172159g;
                if (ebVar == null) {
                    synchronized (C63669h.class) {
                        ebVar = f172159g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172158e);
                            f172159g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
