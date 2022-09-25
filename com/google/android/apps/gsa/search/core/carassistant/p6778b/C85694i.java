package com.google.android.apps.gsa.search.core.carassistant.p6778b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.b.i */
/* compiled from: PG */
public final class C85694i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C85694i f231729e;

    /* renamed from: f */
    private static volatile C63010eb f231730f;

    /* renamed from: a */
    public int f231731a;

    /* renamed from: b */
    public int f231732b = 0;

    /* renamed from: c */
    public Object f231733c;

    /* renamed from: d */
    public int f231734d;

    static {
        C85694i iVar = new C85694i();
        f231729e = iVar;
        C62942bv.registerDefaultInstance(C85694i.class, iVar);
    }

    private C85694i() {
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
                return newMessageInfo(f231729e, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C85697l.class});
            case 3:
                return new C85694i();
            case 4:
                return new C85693h();
            case 5:
                return f231729e;
            case 6:
                C63010eb ebVar = f231730f;
                if (ebVar == null) {
                    synchronized (C85694i.class) {
                        ebVar = f231730f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231729e);
                            f231730f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
