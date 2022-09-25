package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aim */
/* compiled from: PG */
public final class aim extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aim f158821c;

    /* renamed from: d */
    private static volatile C63010eb f158822d;

    /* renamed from: a */
    public int f158823a;

    /* renamed from: b */
    public int f158824b;

    static {
        aim aim = new aim();
        f158821c = aim;
        C62942bv.registerDefaultInstance(aim.class, aim);
    }

    private aim() {
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
                return newMessageInfo(f158821c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aik.f158820a});
            case 3:
                return new aim();
            case 4:
                return new ail();
            case 5:
                return f158821c;
            case 6:
                C63010eb ebVar = f158822d;
                if (ebVar == null) {
                    synchronized (aim.class) {
                        ebVar = f158822d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158821c);
                            f158822d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
