package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.bq */
/* compiled from: PG */
public final class C65096bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65096bq f176249b;

    /* renamed from: d */
    private static volatile C63010eb f176250d;

    /* renamed from: a */
    public int f176251a;

    /* renamed from: c */
    private int f176252c;

    static {
        C65096bq bqVar = new C65096bq();
        f176249b = bqVar;
        C62942bv.registerDefaultInstance(C65096bq.class, bqVar);
    }

    private C65096bq() {
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
                return newMessageInfo(f176249b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C65094bo.f176248a});
            case 3:
                return new C65096bq();
            case 4:
                return new C65093bn();
            case 5:
                return f176249b;
            case 6:
                C63010eb ebVar = f176250d;
                if (ebVar == null) {
                    synchronized (C65096bq.class) {
                        ebVar = f176250d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176249b);
                            f176250d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
