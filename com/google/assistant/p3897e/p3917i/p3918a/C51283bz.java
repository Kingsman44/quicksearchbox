package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.bz */
/* compiled from: PG */
public final class C51283bz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51283bz f133511c;

    /* renamed from: d */
    private static volatile C63010eb f133512d;

    /* renamed from: a */
    public int f133513a = 0;

    /* renamed from: b */
    public Object f133514b;

    static {
        C51283bz bzVar = new C51283bz();
        f133511c = bzVar;
        C62942bv.registerDefaultInstance(C51283bz.class, bzVar);
    }

    private C51283bz() {
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
                return newMessageInfo(f133511c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C51278bu.class, C51282by.f133510a, C51280bw.class});
            case 3:
                return new C51283bz();
            case 4:
                return new C51281bx();
            case 5:
                return f133511c;
            case 6:
                C63010eb ebVar = f133512d;
                if (ebVar == null) {
                    synchronized (C51283bz.class) {
                        ebVar = f133512d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133511c);
                            f133512d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
