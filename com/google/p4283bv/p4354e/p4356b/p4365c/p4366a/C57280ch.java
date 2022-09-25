package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ch */
/* compiled from: PG */
public final class C57280ch extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57280ch f152912a;

    /* renamed from: c */
    private static volatile C63010eb f152913c;

    /* renamed from: b */
    private byte f152914b = 2;

    static {
        C57280ch chVar = new C57280ch();
        f152912a = chVar;
        C62942bv.registerDefaultInstance(C57280ch.class, chVar);
    }

    private C57280ch() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152914b);
            case 1:
                this.f152914b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152912a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57280ch();
            case 4:
                return new C57279cg();
            case 5:
                return f152912a;
            case 6:
                C63010eb ebVar = f152913c;
                if (ebVar == null) {
                    synchronized (C57280ch.class) {
                        ebVar = f152913c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152912a);
                            f152913c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
