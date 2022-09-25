package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.xh */
/* compiled from: PG */
public final class C88320xh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88320xh f238846d;

    /* renamed from: e */
    private static volatile C63010eb f238847e;

    /* renamed from: a */
    public int f238848a;

    /* renamed from: b */
    public int f238849b;

    /* renamed from: c */
    public int f238850c = 1;

    static {
        C88320xh xhVar = new C88320xh();
        f238846d = xhVar;
        C62942bv.registerDefaultInstance(C88320xh.class, xhVar);
    }

    private C88320xh() {
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
                return newMessageInfo(f238846d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C88162rl.f238332a});
            case 3:
                return new C88320xh();
            case 4:
                return new C88319xg();
            case 5:
                return f238846d;
            case 6:
                C63010eb ebVar = f238847e;
                if (ebVar == null) {
                    synchronized (C88320xh.class) {
                        ebVar = f238847e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238846d);
                            f238847e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
