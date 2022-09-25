package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.j */
/* compiled from: PG */
public final class C8680j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8680j f30003b;

    /* renamed from: c */
    private static volatile C63010eb f30004c;

    /* renamed from: a */
    public int f30005a;

    static {
        C8680j jVar = new C8680j();
        f30003b = jVar;
        C62942bv.registerDefaultInstance(C8680j.class, jVar);
    }

    private C8680j() {
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
                return newMessageInfo(f30003b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C8680j();
            case 4:
                return new C8678h();
            case 5:
                return f30003b;
            case 6:
                C63010eb ebVar = f30004c;
                if (ebVar == null) {
                    synchronized (C8680j.class) {
                        ebVar = f30004c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30003b);
                            f30004c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
