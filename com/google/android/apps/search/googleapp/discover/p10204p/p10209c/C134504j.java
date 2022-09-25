package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.j */
/* compiled from: PG */
public final class C134504j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C134504j f366294b;

    /* renamed from: c */
    private static volatile C63010eb f366295c;

    /* renamed from: a */
    public C62971cq f366296a = emptyProtobufList();

    static {
        C134504j jVar = new C134504j();
        f366294b = jVar;
        C62942bv.registerDefaultInstance(C134504j.class, jVar);
    }

    private C134504j() {
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
                return newMessageInfo(f366294b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C134502h.class});
            case 3:
                return new C134504j();
            case 4:
                return new C134503i();
            case 5:
                return f366294b;
            case 6:
                C63010eb ebVar = f366295c;
                if (ebVar == null) {
                    synchronized (C134504j.class) {
                        ebVar = f366295c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366294b);
                            f366295c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
