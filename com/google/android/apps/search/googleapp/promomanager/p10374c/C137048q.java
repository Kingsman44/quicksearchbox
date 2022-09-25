package com.google.android.apps.search.googleapp.promomanager.p10374c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.q */
/* compiled from: PG */
public final class C137048q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C137048q f372969d;

    /* renamed from: e */
    private static volatile C63010eb f372970e;

    /* renamed from: a */
    public int f372971a;

    /* renamed from: b */
    public C63042fg f372972b;

    /* renamed from: c */
    public C137035d f372973c;

    static {
        C137048q qVar = new C137048q();
        f372969d = qVar;
        C62942bv.registerDefaultInstance(C137048q.class, qVar);
    }

    private C137048q() {
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
                return newMessageInfo(f372969d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C137048q();
            case 4:
                return new C137047p();
            case 5:
                return f372969d;
            case 6:
                C63010eb ebVar = f372970e;
                if (ebVar == null) {
                    synchronized (C137048q.class) {
                        ebVar = f372970e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372969d);
                            f372970e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
