package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.o.a.a.n */
/* compiled from: PG */
public final class C62865n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62865n f169753b;

    /* renamed from: c */
    private static volatile C63010eb f169754c;

    /* renamed from: a */
    public C63088z f169755a = C63088z.f170246b;

    static {
        C62865n nVar = new C62865n();
        f169753b = nVar;
        C62942bv.registerDefaultInstance(C62865n.class, nVar);
    }

    private C62865n() {
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
                return newMessageInfo(f169753b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"a"});
            case 3:
                return new C62865n();
            case 4:
                return new C62864m();
            case 5:
                return f169753b;
            case 6:
                C63010eb ebVar = f169754c;
                if (ebVar == null) {
                    synchronized (C62865n.class) {
                        ebVar = f169754c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169753b);
                            f169754c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
