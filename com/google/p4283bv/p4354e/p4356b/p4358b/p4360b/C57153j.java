package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.j */
/* compiled from: PG */
public final class C57153j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57153j f152578c;

    /* renamed from: d */
    private static volatile C63010eb f152579d;

    /* renamed from: a */
    public int f152580a = 0;

    /* renamed from: b */
    public Object f152581b;

    static {
        C57153j jVar = new C57153j();
        f152578c = jVar;
        C62942bv.registerDefaultInstance(C57153j.class, jVar);
    }

    private C57153j() {
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
                return newMessageInfo(f152578c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C57129am.f152499a, C57132ap.class, C57159p.class});
            case 3:
                return new C57153j();
            case 4:
                return new C57152i();
            case 5:
                return f152578c;
            case 6:
                C63010eb ebVar = f152579d;
                if (ebVar == null) {
                    synchronized (C57153j.class) {
                        ebVar = f152579d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152578c);
                            f152579d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
