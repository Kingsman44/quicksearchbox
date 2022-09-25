package com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9178d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48714bv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.i.a.d.ae */
/* compiled from: PG */
public final class C121220ae extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C121220ae f336741f;

    /* renamed from: g */
    private static volatile C63010eb f336742g;

    /* renamed from: a */
    public int f336743a;

    /* renamed from: b */
    public int f336744b = 0;

    /* renamed from: c */
    public Object f336745c;

    /* renamed from: d */
    public long f336746d;

    /* renamed from: e */
    public int f336747e;

    static {
        C121220ae aeVar = new C121220ae();
        f336741f = aeVar;
        C62942bv.registerDefaultInstance(C121220ae.class, aeVar);
    }

    private C121220ae() {
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
                return newMessageInfo(f336741f, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C48714bv.m85266b(), C121238c.class, C121260x.class, C121251o.class, C121244h.class, C121258v.class, C121216aa.class, C121258v.class});
            case 3:
                return new C121220ae();
            case 4:
                return new C121219ad();
            case 5:
                return f336741f;
            case 6:
                C63010eb ebVar = f336742g;
                if (ebVar == null) {
                    synchronized (C121220ae.class) {
                        ebVar = f336742g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336741f);
                            f336742g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
