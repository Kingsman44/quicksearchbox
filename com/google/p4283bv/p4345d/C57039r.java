package com.google.p4283bv.p4345d;

import com.google.p375ai.p378b.C7681g;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.r */
/* compiled from: PG */
public final class C57039r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57039r f152274c;

    /* renamed from: d */
    private static volatile C63010eb f152275d;

    /* renamed from: a */
    public int f152276a;

    /* renamed from: b */
    public int f152277b;

    static {
        C57039r rVar = new C57039r();
        f152274c = rVar;
        C62942bv.registerDefaultInstance(C57039r.class, rVar);
    }

    private C57039r() {
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
                return newMessageInfo(f152274c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C7681g.m22803b()});
            case 3:
                return new C57039r();
            case 4:
                return new C57038q();
            case 5:
                return f152274c;
            case 6:
                C63010eb ebVar = f152275d;
                if (ebVar == null) {
                    synchronized (C57039r.class) {
                        ebVar = f152275d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152274c);
                            f152275d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
