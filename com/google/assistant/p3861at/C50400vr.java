package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.vr */
/* compiled from: PG */
public final class C50400vr extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50400vr f131182e;

    /* renamed from: f */
    private static volatile C63010eb f131183f;

    /* renamed from: a */
    public int f131184a;

    /* renamed from: b */
    public int f131185b;

    /* renamed from: c */
    public C50397vo f131186c;

    /* renamed from: d */
    public C63088z f131187d = C63088z.f170246b;

    static {
        C50400vr vrVar = new C50400vr();
        f131182e = vrVar;
        C62942bv.registerDefaultInstance(C50400vr.class, vrVar);
    }

    private C50400vr() {
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
                return newMessageInfo(f131182e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0001\u0004ဌ\u0000\u0005ည\u0002", new Object[]{"a", C45240c.f118157a, "b", C50399vq.f131181a, "d"});
            case 3:
                return new C50400vr();
            case 4:
                return new C50398vp();
            case 5:
                return f131182e;
            case 6:
                C63010eb ebVar = f131183f;
                if (ebVar == null) {
                    synchronized (C50400vr.class) {
                        ebVar = f131183f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131182e);
                            f131183f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
