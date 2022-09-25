package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.C49838aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.f */
/* compiled from: PG */
public final class C10261f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C10261f f34784d;

    /* renamed from: e */
    private static volatile C63010eb f34785e;

    /* renamed from: a */
    public int f34786a;

    /* renamed from: b */
    public C49838aw f34787b;

    /* renamed from: c */
    public C10260e f34788c;

    static {
        C10261f fVar = new C10261f();
        f34784d = fVar;
        C62942bv.registerDefaultInstance(C10261f.class, fVar);
    }

    private C10261f() {
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
                return newMessageInfo(f34784d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C10261f();
            case 4:
                return new C10258c();
            case 5:
                return f34784d;
            case 6:
                C63010eb ebVar = f34785e;
                if (ebVar == null) {
                    synchronized (C10261f.class) {
                        ebVar = f34785e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34784d);
                            f34785e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
