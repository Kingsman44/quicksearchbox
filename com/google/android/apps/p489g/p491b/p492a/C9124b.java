package com.google.android.apps.p489g.p491b.p492a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.b.a.b */
/* compiled from: PG */
public final class C9124b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C9124b f31408b;

    /* renamed from: d */
    private static volatile C63010eb f31409d;

    /* renamed from: a */
    public int f31410a;

    /* renamed from: c */
    private int f31411c;

    static {
        C9124b bVar = new C9124b();
        f31408b = bVar;
        C62942bv.registerDefaultInstance(C9124b.class, bVar);
    }

    private C9124b() {
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
                return newMessageInfo(f31408b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C9124b();
            case 4:
                return new C9123a();
            case 5:
                return f31408b;
            case 6:
                C63010eb ebVar = f31409d;
                if (ebVar == null) {
                    synchronized (C9124b.class) {
                        ebVar = f31409d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31408b);
                            f31409d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
