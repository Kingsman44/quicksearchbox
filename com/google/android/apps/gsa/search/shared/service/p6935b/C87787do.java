package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.do */
/* compiled from: PG */
public final class C87787do extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87787do f237567d;

    /* renamed from: e */
    private static volatile C63010eb f237568e;

    /* renamed from: a */
    public int f237569a;

    /* renamed from: b */
    public String f237570b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237571c = BuildConfig.FLAVOR;

    static {
        C87787do doVar = new C87787do();
        f237567d = doVar;
        C62942bv.registerDefaultInstance(C87787do.class, doVar);
    }

    private C87787do() {
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
                return newMessageInfo(f237567d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87787do();
            case 4:
                return new C87786dn();
            case 5:
                return f237567d;
            case 6:
                C63010eb ebVar = f237568e;
                if (ebVar == null) {
                    synchronized (C87787do.class) {
                        ebVar = f237568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237567d);
                            f237568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
