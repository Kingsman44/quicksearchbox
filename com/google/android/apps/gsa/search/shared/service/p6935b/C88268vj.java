package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vj */
/* compiled from: PG */
public final class C88268vj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88268vj f238739e;

    /* renamed from: f */
    private static volatile C63010eb f238740f;

    /* renamed from: a */
    public int f238741a;

    /* renamed from: b */
    public int f238742b;

    /* renamed from: c */
    public int f238743c;

    /* renamed from: d */
    public boolean f238744d;

    static {
        C88268vj vjVar = new C88268vj();
        f238739e = vjVar;
        C62942bv.registerDefaultInstance(C88268vj.class, vjVar);
    }

    private C88268vj() {
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
                return newMessageInfo(f238739e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88268vj();
            case 4:
                return new C88267vi();
            case 5:
                return f238739e;
            case 6:
                C63010eb ebVar = f238740f;
                if (ebVar == null) {
                    synchronized (C88268vj.class) {
                        ebVar = f238740f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238739e);
                            f238740f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
