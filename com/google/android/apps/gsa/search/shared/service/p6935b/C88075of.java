package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.of */
/* compiled from: PG */
public final class C88075of extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88075of f238132e;

    /* renamed from: f */
    private static volatile C63010eb f238133f;

    /* renamed from: a */
    public int f238134a;

    /* renamed from: b */
    public String f238135b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f238136c;

    /* renamed from: d */
    public String f238137d = BuildConfig.FLAVOR;

    static {
        C88075of ofVar = new C88075of();
        f238132e = ofVar;
        C62942bv.registerDefaultInstance(C88075of.class, ofVar);
    }

    private C88075of() {
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
                return newMessageInfo(f238132e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88075of();
            case 4:
                return new C88074oe();
            case 5:
                return f238132e;
            case 6:
                C63010eb ebVar = f238133f;
                if (ebVar == null) {
                    synchronized (C88075of.class) {
                        ebVar = f238133f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238132e);
                            f238133f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
