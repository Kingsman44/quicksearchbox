package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ag */
/* compiled from: PG */
public final class C59578ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59578ag f158604c;

    /* renamed from: d */
    private static volatile C63010eb f158605d;

    /* renamed from: a */
    public int f158606a;

    /* renamed from: b */
    public long f158607b;

    static {
        C59578ag agVar = new C59578ag();
        f158604c = agVar;
        C62942bv.registerDefaultInstance(C59578ag.class, agVar);
    }

    private C59578ag() {
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
                return newMessageInfo(f158604c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59578ag();
            case 4:
                return new C59577af();
            case 5:
                return f158604c;
            case 6:
                C63010eb ebVar = f158605d;
                if (ebVar == null) {
                    synchronized (C59578ag.class) {
                        ebVar = f158605d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158604c);
                            f158605d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
