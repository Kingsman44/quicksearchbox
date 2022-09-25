package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.b.a.ah */
/* compiled from: PG */
public final class C107514ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C107514ah f299136e;

    /* renamed from: f */
    private static volatile C63010eb f299137f;

    /* renamed from: a */
    public int f299138a;

    /* renamed from: b */
    public String f299139b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f299140c;

    /* renamed from: d */
    public String f299141d = BuildConfig.FLAVOR;

    static {
        C107514ah ahVar = new C107514ah();
        f299136e = ahVar;
        C62942bv.registerDefaultInstance(C107514ah.class, ahVar);
    }

    private C107514ah() {
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
                return newMessageInfo(f299136e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C107514ah();
            case 4:
                return new C107513ag();
            case 5:
                return f299136e;
            case 6:
                C63010eb ebVar = f299137f;
                if (ebVar == null) {
                    synchronized (C107514ah.class) {
                        ebVar = f299137f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f299136e);
                            f299137f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
