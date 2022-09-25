package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.j */
/* compiled from: PG */
public final class C49333j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49333j f127504f;

    /* renamed from: g */
    private static volatile C63010eb f127505g;

    /* renamed from: a */
    public int f127506a;

    /* renamed from: b */
    public int f127507b = 0;

    /* renamed from: c */
    public Object f127508c;

    /* renamed from: d */
    public String f127509d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f127510e = BuildConfig.FLAVOR;

    static {
        C49333j jVar = new C49333j();
        f127504f = jVar;
        C62942bv.registerDefaultInstance(C49333j.class, jVar);
    }

    private C49333j() {
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
                return newMessageInfo(f127504f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{C45240c.f118157a, "b", "a", C49293bl.class, C49326cr.class, "d", "e"});
            case 3:
                return new C49333j();
            case 4:
                return new C49331h();
            case 5:
                return f127504f;
            case 6:
                C63010eb ebVar = f127505g;
                if (ebVar == null) {
                    synchronized (C49333j.class) {
                        ebVar = f127505g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127504f);
                            f127505g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
