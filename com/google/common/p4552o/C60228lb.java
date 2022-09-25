package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lb */
/* compiled from: PG */
public final class C60228lb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60228lb f162953c;

    /* renamed from: d */
    private static volatile C63010eb f162954d;

    /* renamed from: a */
    public int f162955a;

    /* renamed from: b */
    public boolean f162956b;

    static {
        C60228lb lbVar = new C60228lb();
        f162953c = lbVar;
        C62942bv.registerDefaultInstance(C60228lb.class, lbVar);
    }

    private C60228lb() {
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
                return newMessageInfo(f162953c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C60228lb();
            case 4:
                return new C60227la();
            case 5:
                return f162953c;
            case 6:
                C63010eb ebVar = f162954d;
                if (ebVar == null) {
                    synchronized (C60228lb.class) {
                        ebVar = f162954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162953c);
                            f162954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
