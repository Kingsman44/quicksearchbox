package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.an */
/* compiled from: PG */
public final class C107520an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107520an f299147c;

    /* renamed from: d */
    private static volatile C63010eb f299148d;

    /* renamed from: a */
    public int f299149a;

    /* renamed from: b */
    public float f299150b;

    static {
        C107520an anVar = new C107520an();
        f299147c = anVar;
        C62942bv.registerDefaultInstance(C107520an.class, anVar);
    }

    private C107520an() {
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
                return newMessageInfo(f299147c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107520an();
            case 4:
                return new C107519am();
            case 5:
                return f299147c;
            case 6:
                C63010eb ebVar = f299148d;
                if (ebVar == null) {
                    synchronized (C107520an.class) {
                        ebVar = f299148d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299147c);
                            f299148d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
