package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.t */
/* compiled from: PG */
public final class C123791t extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123791t f341978d;

    /* renamed from: e */
    private static volatile C63010eb f341979e;

    /* renamed from: a */
    public int f341980a;

    /* renamed from: b */
    public String f341981b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f341982c;

    static {
        C123791t tVar = new C123791t();
        f341978d = tVar;
        C62942bv.registerDefaultInstance(C123791t.class, tVar);
    }

    private C123791t() {
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
                return newMessageInfo(f341978d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C123791t();
            case 4:
                return new C123790s();
            case 5:
                return f341978d;
            case 6:
                C63010eb ebVar = f341979e;
                if (ebVar == null) {
                    synchronized (C123791t.class) {
                        ebVar = f341979e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341978d);
                            f341979e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
