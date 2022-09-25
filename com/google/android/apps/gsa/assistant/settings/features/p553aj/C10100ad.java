package com.google.android.apps.gsa.assistant.settings.features.p553aj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.aj.ad */
/* compiled from: PG */
public final class C10100ad extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C10100ad f34388f;

    /* renamed from: g */
    private static volatile C63010eb f34389g;

    /* renamed from: a */
    public int f34390a;

    /* renamed from: b */
    public C10098ab f34391b;

    /* renamed from: c */
    public C10098ab f34392c;

    /* renamed from: d */
    public C10098ab f34393d;

    /* renamed from: e */
    public C10098ab f34394e;

    static {
        C10100ad adVar = new C10100ad();
        f34388f = adVar;
        C62942bv.registerDefaultInstance(C10100ad.class, adVar);
    }

    private C10100ad() {
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
                return newMessageInfo(f34388f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000\u0004ဉ\u0003", new Object[]{"a", C45240c.f118157a, "d", "b", "e"});
            case 3:
                return new C10100ad();
            case 4:
                return new C10099ac();
            case 5:
                return f34388f;
            case 6:
                C63010eb ebVar = f34389g;
                if (ebVar == null) {
                    synchronized (C10100ad.class) {
                        ebVar = f34389g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34388f);
                            f34389g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
