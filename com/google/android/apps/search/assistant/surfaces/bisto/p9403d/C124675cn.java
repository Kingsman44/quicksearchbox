package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cn */
/* compiled from: PG */
public final class C124675cn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C124675cn f343946e;

    /* renamed from: f */
    private static volatile C63010eb f343947f;

    /* renamed from: a */
    public int f343948a;

    /* renamed from: b */
    public String f343949b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f343950c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f343951d;

    static {
        C124675cn cnVar = new C124675cn();
        f343946e = cnVar;
        C62942bv.registerDefaultInstance(C124675cn.class, cnVar);
    }

    private C124675cn() {
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
                return newMessageInfo(f343946e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C124675cn();
            case 4:
                return new C124674cm();
            case 5:
                return f343946e;
            case 6:
                C63010eb ebVar = f343947f;
                if (ebVar == null) {
                    synchronized (C124675cn.class) {
                        ebVar = f343947f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343946e);
                            f343947f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
