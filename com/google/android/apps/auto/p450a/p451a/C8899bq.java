package com.google.android.apps.auto.p450a.p451a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.auto.a.a.bq */
/* compiled from: PG */
public final class C8899bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8899bq f30897b;

    /* renamed from: d */
    private static volatile C63010eb f30898d;

    /* renamed from: a */
    public int f30899a;

    /* renamed from: c */
    private int f30900c;

    static {
        C8899bq bqVar = new C8899bq();
        f30897b = bqVar;
        C62942bv.registerDefaultInstance(C8899bq.class, bqVar);
    }

    private C8899bq() {
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
                return newMessageInfo(f30897b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C8898bp.m23512b()});
            case 3:
                return new C8899bq();
            case 4:
                return new C8896bn();
            case 5:
                return f30897b;
            case 6:
                C63010eb ebVar = f30898d;
                if (ebVar == null) {
                    synchronized (C8899bq.class) {
                        ebVar = f30898d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30897b);
                            f30898d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
