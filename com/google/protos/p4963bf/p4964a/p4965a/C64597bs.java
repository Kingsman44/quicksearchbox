package com.google.protos.p4963bf.p4964a.p4965a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.bf.a.a.bs */
/* compiled from: PG */
public final class C64597bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64597bs f175135c;

    /* renamed from: e */
    private static volatile C63010eb f175136e;

    /* renamed from: a */
    public int f175137a;

    /* renamed from: b */
    public int f175138b;

    /* renamed from: d */
    private int f175139d;

    static {
        C64597bs bsVar = new C64597bs();
        f175135c = bsVar;
        C62942bv.registerDefaultInstance(C64597bs.class, bsVar);
    }

    private C64597bs() {
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
                return newMessageInfo(f175135c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0002", new Object[]{"d", "a", C64594bp.f175134a, "b", C64576ay.f175085a});
            case 3:
                return new C64597bs();
            case 4:
                return new C64596br();
            case 5:
                return f175135c;
            case 6:
                C63010eb ebVar = f175136e;
                if (ebVar == null) {
                    synchronized (C64597bs.class) {
                        ebVar = f175136e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175135c);
                            f175136e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
