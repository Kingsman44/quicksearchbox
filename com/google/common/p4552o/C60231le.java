package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.le */
/* compiled from: PG */
public final class C60231le extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60231le f162958c;

    /* renamed from: d */
    private static volatile C63010eb f162959d;

    /* renamed from: a */
    public int f162960a;

    /* renamed from: b */
    public int f162961b;

    static {
        C60231le leVar = new C60231le();
        f162958c = leVar;
        C62942bv.registerDefaultInstance(C60231le.class, leVar);
    }

    private C60231le() {
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
                return newMessageInfo(f162958c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60230ld.f162957a});
            case 3:
                return new C60231le();
            case 4:
                return new C60229lc();
            case 5:
                return f162958c;
            case 6:
                C63010eb ebVar = f162959d;
                if (ebVar == null) {
                    synchronized (C60231le.class) {
                        ebVar = f162959d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162958c);
                            f162959d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
