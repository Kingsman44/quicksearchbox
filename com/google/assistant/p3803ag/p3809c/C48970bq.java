package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.bq */
/* compiled from: PG */
public final class C48970bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48970bq f126685b;

    /* renamed from: d */
    private static volatile C63010eb f126686d;

    /* renamed from: a */
    public int f126687a = 1;

    /* renamed from: c */
    private int f126688c;

    static {
        C48970bq bqVar = new C48970bq();
        f126685b = bqVar;
        C62942bv.registerDefaultInstance(C48970bq.class, bqVar);
    }

    private C48970bq() {
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
                return newMessageInfo(f126685b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C48968bo.f126684a});
            case 3:
                return new C48970bq();
            case 4:
                return new C48967bn();
            case 5:
                return f126685b;
            case 6:
                C63010eb ebVar = f126686d;
                if (ebVar == null) {
                    synchronized (C48970bq.class) {
                        ebVar = f126686d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126685b);
                            f126686d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
