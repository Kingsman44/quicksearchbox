package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aiz */
/* compiled from: PG */
public final class aiz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aiz f158857c;

    /* renamed from: d */
    private static volatile C63010eb f158858d;

    /* renamed from: a */
    public int f158859a;

    /* renamed from: b */
    public int f158860b;

    static {
        aiz aiz = new aiz();
        f158857c = aiz;
        C62942bv.registerDefaultInstance(aiz.class, aiz);
    }

    private aiz() {
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
                return newMessageInfo(f158857c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aiy.m92406b()});
            case 3:
                return new aiz();
            case 4:
                return new aiw();
            case 5:
                return f158857c;
            case 6:
                C63010eb ebVar = f158858d;
                if (ebVar == null) {
                    synchronized (aiz.class) {
                        ebVar = f158858d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158857c);
                            f158858d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
