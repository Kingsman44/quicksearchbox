package com.google.android.libraries.lens.view.p2069am;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.g */
/* compiled from: PG */
public final class C25331g extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C25331g f68937g;

    /* renamed from: h */
    private static volatile C63010eb f68938h;

    /* renamed from: a */
    public float f68939a;

    /* renamed from: b */
    public float f68940b;

    /* renamed from: c */
    public float f68941c;

    /* renamed from: d */
    public float f68942d;

    /* renamed from: e */
    public float f68943e;

    /* renamed from: f */
    public float f68944f;

    static {
        C25331g gVar = new C25331g();
        f68937g = gVar;
        C62942bv.registerDefaultInstance(C25331g.class, gVar);
    }

    private C25331g() {
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
                return newMessageInfo(f68937g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C25331g();
            case 4:
                return new C25330f();
            case 5:
                return f68937g;
            case 6:
                C63010eb ebVar = f68938h;
                if (ebVar == null) {
                    synchronized (C25331g.class) {
                        ebVar = f68938h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68937g);
                            f68938h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
