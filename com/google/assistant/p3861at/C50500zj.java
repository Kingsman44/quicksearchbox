package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3832d.p3833a.C49352c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.zj */
/* compiled from: PG */
public final class C50500zj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50500zj f131453e;

    /* renamed from: f */
    private static volatile C63010eb f131454f;

    /* renamed from: a */
    public int f131455a;

    /* renamed from: b */
    public String f131456b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131457c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f131458d;

    static {
        C50500zj zjVar = new C50500zj();
        f131453e = zjVar;
        C62942bv.registerDefaultInstance(C50500zj.class, zjVar);
    }

    private C50500zj() {
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
                return newMessageInfo(f131453e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C49352c.f127580a});
            case 3:
                return new C50500zj();
            case 4:
                return new C50499zi();
            case 5:
                return f131453e;
            case 6:
                C63010eb ebVar = f131454f;
                if (ebVar == null) {
                    synchronized (C50500zj.class) {
                        ebVar = f131454f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131453e);
                            f131454f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
