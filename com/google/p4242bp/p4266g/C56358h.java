package com.google.p4242bp.p4266g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65402d;

/* renamed from: com.google.bp.g.h */
/* compiled from: PG */
public final class C56358h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56358h f150302e;

    /* renamed from: f */
    private static volatile C63010eb f150303f;

    /* renamed from: a */
    public int f150304a;

    /* renamed from: b */
    public String f150305b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f150306c;

    /* renamed from: d */
    public C65402d f150307d;

    static {
        C56358h hVar = new C56358h();
        f150302e = hVar;
        C62942bv.registerDefaultInstance(C56358h.class, hVar);
    }

    private C56358h() {
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
                return newMessageInfo(f150302e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, C56360j.f150308a, "d"});
            case 3:
                return new C56358h();
            case 4:
                return new C56357g();
            case 5:
                return f150302e;
            case 6:
                C63010eb ebVar = f150303f;
                if (ebVar == null) {
                    synchronized (C56358h.class) {
                        ebVar = f150303f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150302e);
                            f150303f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
