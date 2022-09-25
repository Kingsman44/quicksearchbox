package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.cj */
/* compiled from: PG */
public final class C57282cj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57282cj f152915c;

    /* renamed from: d */
    private static volatile C63010eb f152916d;

    /* renamed from: a */
    public int f152917a;

    /* renamed from: b */
    public C62910ar f152918b;

    static {
        C57282cj cjVar = new C57282cj();
        f152915c = cjVar;
        C62942bv.registerDefaultInstance(C57282cj.class, cjVar);
    }

    private C57282cj() {
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
                return newMessageInfo(f152915c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57282cj();
            case 4:
                return new C57281ci();
            case 5:
                return f152915c;
            case 6:
                C63010eb ebVar = f152916d;
                if (ebVar == null) {
                    synchronized (C57282cj.class) {
                        ebVar = f152916d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152915c);
                            f152916d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
