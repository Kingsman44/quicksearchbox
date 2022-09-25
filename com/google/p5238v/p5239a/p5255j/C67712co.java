package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.co */
/* compiled from: PG */
public final class C67712co extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67712co f183714b;

    /* renamed from: c */
    private static volatile C63010eb f183715c;

    /* renamed from: a */
    public C67714cq f183716a;

    static {
        C67712co coVar = new C67712co();
        f183714b = coVar;
        C62942bv.registerDefaultInstance(C67712co.class, coVar);
    }

    private C67712co() {
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
                return newMessageInfo(f183714b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C67712co();
            case 4:
                return new C67711cn();
            case 5:
                return f183714b;
            case 6:
                C63010eb ebVar = f183715c;
                if (ebVar == null) {
                    synchronized (C67712co.class) {
                        ebVar = f183715c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183714b);
                            f183715c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
