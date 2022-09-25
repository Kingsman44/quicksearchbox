package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alt */
/* compiled from: PG */
public final class alt extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final alt f159103c;

    /* renamed from: d */
    private static volatile C63010eb f159104d;

    /* renamed from: a */
    public int f159105a;

    /* renamed from: b */
    public boolean f159106b;

    static {
        alt alt = new alt();
        f159103c = alt;
        C62942bv.registerDefaultInstance(alt.class, alt);
    }

    private alt() {
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
                return newMessageInfo(f159103c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new alt();
            case 4:
                return new als();
            case 5:
                return f159103c;
            case 6:
                C63010eb ebVar = f159104d;
                if (ebVar == null) {
                    synchronized (alt.class) {
                        ebVar = f159104d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159103c);
                            f159104d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
