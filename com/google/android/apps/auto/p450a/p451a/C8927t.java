package com.google.android.apps.auto.p450a.p451a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.t */
/* compiled from: PG */
public final class C8927t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C8927t f30956d;

    /* renamed from: f */
    private static volatile C63010eb f30957f;

    /* renamed from: a */
    public String f30958a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f30959b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f30960c;

    /* renamed from: e */
    private int f30961e;

    static {
        C8927t tVar = new C8927t();
        f30956d = tVar;
        C62942bv.registerDefaultInstance(C8927t.class, tVar);
    }

    private C8927t() {
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
                return newMessageInfo(f30956d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C8927t();
            case 4:
                return new C8926s();
            case 5:
                return f30956d;
            case 6:
                C63010eb ebVar = f30957f;
                if (ebVar == null) {
                    synchronized (C8927t.class) {
                        ebVar = f30957f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30956d);
                            f30957f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
