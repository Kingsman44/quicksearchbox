package com.google.android.libraries.web.contrib.p3390j.p3396d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.contrib.j.d.l */
/* compiled from: PG */
public final class C43664l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C43664l f113936f;

    /* renamed from: g */
    private static volatile C63010eb f113937g;

    /* renamed from: a */
    public int f113938a;

    /* renamed from: b */
    public float f113939b = 14.0f;

    /* renamed from: c */
    public int f113940c = 1;

    /* renamed from: d */
    public int f113941d = 1;

    /* renamed from: e */
    public int f113942e = 1;

    static {
        C43664l lVar = new C43664l();
        f113936f = lVar;
        C62942bv.registerDefaultInstance(C43664l.class, lVar);
    }

    private C43664l() {
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
                return newMessageInfo(f113936f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, C43661i.m77040b(), "d", C43662j.f113935a, "e", C43659g.m77038b()});
            case 3:
                return new C43664l();
            case 4:
                return new C43657e();
            case 5:
                return f113936f;
            case 6:
                C63010eb ebVar = f113937g;
                if (ebVar == null) {
                    synchronized (C43664l.class) {
                        ebVar = f113937g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f113936f);
                            f113937g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
