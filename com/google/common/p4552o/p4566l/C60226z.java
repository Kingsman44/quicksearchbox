package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.z */
/* compiled from: PG */
public final class C60226z extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60226z f162945g;

    /* renamed from: h */
    private static volatile C63010eb f162946h;

    /* renamed from: a */
    public int f162947a;

    /* renamed from: b */
    public String f162948b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f162949c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f162950d;

    /* renamed from: e */
    public int f162951e;

    /* renamed from: f */
    public int f162952f;

    static {
        C60226z zVar = new C60226z();
        f162945g = zVar;
        C62942bv.registerDefaultInstance(C60226z.class, zVar);
    }

    private C60226z() {
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
                return newMessageInfo(f162945g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C142954b.m231902b(), "e", C60224x.f162944a, C10662f.f35572a, C60223w.m92549b()});
            case 3:
                return new C60226z();
            case 4:
                return new C60221u();
            case 5:
                return f162945g;
            case 6:
                C63010eb ebVar = f162946h;
                if (ebVar == null) {
                    synchronized (C60226z.class) {
                        ebVar = f162946h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162945g);
                            f162946h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
