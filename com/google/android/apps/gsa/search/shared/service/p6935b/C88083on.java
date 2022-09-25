package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.on */
/* compiled from: PG */
public final class C88083on extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88083on f238152d;

    /* renamed from: e */
    private static volatile C63010eb f238153e;

    /* renamed from: a */
    public int f238154a;

    /* renamed from: b */
    public int f238155b;

    /* renamed from: c */
    public int f238156c;

    static {
        C88083on onVar = new C88083on();
        f238152d = onVar;
        C62942bv.registerDefaultInstance(C88083on.class, onVar);
    }

    private C88083on() {
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
                return newMessageInfo(f238152d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88083on();
            case 4:
                return new C88082om();
            case 5:
                return f238152d;
            case 6:
                C63010eb ebVar = f238153e;
                if (ebVar == null) {
                    synchronized (C88083on.class) {
                        ebVar = f238153e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238152d);
                            f238153e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
