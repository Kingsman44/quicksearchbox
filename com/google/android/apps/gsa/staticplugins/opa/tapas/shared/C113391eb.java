package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.eb */
/* compiled from: PG */
public final class C113391eb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C113391eb f313979e;

    /* renamed from: f */
    private static volatile C63010eb f313980f;

    /* renamed from: a */
    public int f313981a;

    /* renamed from: b */
    public boolean f313982b;

    /* renamed from: c */
    public float f313983c;

    /* renamed from: d */
    public float f313984d;

    static {
        C113391eb ebVar = new C113391eb();
        f313979e = ebVar;
        C62942bv.registerDefaultInstance(C113391eb.class, ebVar);
    }

    private C113391eb() {
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
                return newMessageInfo(f313979e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C113391eb();
            case 4:
                return new C113390ea();
            case 5:
                return f313979e;
            case 6:
                C63010eb ebVar = f313980f;
                if (ebVar == null) {
                    synchronized (C113391eb.class) {
                        ebVar = f313980f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313979e);
                            f313980f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
