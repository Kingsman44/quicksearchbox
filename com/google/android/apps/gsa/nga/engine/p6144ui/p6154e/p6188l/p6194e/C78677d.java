package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.d */
/* compiled from: PG */
public final class C78677d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C78677d f216596b;

    /* renamed from: d */
    private static volatile C63010eb f216597d;

    /* renamed from: a */
    public C78680g f216598a;

    /* renamed from: c */
    private int f216599c;

    static {
        C78677d dVar = new C78677d();
        f216596b = dVar;
        C62942bv.registerDefaultInstance(C78677d.class, dVar);
    }

    private C78677d() {
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
                return newMessageInfo(f216596b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C78677d();
            case 4:
                return new C78676c();
            case 5:
                return f216596b;
            case 6:
                C63010eb ebVar = f216597d;
                if (ebVar == null) {
                    synchronized (C78677d.class) {
                        ebVar = f216597d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f216596b);
                            f216597d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
