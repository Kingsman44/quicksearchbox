package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.v */
/* compiled from: PG */
public final class C113584v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C113584v f314499b;

    /* renamed from: c */
    private static volatile C63010eb f314500c;

    /* renamed from: a */
    public C113516u f314501a;

    static {
        C113584v vVar = new C113584v();
        f314499b = vVar;
        C62942bv.registerDefaultInstance(C113584v.class, vVar);
    }

    private C113584v() {
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
                return newMessageInfo(f314499b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C113584v();
            case 4:
                return new C113245s();
            case 5:
                return f314499b;
            case 6:
                C63010eb ebVar = f314500c;
                if (ebVar == null) {
                    synchronized (C113584v.class) {
                        ebVar = f314500c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f314499b);
                            f314500c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
