package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aa */
/* compiled from: PG */
public final class C87692aa extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87692aa f237046e;

    /* renamed from: f */
    private static volatile C63010eb f237047f;

    /* renamed from: a */
    public int f237048a;

    /* renamed from: b */
    public String f237049b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237050c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f237051d = BuildConfig.FLAVOR;

    static {
        C87692aa aaVar = new C87692aa();
        f237046e = aaVar;
        C62942bv.registerDefaultInstance(C87692aa.class, aaVar);
    }

    private C87692aa() {
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
                return newMessageInfo(f237046e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87692aa();
            case 4:
                return new C88366z();
            case 5:
                return f237046e;
            case 6:
                C63010eb ebVar = f237047f;
                if (ebVar == null) {
                    synchronized (C87692aa.class) {
                        ebVar = f237047f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237046e);
                            f237047f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
