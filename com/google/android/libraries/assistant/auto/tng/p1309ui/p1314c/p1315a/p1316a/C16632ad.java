package com.google.android.libraries.assistant.auto.tng.p1309ui.p1314c.p1315a.p1316a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.c.a.a.ad */
/* compiled from: PG */
public final class C16632ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C16632ad f48719e;

    /* renamed from: f */
    private static volatile C63010eb f48720f;

    /* renamed from: a */
    public int f48721a;

    /* renamed from: b */
    public int f48722b = 0;

    /* renamed from: c */
    public Object f48723c;

    /* renamed from: d */
    public int f48724d;

    static {
        C16632ad adVar = new C16632ad();
        f48719e = adVar;
        C62942bv.registerDefaultInstance(C16632ad.class, adVar);
    }

    private C16632ad() {
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
                return newMessageInfo(f48719e, "\u0001\u0003\u0001\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\bဌ\u0002", new Object[]{C45240c.f118157a, "b", "a", "d", C16630ab.f48718a});
            case 3:
                return new C16632ad();
            case 4:
                return new C16661z();
            case 5:
                return f48719e;
            case 6:
                C63010eb ebVar = f48720f;
                if (ebVar == null) {
                    synchronized (C16632ad.class) {
                        ebVar = f48720f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48719e);
                            f48720f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
