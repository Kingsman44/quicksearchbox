package com.google.android.apps.gsa.shared.p6970ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ab.j */
/* compiled from: PG */
public final class C89080j extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C89080j f241408e;

    /* renamed from: f */
    private static volatile C63010eb f241409f;

    /* renamed from: a */
    public int f241410a;

    /* renamed from: b */
    public int f241411b;

    /* renamed from: c */
    public int f241412c = -1;

    /* renamed from: d */
    public C89082l f241413d;

    static {
        C89080j jVar = new C89080j();
        f241408e = jVar;
        C62942bv.registerDefaultInstance(C89080j.class, jVar);
    }

    private C89080j() {
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
                return newMessageInfo(f241408e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C89080j();
            case 4:
                return new C89079i();
            case 5:
                return f241408e;
            case 6:
                C63010eb ebVar = f241409f;
                if (ebVar == null) {
                    synchronized (C89080j.class) {
                        ebVar = f241409f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241408e);
                            f241409f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
