package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.u */
/* compiled from: PG */
public final class C107542u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C107542u f299189c;

    /* renamed from: d */
    private static volatile C63010eb f299190d;

    /* renamed from: a */
    public int f299191a;

    /* renamed from: b */
    public C107544w f299192b;

    static {
        C107542u uVar = new C107542u();
        f299189c = uVar;
        C62942bv.registerDefaultInstance(C107542u.class, uVar);
    }

    private C107542u() {
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
                return newMessageInfo(f299189c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C107542u();
            case 4:
                return new C107541t();
            case 5:
                return f299189c;
            case 6:
                C63010eb ebVar = f299190d;
                if (ebVar == null) {
                    synchronized (C107542u.class) {
                        ebVar = f299190d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299189c);
                            f299190d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
