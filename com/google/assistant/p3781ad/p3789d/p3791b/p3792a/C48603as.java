package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.as */
/* compiled from: PG */
public final class C48603as extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48603as f125613d;

    /* renamed from: e */
    private static volatile C63010eb f125614e;

    /* renamed from: a */
    public double f125615a;

    /* renamed from: b */
    public double f125616b;

    /* renamed from: c */
    public long f125617c;

    static {
        C48603as asVar = new C48603as();
        f125613d = asVar;
        C62942bv.registerDefaultInstance(C48603as.class, asVar);
    }

    private C48603as() {
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
                return newMessageInfo(f125613d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48603as();
            case 4:
                return new C48602ar();
            case 5:
                return f125613d;
            case 6:
                C63010eb ebVar = f125614e;
                if (ebVar == null) {
                    synchronized (C48603as.class) {
                        ebVar = f125614e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125613d);
                            f125614e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
