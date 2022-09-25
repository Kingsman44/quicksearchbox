package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.ag.c.dt */
/* compiled from: PG */
public final class C49027dt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49027dt f126812e;

    /* renamed from: f */
    private static volatile C63010eb f126813f;

    /* renamed from: a */
    public int f126814a;

    /* renamed from: b */
    public int f126815b;

    /* renamed from: c */
    public C63042fg f126816c;

    /* renamed from: d */
    public C63042fg f126817d;

    static {
        C49027dt dtVar = new C49027dt();
        f126812e = dtVar;
        C62942bv.registerDefaultInstance(C49027dt.class, dtVar);
    }

    private C49027dt() {
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
                return newMessageInfo(f126812e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C49025dr.f126811a, C45240c.f118157a, "d"});
            case 3:
                return new C49027dt();
            case 4:
                return new C49024dq();
            case 5:
                return f126812e;
            case 6:
                C63010eb ebVar = f126813f;
                if (ebVar == null) {
                    synchronized (C49027dt.class) {
                        ebVar = f126813f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126812e);
                            f126813f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
