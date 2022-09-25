package com.google.p4283bv.p4354e.p4356b.p4358b.p4364d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.d.j */
/* compiled from: PG */
public final class C57204j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57204j f152718b;

    /* renamed from: d */
    private static volatile C63010eb f152719d;

    /* renamed from: a */
    public int f152720a;

    /* renamed from: c */
    private int f152721c;

    static {
        C57204j jVar = new C57204j();
        f152718b = jVar;
        C62942bv.registerDefaultInstance(C57204j.class, jVar);
    }

    private C57204j() {
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
                return newMessageInfo(f152718b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C57202h.f152717a});
            case 3:
                return new C57204j();
            case 4:
                return new C57201g();
            case 5:
                return f152718b;
            case 6:
                C63010eb ebVar = f152719d;
                if (ebVar == null) {
                    synchronized (C57204j.class) {
                        ebVar = f152719d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152718b);
                            f152719d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
