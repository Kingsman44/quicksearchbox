package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.jq */
/* compiled from: PG */
public final class C7779jq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7779jq f27232e;

    /* renamed from: f */
    private static volatile C63010eb f27233f;

    /* renamed from: a */
    public int f27234a;

    /* renamed from: b */
    public C8150xj f27235b;

    /* renamed from: c */
    public C8086v f27236c;

    /* renamed from: d */
    public int f27237d;

    static {
        C7779jq jqVar = new C7779jq();
        f27232e = jqVar;
        C62942bv.registerDefaultInstance(C7779jq.class, jqVar);
    }

    private C7779jq() {
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
                return newMessageInfo(f27232e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C7779jq();
            case 4:
                return new C7778jp();
            case 5:
                return f27232e;
            case 6:
                C63010eb ebVar = f27233f;
                if (ebVar == null) {
                    synchronized (C7779jq.class) {
                        ebVar = f27233f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27232e);
                            f27233f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
