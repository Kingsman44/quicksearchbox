package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.aq */
/* compiled from: PG */
public final class C48943aq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48943aq f126640b;

    /* renamed from: d */
    private static volatile C63010eb f126641d;

    /* renamed from: a */
    public int f126642a;

    /* renamed from: c */
    private int f126643c;

    static {
        C48943aq aqVar = new C48943aq();
        f126640b = aqVar;
        C62942bv.registerDefaultInstance(C48943aq.class, aqVar);
    }

    private C48943aq() {
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
                return newMessageInfo(f126640b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48942ap.m85316b()});
            case 3:
                return new C48943aq();
            case 4:
                return new C48940an();
            case 5:
                return f126640b;
            case 6:
                C63010eb ebVar = f126641d;
                if (ebVar == null) {
                    synchronized (C48943aq.class) {
                        ebVar = f126641d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126640b);
                            f126641d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
