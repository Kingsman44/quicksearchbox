package com.google.android.apps.gsa.staticplugins.opa.promo;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.f */
/* compiled from: PG */
public final class C109929f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C109929f f306296c;

    /* renamed from: d */
    private static volatile C63010eb f306297d;

    /* renamed from: a */
    public int f306298a;

    /* renamed from: b */
    public C109927d f306299b;

    static {
        C109929f fVar = new C109929f();
        f306296c = fVar;
        C62942bv.registerDefaultInstance(C109929f.class, fVar);
    }

    private C109929f() {
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
                return newMessageInfo(f306296c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C109929f();
            case 4:
                return new C109928e();
            case 5:
                return f306296c;
            case 6:
                C63010eb ebVar = f306297d;
                if (ebVar == null) {
                    synchronized (C109929f.class) {
                        ebVar = f306297d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f306296c);
                            f306297d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
