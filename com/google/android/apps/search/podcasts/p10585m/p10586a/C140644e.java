package com.google.android.apps.search.podcasts.p10585m.p10586a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.m.a.e */
/* compiled from: PG */
public final class C140644e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140644e f381988d;

    /* renamed from: e */
    private static volatile C63010eb f381989e;

    /* renamed from: a */
    public float f381990a;

    /* renamed from: b */
    public int f381991b;

    /* renamed from: c */
    public long f381992c;

    static {
        C140644e eVar = new C140644e();
        f381988d = eVar;
        C62942bv.registerDefaultInstance(C140644e.class, eVar);
    }

    private C140644e() {
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
                return newMessageInfo(f381988d, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0001\u0003\u0004\u0004\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140644e();
            case 4:
                return new C140643d();
            case 5:
                return f381988d;
            case 6:
                C63010eb ebVar = f381989e;
                if (ebVar == null) {
                    synchronized (C140644e.class) {
                        ebVar = f381989e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381988d);
                            f381989e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
