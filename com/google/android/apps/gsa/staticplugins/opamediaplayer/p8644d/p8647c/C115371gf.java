package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52582xb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.gf */
/* compiled from: PG */
public final class C115371gf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C115371gf f320102d;

    /* renamed from: e */
    private static volatile C63010eb f320103e;

    /* renamed from: a */
    public int f320104a;

    /* renamed from: b */
    public String f320105b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f320106c;

    static {
        C115371gf gfVar = new C115371gf();
        f320102d = gfVar;
        C62942bv.registerDefaultInstance(C115371gf.class, gfVar);
    }

    private C115371gf() {
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
                return newMessageInfo(f320102d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52582xb.m86659b()});
            case 3:
                return new C115371gf();
            case 4:
                return new C115370ge();
            case 5:
                return f320102d;
            case 6:
                C63010eb ebVar = f320103e;
                if (ebVar == null) {
                    synchronized (C115371gf.class) {
                        ebVar = f320103e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f320102d);
                            f320103e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
