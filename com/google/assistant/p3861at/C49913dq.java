package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.dq */
/* compiled from: PG */
public final class C49913dq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49913dq f129735e;

    /* renamed from: f */
    private static volatile C63010eb f129736f;

    /* renamed from: a */
    public int f129737a = 0;

    /* renamed from: b */
    public Object f129738b;

    /* renamed from: c */
    public int f129739c = 0;

    /* renamed from: d */
    public Object f129740d;

    static {
        C49913dq dqVar = new C49913dq();
        f129735e = dqVar;
        C62942bv.registerDefaultInstance(C49913dq.class, dqVar);
    }

    private C49913dq() {
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
                return newMessageInfo(f129735e, "\u0001\u0004\u0002\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0001\u0003ျ\u0000\u0004ျ\u0001", new Object[]{"b", "a", "d", C45240c.f118157a});
            case 3:
                return new C49913dq();
            case 4:
                return new C49912dp();
            case 5:
                return f129735e;
            case 6:
                C63010eb ebVar = f129736f;
                if (ebVar == null) {
                    synchronized (C49913dq.class) {
                        ebVar = f129736f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129735e);
                            f129736f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
