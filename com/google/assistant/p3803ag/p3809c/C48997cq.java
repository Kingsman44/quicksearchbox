package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.cq */
/* compiled from: PG */
public final class C48997cq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48997cq f126747e;

    /* renamed from: f */
    private static volatile C63010eb f126748f;

    /* renamed from: a */
    public int f126749a;

    /* renamed from: b */
    public int f126750b;

    /* renamed from: c */
    public int f126751c;

    /* renamed from: d */
    public long f126752d;

    static {
        C48997cq cqVar = new C48997cq();
        f126747e = cqVar;
        C62942bv.registerDefaultInstance(C48997cq.class, cqVar);
    }

    private C48997cq() {
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
                return newMessageInfo(f126747e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C48994cn.m85337b(), C45240c.f118157a, C48995co.f126746a, "d"});
            case 3:
                return new C48997cq();
            case 4:
                return new C48992cl();
            case 5:
                return f126747e;
            case 6:
                C63010eb ebVar = f126748f;
                if (ebVar == null) {
                    synchronized (C48997cq.class) {
                        ebVar = f126748f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126747e);
                            f126748f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
