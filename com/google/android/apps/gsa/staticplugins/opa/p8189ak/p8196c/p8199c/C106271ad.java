package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.c.ad */
/* compiled from: PG */
public final class C106271ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C106271ad f296489c;

    /* renamed from: d */
    private static volatile C63010eb f296490d;

    /* renamed from: a */
    public int f296491a;

    /* renamed from: b */
    public float f296492b;

    static {
        C106271ad adVar = new C106271ad();
        f296489c = adVar;
        C62942bv.registerDefaultInstance(C106271ad.class, adVar);
    }

    private C106271ad() {
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
                return newMessageInfo(f296489c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C106271ad();
            case 4:
                return new C106270ac();
            case 5:
                return f296489c;
            case 6:
                C63010eb ebVar = f296490d;
                if (ebVar == null) {
                    synchronized (C106271ad.class) {
                        ebVar = f296490d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f296489c);
                            f296490d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
