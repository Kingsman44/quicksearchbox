package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.ac */
/* compiled from: PG */
public final class C87304ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87304ac f235772c;

    /* renamed from: e */
    private static volatile C63010eb f235773e;

    /* renamed from: a */
    public String f235774a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f235775b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f235776d;

    static {
        C87304ac acVar = new C87304ac();
        f235772c = acVar;
        C62942bv.registerDefaultInstance(C87304ac.class, acVar);
    }

    private C87304ac() {
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
                return newMessageInfo(f235772c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C87304ac();
            case 4:
                return new C87303ab();
            case 5:
                return f235772c;
            case 6:
                C63010eb ebVar = f235773e;
                if (ebVar == null) {
                    synchronized (C87304ac.class) {
                        ebVar = f235773e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235772c);
                            f235773e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
