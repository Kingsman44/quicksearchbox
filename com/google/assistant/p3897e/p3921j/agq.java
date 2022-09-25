package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.agq */
/* compiled from: PG */
public final class agq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final agq f135069b;

    /* renamed from: d */
    private static volatile C63010eb f135070d;

    /* renamed from: a */
    public long f135071a;

    /* renamed from: c */
    private int f135072c;

    static {
        agq agq = new agq();
        f135069b = agq;
        C62942bv.registerDefaultInstance(agq.class, agq);
    }

    private agq() {
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
                return newMessageInfo(f135069b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new agq();
            case 4:
                return new agp();
            case 5:
                return f135069b;
            case 6:
                C63010eb ebVar = f135070d;
                if (ebVar == null) {
                    synchronized (agq.class) {
                        ebVar = f135070d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135069b);
                            f135070d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
