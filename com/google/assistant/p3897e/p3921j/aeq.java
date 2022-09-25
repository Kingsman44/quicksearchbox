package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aeq */
/* compiled from: PG */
public final class aeq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aeq f134947f;

    /* renamed from: g */
    private static volatile C63010eb f134948g;

    /* renamed from: a */
    public int f134949a;

    /* renamed from: b */
    public int f134950b;

    /* renamed from: c */
    public boolean f134951c = true;

    /* renamed from: d */
    public boolean f134952d = true;

    /* renamed from: e */
    public boolean f134953e = true;

    static {
        aeq aeq = new aeq();
        f134947f = aeq;
        C62942bv.registerDefaultInstance(aeq.class, aeq);
    }

    private aeq() {
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
                return newMessageInfo(f134947f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aeq();
            case 4:
                return new aep();
            case 5:
                return f134947f;
            case 6:
                C63010eb ebVar = f134948g;
                if (ebVar == null) {
                    synchronized (aeq.class) {
                        ebVar = f134948g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134947f);
                            f134948g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
