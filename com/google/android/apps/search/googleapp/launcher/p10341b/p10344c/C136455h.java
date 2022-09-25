package com.google.android.apps.search.googleapp.launcher.p10341b.p10344c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.c.h */
/* compiled from: PG */
public final class C136455h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136455h f371506d;

    /* renamed from: e */
    private static volatile C63010eb f371507e;

    /* renamed from: a */
    public int f371508a;

    /* renamed from: b */
    public C63088z f371509b = C63088z.f170246b;

    /* renamed from: c */
    public String f371510c = BuildConfig.FLAVOR;

    static {
        C136455h hVar = new C136455h();
        f371506d = hVar;
        C62942bv.registerDefaultInstance(C136455h.class, hVar);
    }

    private C136455h() {
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
                return newMessageInfo(f371506d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136455h();
            case 4:
                return new C136454g();
            case 5:
                return f371506d;
            case 6:
                C63010eb ebVar = f371507e;
                if (ebVar == null) {
                    synchronized (C136455h.class) {
                        ebVar = f371507e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371506d);
                            f371507e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
