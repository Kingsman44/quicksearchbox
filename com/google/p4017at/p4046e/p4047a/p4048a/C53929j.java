package com.google.p4017at.p4046e.p4047a.p4048a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.e.a.a.j */
/* compiled from: PG */
public final class C53929j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53929j f141510c;

    /* renamed from: d */
    private static volatile C63010eb f141511d;

    /* renamed from: a */
    public int f141512a;

    /* renamed from: b */
    public C63088z f141513b = C63088z.f170246b;

    static {
        C53929j jVar = new C53929j();
        f141510c = jVar;
        C62942bv.registerDefaultInstance(C53929j.class, jVar);
    }

    private C53929j() {
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
                return newMessageInfo(f141510c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53929j();
            case 4:
                return new C53922c();
            case 5:
                return f141510c;
            case 6:
                C63010eb ebVar = f141511d;
                if (ebVar == null) {
                    synchronized (C53929j.class) {
                        ebVar = f141511d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141510c);
                            f141511d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
