package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.k */
/* compiled from: PG */
public final class C63947k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63947k f172939c;

    /* renamed from: d */
    private static volatile C63010eb f172940d;

    /* renamed from: a */
    public int f172941a;

    /* renamed from: b */
    public int f172942b;

    static {
        C63947k kVar = new C63947k();
        f172939c = kVar;
        C62942bv.registerDefaultInstance(C63947k.class, kVar);
    }

    private C63947k() {
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
                return newMessageInfo(f172939c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C63946j.f172938a});
            case 3:
                return new C63947k();
            case 4:
                return new C63945i();
            case 5:
                return f172939c;
            case 6:
                C63010eb ebVar = f172940d;
                if (ebVar == null) {
                    synchronized (C63947k.class) {
                        ebVar = f172940d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172939c);
                            f172940d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
