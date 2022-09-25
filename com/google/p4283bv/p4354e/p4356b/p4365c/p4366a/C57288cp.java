package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.cp */
/* compiled from: PG */
public final class C57288cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57288cp f152930c;

    /* renamed from: d */
    private static volatile C63010eb f152931d;

    /* renamed from: a */
    public int f152932a;

    /* renamed from: b */
    public C7669fo f152933b;

    static {
        C57288cp cpVar = new C57288cp();
        f152930c = cpVar;
        C62942bv.registerDefaultInstance(C57288cp.class, cpVar);
    }

    private C57288cp() {
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
                return newMessageInfo(f152930c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57288cp();
            case 4:
                return new C57287co();
            case 5:
                return f152930c;
            case 6:
                C63010eb ebVar = f152931d;
                if (ebVar == null) {
                    synchronized (C57288cp.class) {
                        ebVar = f152931d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152930c);
                            f152931d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
