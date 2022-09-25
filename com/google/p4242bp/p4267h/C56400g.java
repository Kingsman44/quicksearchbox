package com.google.p4242bp.p4267h;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.h.g */
/* compiled from: PG */
public final class C56400g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56400g f150414a;

    /* renamed from: c */
    private static volatile C63010eb f150415c;

    /* renamed from: b */
    private C62995dn f150416b = C62995dn.f170057a;

    static {
        C56400g gVar = new C56400g();
        f150414a = gVar;
        C62942bv.registerDefaultInstance(C56400g.class, gVar);
    }

    private C56400g() {
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
                return newMessageInfo(f150414a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C56396c.f150411a});
            case 3:
                return new C56400g();
            case 4:
                return new C56397d();
            case 5:
                return f150414a;
            case 6:
                C63010eb ebVar = f150415c;
                if (ebVar == null) {
                    synchronized (C56400g.class) {
                        ebVar = f150415c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150414a);
                            f150415c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
