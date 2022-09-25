package com.google.p4283bv.p4380j.p4385b.p4386a.p4410d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.d.j */
/* compiled from: PG */
public final class C57767j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57767j f154351c;

    /* renamed from: d */
    private static volatile C63010eb f154352d;

    /* renamed from: a */
    public int f154353a;

    /* renamed from: b */
    public int f154354b;

    static {
        C57767j jVar = new C57767j();
        f154351c = jVar;
        C62942bv.registerDefaultInstance(C57767j.class, jVar);
    }

    private C57767j() {
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
                return newMessageInfo(f154351c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C57764g.f154350a});
            case 3:
                return new C57767j();
            case 4:
                return new C57766i();
            case 5:
                return f154351c;
            case 6:
                C63010eb ebVar = f154352d;
                if (ebVar == null) {
                    synchronized (C57767j.class) {
                        ebVar = f154352d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154351c);
                            f154352d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
