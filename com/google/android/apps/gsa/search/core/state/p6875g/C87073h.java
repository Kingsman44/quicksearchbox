package com.google.android.apps.gsa.search.core.state.p6875g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.core.state.g.h */
/* compiled from: PG */
public final class C87073h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87073h f235271d;

    /* renamed from: e */
    public static final C62940bt f235272e;

    /* renamed from: f */
    private static volatile C63010eb f235273f;

    /* renamed from: a */
    public int f235274a;

    /* renamed from: b */
    public C63088z f235275b = C63088z.f170246b;

    /* renamed from: c */
    public String f235276c = BuildConfig.FLAVOR;

    static {
        C87073h hVar = new C87073h();
        f235271d = hVar;
        C62942bv.registerDefaultInstance(C87073h.class, hVar);
        f235272e = C62942bv.newSingularGeneratedExtension(C88433bd.f239087e, hVar, hVar, (C62958ce) null, 132242267, C63066gd.MESSAGE, C87073h.class);
    }

    private C87073h() {
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
                return newMessageInfo(f235271d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87073h();
            case 4:
                return new C87072g();
            case 5:
                return f235271d;
            case 6:
                C63010eb ebVar = f235273f;
                if (ebVar == null) {
                    synchronized (C87073h.class) {
                        ebVar = f235273f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235271d);
                            f235273f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
