package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vz */
/* compiled from: PG */
public final class C60602vz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60602vz f164395e;

    /* renamed from: f */
    private static volatile C63010eb f164396f;

    /* renamed from: a */
    public int f164397a;

    /* renamed from: b */
    public String f164398b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f164399c = 1;

    /* renamed from: d */
    public int f164400d;

    static {
        C60602vz vzVar = new C60602vz();
        f164395e = vzVar;
        C62942bv.registerDefaultInstance(C60602vz.class, vzVar);
    }

    private C60602vz() {
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
                return newMessageInfo(f164395e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C60600vx.f164393a, "d", C60601vy.f164394a});
            case 3:
                return new C60602vz();
            case 4:
                return new C60599vw();
            case 5:
                return f164395e;
            case 6:
                C63010eb ebVar = f164396f;
                if (ebVar == null) {
                    synchronized (C60602vz.class) {
                        ebVar = f164396f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164395e);
                            f164396f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
