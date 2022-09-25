package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.b */
/* compiled from: PG */
public final class C57245b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57245b f152815c;

    /* renamed from: d */
    private static volatile C63010eb f152816d;

    /* renamed from: a */
    public int f152817a;

    /* renamed from: b */
    public int f152818b;

    static {
        C57245b bVar = new C57245b();
        f152815c = bVar;
        C62942bv.registerDefaultInstance(C57245b.class, bVar);
    }

    private C57245b() {
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
                return newMessageInfo(f152815c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57245b();
            case 4:
                return new C57218a();
            case 5:
                return f152815c;
            case 6:
                C63010eb ebVar = f152816d;
                if (ebVar == null) {
                    synchronized (C57245b.class) {
                        ebVar = f152816d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152815c);
                            f152816d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
