package com.google.android.libraries.search.p2998g.p2999a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.j */
/* compiled from: PG */
public final class C38369j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38369j f101588d;

    /* renamed from: e */
    private static volatile C63010eb f101589e;

    /* renamed from: a */
    public int f101590a;

    /* renamed from: b */
    public int f101591b;

    /* renamed from: c */
    public long f101592c;

    static {
        C38369j jVar = new C38369j();
        f101588d = jVar;
        C62942bv.registerDefaultInstance(C38369j.class, jVar);
    }

    private C38369j() {
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
                return newMessageInfo(f101588d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38369j();
            case 4:
                return new C38368i();
            case 5:
                return f101588d;
            case 6:
                C63010eb ebVar = f101589e;
                if (ebVar == null) {
                    synchronized (C38369j.class) {
                        ebVar = f101589e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101588d);
                            f101589e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
