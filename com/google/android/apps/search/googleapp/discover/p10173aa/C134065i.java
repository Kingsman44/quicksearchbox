package com.google.android.apps.search.googleapp.discover.p10173aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.aa.i */
/* compiled from: PG */
public final class C134065i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C134065i f365197e;

    /* renamed from: f */
    private static volatile C63010eb f365198f;

    /* renamed from: a */
    public int f365199a;

    /* renamed from: b */
    public int f365200b;

    /* renamed from: c */
    public C63042fg f365201c;

    /* renamed from: d */
    public C62910ar f365202d;

    static {
        C134065i iVar = new C134065i();
        f365197e = iVar;
        C62942bv.registerDefaultInstance(C134065i.class, iVar);
    }

    private C134065i() {
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
                return newMessageInfo(f365197e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C134064h.m217477b(), C45240c.f118157a, "d"});
            case 3:
                return new C134065i();
            case 4:
                return new C134062f();
            case 5:
                return f365197e;
            case 6:
                C63010eb ebVar = f365198f;
                if (ebVar == null) {
                    synchronized (C134065i.class) {
                        ebVar = f365198f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f365197e);
                            f365198f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
