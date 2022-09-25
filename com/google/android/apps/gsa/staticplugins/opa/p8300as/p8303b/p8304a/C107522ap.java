package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.ap */
/* compiled from: PG */
public final class C107522ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107522ap f299151c;

    /* renamed from: d */
    private static volatile C63010eb f299152d;

    /* renamed from: a */
    public int f299153a;

    /* renamed from: b */
    public boolean f299154b;

    static {
        C107522ap apVar = new C107522ap();
        f299151c = apVar;
        C62942bv.registerDefaultInstance(C107522ap.class, apVar);
    }

    private C107522ap() {
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
                return newMessageInfo(f299151c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107522ap();
            case 4:
                return new C107521ao();
            case 5:
                return f299151c;
            case 6:
                C63010eb ebVar = f299152d;
                if (ebVar == null) {
                    synchronized (C107522ap.class) {
                        ebVar = f299152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299151c);
                            f299152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
