package com.google.p4017at.p4027c.p4031b.p4038c.p4039a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.c.a.i */
/* compiled from: PG */
public final class C53897i extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53897i f141427b;

    /* renamed from: c */
    private static volatile C63010eb f141428c;

    /* renamed from: a */
    public int f141429a;

    static {
        C53897i iVar = new C53897i();
        f141427b = iVar;
        C62942bv.registerDefaultInstance(C53897i.class, iVar);
    }

    private C53897i() {
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
                return newMessageInfo(f141427b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C53897i();
            case 4:
                return new C53896h();
            case 5:
                return f141427b;
            case 6:
                C63010eb ebVar = f141428c;
                if (ebVar == null) {
                    synchronized (C53897i.class) {
                        ebVar = f141428c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141427b);
                            f141428c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
