package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.ef */
/* compiled from: PG */
public final class C113395ef extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C113395ef f313995d;

    /* renamed from: e */
    private static volatile C63010eb f313996e;

    /* renamed from: a */
    public int f313997a;

    /* renamed from: b */
    public float f313998b;

    /* renamed from: c */
    public float f313999c;

    static {
        C113395ef efVar = new C113395ef();
        f313995d = efVar;
        C62942bv.registerDefaultInstance(C113395ef.class, efVar);
    }

    private C113395ef() {
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
                return newMessageInfo(f313995d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C113395ef();
            case 4:
                return new C113394ee();
            case 5:
                return f313995d;
            case 6:
                C63010eb ebVar = f313996e;
                if (ebVar == null) {
                    synchronized (C113395ef.class) {
                        ebVar = f313996e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313995d);
                            f313996e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
