package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.pm */
/* compiled from: PG */
public final class C7937pm extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C7937pm f27871g;

    /* renamed from: h */
    private static volatile C63010eb f27872h;

    /* renamed from: a */
    public int f27873a;

    /* renamed from: b */
    public int f27874b = 1;

    /* renamed from: c */
    public String f27875c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f27876d;

    /* renamed from: e */
    public int f27877e;

    /* renamed from: f */
    public int f27878f;

    static {
        C7937pm pmVar = new C7937pm();
        f27871g = pmVar;
        C62942bv.registerDefaultInstance(C7937pm.class, pmVar);
    }

    private C7937pm() {
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
                return newMessageInfo(f27871g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဌ\u0004\u0005င\u0005\u0006င\u0006", new Object[]{"a", "b", C7935pk.f27870a, C45240c.f118157a, "d", C7933pi.f27869a, "e", C10662f.f35572a});
            case 3:
                return new C7937pm();
            case 4:
                return new C7932ph();
            case 5:
                return f27871g;
            case 6:
                C63010eb ebVar = f27872h;
                if (ebVar == null) {
                    synchronized (C7937pm.class) {
                        ebVar = f27872h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27871g);
                            f27872h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
