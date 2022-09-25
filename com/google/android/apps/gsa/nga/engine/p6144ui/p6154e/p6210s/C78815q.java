package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.s.q */
/* compiled from: PG */
public final class C78815q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C78815q f216927d;

    /* renamed from: e */
    private static volatile C63010eb f216928e;

    /* renamed from: a */
    public int f216929a = 0;

    /* renamed from: b */
    public Object f216930b;

    /* renamed from: c */
    public boolean f216931c;

    static {
        C78815q qVar = new C78815q();
        f216927d = qVar;
        C62942bv.registerDefaultInstance(C78815q.class, qVar);
    }

    private C78815q() {
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
                return newMessageInfo(f216927d, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", C45240c.f118157a, C78803e.class, C78814p.class, C78809k.class, C78806h.class, C78798b.class, C78812n.class});
            case 3:
                return new C78815q();
            case 4:
                return new C78801c();
            case 5:
                return f216927d;
            case 6:
                C63010eb ebVar = f216928e;
                if (ebVar == null) {
                    synchronized (C78815q.class) {
                        ebVar = f216928e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216927d);
                            f216928e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
