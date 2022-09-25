package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.av */
/* compiled from: PG */
public final class C83841av extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83841av f228478e;

    /* renamed from: f */
    private static volatile C63010eb f228479f;

    /* renamed from: a */
    public int f228480a = 0;

    /* renamed from: b */
    public Object f228481b;

    /* renamed from: c */
    public int f228482c = 0;

    /* renamed from: d */
    public Object f228483d;

    static {
        C83841av avVar = new C83841av();
        f228478e = avVar;
        C62942bv.registerDefaultInstance(C83841av.class, avVar);
    }

    private C83841av() {
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
                return newMessageInfo(f228478e, "\u0001\b\u0002\u0000\u0001\b\b\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0001\u0004ြ\u0001\u0005ြ\u0001\u0006ြ\u0001\u0007ြ\u0001\bြ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a, C83825af.class, C83832am.class, C83864x.class, C83840au.class, C83823ad.class, C83854n.class, C83860t.class, C83848h.class});
            case 3:
                return new C83841av();
            case 4:
                return new C83843c();
            case 5:
                return f228478e;
            case 6:
                C63010eb ebVar = f228479f;
                if (ebVar == null) {
                    synchronized (C83841av.class) {
                        ebVar = f228479f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228478e);
                            f228479f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
