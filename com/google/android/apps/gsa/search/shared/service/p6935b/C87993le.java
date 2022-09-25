package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.le */
/* compiled from: PG */
public final class C87993le extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87993le f237961e;

    /* renamed from: f */
    private static volatile C63010eb f237962f;

    /* renamed from: a */
    public int f237963a;

    /* renamed from: b */
    public String f237964b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237965c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f237966d = BuildConfig.FLAVOR;

    static {
        C87993le leVar = new C87993le();
        f237961e = leVar;
        C62942bv.registerDefaultInstance(C87993le.class, leVar);
    }

    private C87993le() {
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
                return newMessageInfo(f237961e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87993le();
            case 4:
                return new C87992ld();
            case 5:
                return f237961e;
            case 6:
                C63010eb ebVar = f237962f;
                if (ebVar == null) {
                    synchronized (C87993le.class) {
                        ebVar = f237962f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237961e);
                            f237962f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
