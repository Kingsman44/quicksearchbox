package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49838aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.l */
/* compiled from: PG */
public final class C10267l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C10267l f34802e;

    /* renamed from: f */
    private static volatile C63010eb f34803f;

    /* renamed from: a */
    public int f34804a;

    /* renamed from: b */
    public int f34805b = 0;

    /* renamed from: c */
    public Object f34806c;

    /* renamed from: d */
    public int f34807d;

    static {
        C10267l lVar = new C10267l();
        f34802e = lVar;
        C62942bv.registerDefaultInstance(C10267l.class, lVar);
    }

    private C10267l() {
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
                return newMessageInfo(f34802e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ြ\u0000\u0003ျ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C10266k.m25162b(), C49838aw.class});
            case 3:
                return new C10267l();
            case 4:
                return new C10264i();
            case 5:
                return f34802e;
            case 6:
                C63010eb ebVar = f34803f;
                if (ebVar == null) {
                    synchronized (C10267l.class) {
                        ebVar = f34803f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34802e);
                            f34803f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
