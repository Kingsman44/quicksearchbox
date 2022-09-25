package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lm */
/* compiled from: PG */
public final class C60239lm extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60239lm f162973e;

    /* renamed from: f */
    private static volatile C63010eb f162974f;

    /* renamed from: a */
    public int f162975a;

    /* renamed from: b */
    public int f162976b;

    /* renamed from: c */
    public int f162977c;

    /* renamed from: d */
    public String f162978d = BuildConfig.FLAVOR;

    static {
        C60239lm lmVar = new C60239lm();
        f162973e = lmVar;
        C62942bv.registerDefaultInstance(C60239lm.class, lmVar);
    }

    private C60239lm() {
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
                return newMessageInfo(f162973e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဋ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", C60240ln.f162979a, C45240c.f118157a, "d"});
            case 3:
                return new C60239lm();
            case 4:
                return new C60238ll();
            case 5:
                return f162973e;
            case 6:
                C63010eb ebVar = f162974f;
                if (ebVar == null) {
                    synchronized (C60239lm.class) {
                        ebVar = f162974f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162973e);
                            f162974f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
