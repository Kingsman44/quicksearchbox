package com.google.assistant.p3860as;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.j */
/* compiled from: PG */
public final class C49796j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49796j f128630d;

    /* renamed from: e */
    private static volatile C63010eb f128631e;

    /* renamed from: a */
    public int f128632a;

    /* renamed from: b */
    public String f128633b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f128634c;

    static {
        C49796j jVar = new C49796j();
        f128630d = jVar;
        C62942bv.registerDefaultInstance(C49796j.class, jVar);
    }

    private C49796j() {
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
                return newMessageInfo(f128630d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C49794h.m85714b()});
            case 3:
                return new C49796j();
            case 4:
                return new C49795i();
            case 5:
                return f128630d;
            case 6:
                C63010eb ebVar = f128631e;
                if (ebVar == null) {
                    synchronized (C49796j.class) {
                        ebVar = f128631e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128630d);
                            f128631e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
