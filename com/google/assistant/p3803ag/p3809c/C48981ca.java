package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ca */
/* compiled from: PG */
public final class C48981ca extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48981ca f126715d;

    /* renamed from: e */
    private static volatile C63010eb f126716e;

    /* renamed from: a */
    public int f126717a;

    /* renamed from: b */
    public int f126718b;

    /* renamed from: c */
    public long f126719c = 5;

    static {
        C48981ca caVar = new C48981ca();
        f126715d = caVar;
        C62942bv.registerDefaultInstance(C48981ca.class, caVar);
    }

    private C48981ca() {
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
                return newMessageInfo(f126715d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", C48978by.f126704a, C45240c.f118157a});
            case 3:
                return new C48981ca();
            case 4:
                return new C48977bx();
            case 5:
                return f126715d;
            case 6:
                C63010eb ebVar = f126716e;
                if (ebVar == null) {
                    synchronized (C48981ca.class) {
                        ebVar = f126716e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126715d);
                            f126716e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
