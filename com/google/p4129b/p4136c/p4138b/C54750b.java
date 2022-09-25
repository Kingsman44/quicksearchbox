package com.google.p4129b.p4136c.p4138b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.c.b.b */
/* compiled from: PG */
public final class C54750b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54750b f143662a;

    /* renamed from: c */
    private static volatile C63010eb f143663c;

    /* renamed from: b */
    private C54754f f143664b;

    static {
        C54750b bVar = new C54750b();
        f143662a = bVar;
        C62942bv.registerDefaultInstance(C54750b.class, bVar);
    }

    private C54750b() {
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
                return newMessageInfo(f143662a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005\t", new Object[]{"b"});
            case 3:
                return new C54750b();
            case 4:
                return new C54747a();
            case 5:
                return f143662a;
            case 6:
                C63010eb ebVar = f143663c;
                if (ebVar == null) {
                    synchronized (C54750b.class) {
                        ebVar = f143663c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143662a);
                            f143663c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
