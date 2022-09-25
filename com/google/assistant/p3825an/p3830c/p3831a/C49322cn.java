package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cn */
/* compiled from: PG */
public final class C49322cn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49322cn f127471e;

    /* renamed from: f */
    private static volatile C63010eb f127472f;

    /* renamed from: a */
    public int f127473a;

    /* renamed from: b */
    public String f127474b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f127475c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127476d = BuildConfig.FLAVOR;

    static {
        C49322cn cnVar = new C49322cn();
        f127471e = cnVar;
        C62942bv.registerDefaultInstance(C49322cn.class, cnVar);
    }

    private C49322cn() {
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
                return newMessageInfo(f127471e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49322cn();
            case 4:
                return new C49321cm();
            case 5:
                return f127471e;
            case 6:
                C63010eb ebVar = f127472f;
                if (ebVar == null) {
                    synchronized (C49322cn.class) {
                        ebVar = f127472f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127471e);
                            f127472f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
