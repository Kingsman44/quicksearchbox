package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j */
/* compiled from: PG */
public final class C60003j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C60003j f162165g;

    /* renamed from: h */
    private static volatile C63010eb f162166h;

    /* renamed from: a */
    public int f162167a;

    /* renamed from: b */
    public String f162168b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f162169c;

    /* renamed from: d */
    public int f162170d;

    /* renamed from: e */
    public long f162171e;

    /* renamed from: f */
    public long f162172f;

    static {
        C60003j jVar = new C60003j();
        f162165g = jVar;
        C62942bv.registerDefaultInstance(C60003j.class, jVar);
    }

    private C60003j() {
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
                return newMessageInfo(f162165g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", C59834h.f161701a, "e", C10662f.f35572a});
            case 3:
                return new C60003j();
            case 4:
                return new C59799g();
            case 5:
                return f162165g;
            case 6:
                C63010eb ebVar = f162166h;
                if (ebVar == null) {
                    synchronized (C60003j.class) {
                        ebVar = f162166h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162165g);
                            f162166h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
