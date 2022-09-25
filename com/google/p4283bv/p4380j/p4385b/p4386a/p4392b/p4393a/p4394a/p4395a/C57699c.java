package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4393a.p4394a.p4395a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.b.a.a.a.c */
/* compiled from: PG */
public final class C57699c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57699c f154153d;

    /* renamed from: e */
    private static volatile C63010eb f154154e;

    /* renamed from: a */
    public int f154155a;

    /* renamed from: b */
    public int f154156b;

    /* renamed from: c */
    public long f154157c;

    static {
        C57699c cVar = new C57699c();
        f154153d = cVar;
        C62942bv.registerDefaultInstance(C57699c.class, cVar);
    }

    private C57699c() {
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
                return newMessageInfo(f154153d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C57697a.f154152a, C45240c.f118157a});
            case 3:
                return new C57699c();
            case 4:
                return new C57698b();
            case 5:
                return f154153d;
            case 6:
                C63010eb ebVar = f154154e;
                if (ebVar == null) {
                    synchronized (C57699c.class) {
                        ebVar = f154154e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154153d);
                            f154154e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
