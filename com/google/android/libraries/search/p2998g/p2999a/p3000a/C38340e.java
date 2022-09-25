package com.google.android.libraries.search.p2998g.p2999a.p3000a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.a.e */
/* compiled from: PG */
public final class C38340e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C38340e f101517e;

    /* renamed from: f */
    private static volatile C63010eb f101518f;

    /* renamed from: a */
    public int f101519a;

    /* renamed from: b */
    public int f101520b = 1;

    /* renamed from: c */
    public String f101521c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f101522d = BuildConfig.FLAVOR;

    static {
        C38340e eVar = new C38340e();
        f101517e = eVar;
        C62942bv.registerDefaultInstance(C38340e.class, eVar);
    }

    private C38340e() {
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
                return newMessageInfo(f101517e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C38336a.f101515a, C45240c.f118157a, "d"});
            case 3:
                return new C38340e();
            case 4:
                return new C38339d();
            case 5:
                return f101517e;
            case 6:
                C63010eb ebVar = f101518f;
                if (ebVar == null) {
                    synchronized (C38340e.class) {
                        ebVar = f101518f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101517e);
                            f101518f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
