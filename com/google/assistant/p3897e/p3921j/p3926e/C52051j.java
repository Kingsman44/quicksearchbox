package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.j */
/* compiled from: PG */
public final class C52051j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52051j f136613d;

    /* renamed from: f */
    private static volatile C63010eb f136614f;

    /* renamed from: a */
    public int f136615a = 0;

    /* renamed from: b */
    public Object f136616b;

    /* renamed from: c */
    public boolean f136617c;

    /* renamed from: e */
    private int f136618e;

    static {
        C52051j jVar = new C52051j();
        f136613d = jVar;
        C62942bv.registerDefaultInstance(C52051j.class, jVar);
    }

    private C52051j() {
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
                return newMessageInfo(f136613d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ဇ\u0002\u0003ြ\u0000", new Object[]{"b", "a", "e", C52028i.class, C45240c.f118157a, C51974g.class});
            case 3:
                return new C52051j();
            case 4:
                return new C51920e();
            case 5:
                return f136613d;
            case 6:
                C63010eb ebVar = f136614f;
                if (ebVar == null) {
                    synchronized (C52051j.class) {
                        ebVar = f136614f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136613d);
                            f136614f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
