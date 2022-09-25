package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xh */
/* compiled from: PG */
public final class C60638xh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60638xh f164506e;

    /* renamed from: f */
    private static volatile C63010eb f164507f;

    /* renamed from: a */
    public int f164508a;

    /* renamed from: b */
    public String f164509b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f164510c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f164511d = BuildConfig.FLAVOR;

    static {
        C60638xh xhVar = new C60638xh();
        f164506e = xhVar;
        C62942bv.registerDefaultInstance(C60638xh.class, xhVar);
    }

    private C60638xh() {
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
                return newMessageInfo(f164506e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60638xh();
            case 4:
                return new C60637xg();
            case 5:
                return f164506e;
            case 6:
                C63010eb ebVar = f164507f;
                if (ebVar == null) {
                    synchronized (C60638xh.class) {
                        ebVar = f164507f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164506e);
                            f164507f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
