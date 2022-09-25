package com.google.android.apps.gsa.shared.p6990an;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.an.i */
/* compiled from: PG */
public final class C89218i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89218i f241900e;

    /* renamed from: g */
    private static volatile C63010eb f241901g;

    /* renamed from: a */
    public int f241902a;

    /* renamed from: b */
    public long f241903b;

    /* renamed from: c */
    public long f241904c;

    /* renamed from: d */
    public int f241905d;

    /* renamed from: f */
    private int f241906f;

    static {
        C89218i iVar = new C89218i();
        f241900e = iVar;
        C62942bv.registerDefaultInstance(C89218i.class, iVar);
    }

    private C89218i() {
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
                return newMessageInfo(f241900e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{C10662f.f35572a, "a", C89220k.f241907a, "b", C45240c.f118157a, "d"});
            case 3:
                return new C89218i();
            case 4:
                return new C89217h();
            case 5:
                return f241900e;
            case 6:
                C63010eb ebVar = f241901g;
                if (ebVar == null) {
                    synchronized (C89218i.class) {
                        ebVar = f241901g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241900e);
                            f241901g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
