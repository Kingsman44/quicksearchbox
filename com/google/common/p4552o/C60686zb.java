package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zb */
/* compiled from: PG */
public final class C60686zb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60686zb f164644c;

    /* renamed from: d */
    private static volatile C63010eb f164645d;

    /* renamed from: a */
    public int f164646a;

    /* renamed from: b */
    public boolean f164647b;

    static {
        C60686zb zbVar = new C60686zb();
        f164644c = zbVar;
        C62942bv.registerDefaultInstance(C60686zb.class, zbVar);
    }

    private C60686zb() {
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
                return newMessageInfo(f164644c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60686zb();
            case 4:
                return new C60685za();
            case 5:
                return f164644c;
            case 6:
                C63010eb ebVar = f164645d;
                if (ebVar == null) {
                    synchronized (C60686zb.class) {
                        ebVar = f164645d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164644c);
                            f164645d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
