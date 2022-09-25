package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.r */
/* compiled from: PG */
public final class C10273r extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C10273r f34817e;

    /* renamed from: f */
    private static volatile C63010eb f34818f;

    /* renamed from: a */
    public int f34819a;

    /* renamed from: b */
    public C49838aw f34820b;

    /* renamed from: c */
    public C49826ak f34821c;

    /* renamed from: d */
    public long f34822d;

    static {
        C10273r rVar = new C10273r();
        f34817e = rVar;
        C62942bv.registerDefaultInstance(C10273r.class, rVar);
    }

    private C10273r() {
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
                return newMessageInfo(f34817e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C10273r();
            case 4:
                return new C10272q();
            case 5:
                return f34817e;
            case 6:
                C63010eb ebVar = f34818f;
                if (ebVar == null) {
                    synchronized (C10273r.class) {
                        ebVar = f34818f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34817e);
                            f34818f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
