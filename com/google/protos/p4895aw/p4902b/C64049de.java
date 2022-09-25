package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.de */
/* compiled from: PG */
public final class C64049de extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64049de f173176c;

    /* renamed from: d */
    private static volatile C63010eb f173177d;

    /* renamed from: a */
    public int f173178a = 0;

    /* renamed from: b */
    public Object f173179b;

    static {
        C64049de deVar = new C64049de();
        f173176c = deVar;
        C62942bv.registerDefaultInstance(C64049de.class, deVar);
    }

    private C64049de() {
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
                return newMessageInfo(f173176c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001်\u0000", new Object[]{"b", "a"});
            case 3:
                return new C64049de();
            case 4:
                return new C64048dd();
            case 5:
                return f173176c;
            case 6:
                C63010eb ebVar = f173177d;
                if (ebVar == null) {
                    synchronized (C64049de.class) {
                        ebVar = f173177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173176c);
                            f173177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
