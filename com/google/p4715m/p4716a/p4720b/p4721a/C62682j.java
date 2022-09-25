package com.google.p4715m.p4716a.p4720b.p4721a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.b.a.j */
/* compiled from: PG */
public final class C62682j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62682j f169231b;

    /* renamed from: d */
    private static volatile C63010eb f169232d;

    /* renamed from: a */
    public C62673al f169233a;

    /* renamed from: c */
    private int f169234c;

    static {
        C62682j jVar = new C62682j();
        f169231b = jVar;
        C62942bv.registerDefaultInstance(C62682j.class, jVar);
    }

    private C62682j() {
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
                return newMessageInfo(f169231b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C62682j();
            case 4:
                return new C62681i();
            case 5:
                return f169231b;
            case 6:
                C63010eb ebVar = f169232d;
                if (ebVar == null) {
                    synchronized (C62682j.class) {
                        ebVar = f169232d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169231b);
                            f169232d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
