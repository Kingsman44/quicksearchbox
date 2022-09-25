package com.google.android.apps.gsa.nga.engine.p6044n.p6052e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.k */
/* compiled from: PG */
public final class C76438k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C76438k f211603c;

    /* renamed from: d */
    private static volatile C63010eb f211604d;

    /* renamed from: a */
    public int f211605a = 0;

    /* renamed from: b */
    public Object f211606b;

    static {
        C76438k kVar = new C76438k();
        f211603c = kVar;
        C62942bv.registerDefaultInstance(C76438k.class, kVar);
    }

    private C76438k() {
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
                return newMessageInfo(f211603c, "\u0001\t\u0001\u0000eĮ\t\u0000\u0000\u0000eြ\u0000fြ\u0000gြ\u0000Éြ\u0000Êြ\u0000Ëြ\u0000ûြ\u0000ĭြ\u0000Įြ\u0000", new Object[]{"b", "a", C76438k.class, C76440m.class, C76440m.class, C76446s.class, C76444q.class, C76448u.class, C76442o.class, C76435h.class, C76433f.class});
            case 3:
                return new C76438k();
            case 4:
                return new C76436i();
            case 5:
                return f211603c;
            case 6:
                C63010eb ebVar = f211604d;
                if (ebVar == null) {
                    synchronized (C76438k.class) {
                        ebVar = f211604d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211603c);
                            f211604d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
