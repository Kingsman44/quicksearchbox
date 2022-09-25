package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dx */
/* compiled from: PG */
public final class C67748dx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67748dx f183804b;

    /* renamed from: c */
    private static volatile C63010eb f183805c;

    /* renamed from: a */
    public int f183806a;

    static {
        C67748dx dxVar = new C67748dx();
        f183804b = dxVar;
        C62942bv.registerDefaultInstance(C67748dx.class, dxVar);
    }

    private C67748dx() {
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
                return newMessageInfo(f183804b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C67748dx();
            case 4:
                return new C67747dw();
            case 5:
                return f183804b;
            case 6:
                C63010eb ebVar = f183805c;
                if (ebVar == null) {
                    synchronized (C67748dx.class) {
                        ebVar = f183805c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183804b);
                            f183805c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
