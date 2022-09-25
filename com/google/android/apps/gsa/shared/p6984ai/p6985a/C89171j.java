package com.google.android.apps.gsa.shared.p6984ai.p6985a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ai.a.j */
/* compiled from: PG */
public final class C89171j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C89171j f241759f;

    /* renamed from: g */
    private static volatile C63010eb f241760g;

    /* renamed from: a */
    public int f241761a;

    /* renamed from: b */
    public int f241762b;

    /* renamed from: c */
    public int f241763c;

    /* renamed from: d */
    public int f241764d;

    /* renamed from: e */
    public String f241765e = BuildConfig.FLAVOR;

    static {
        C89171j jVar = new C89171j();
        f241759f = jVar;
        C62942bv.registerDefaultInstance(C89171j.class, jVar);
    }

    private C89171j() {
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
                return newMessageInfo(f241759f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C89169h.f241758a, C45240c.f118157a, C89167f.m145046b(), "d", C89167f.m145046b(), "e"});
            case 3:
                return new C89171j();
            case 4:
                return new C89168g();
            case 5:
                return f241759f;
            case 6:
                C63010eb ebVar = f241760g;
                if (ebVar == null) {
                    synchronized (C89171j.class) {
                        ebVar = f241760g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241759f);
                            f241760g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
