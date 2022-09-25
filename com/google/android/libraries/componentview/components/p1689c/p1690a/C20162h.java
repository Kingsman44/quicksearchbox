package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.h */
/* compiled from: PG */
public final class C20162h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C20162h f56559d;

    /* renamed from: e */
    private static volatile C63010eb f56560e;

    /* renamed from: a */
    public int f56561a;

    /* renamed from: b */
    public C20166l f56562b;

    /* renamed from: c */
    public C20164j f56563c;

    static {
        C20162h hVar = new C20162h();
        f56559d = hVar;
        C62942bv.registerDefaultInstance(C20162h.class, hVar);
    }

    private C20162h() {
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
                return newMessageInfo(f56559d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C20162h();
            case 4:
                return new C20161g();
            case 5:
                return f56559d;
            case 6:
                C63010eb ebVar = f56560e;
                if (ebVar == null) {
                    synchronized (C20162h.class) {
                        ebVar = f56560e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56559d);
                            f56560e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
