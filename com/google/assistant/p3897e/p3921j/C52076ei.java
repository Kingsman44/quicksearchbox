package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.j.ei */
/* compiled from: PG */
public final class C52076ei extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C52076ei f136664f;

    /* renamed from: g */
    private static volatile C63010eb f136665g;

    /* renamed from: a */
    public int f136666a;

    /* renamed from: b */
    public C52428rj f136667b;

    /* renamed from: c */
    public C51809dy f136668c;

    /* renamed from: d */
    public C63088z f136669d = C63088z.f170246b;

    /* renamed from: e */
    public boolean f136670e;

    static {
        C52076ei eiVar = new C52076ei();
        f136664f = eiVar;
        C62942bv.registerDefaultInstance(C52076ei.class, eiVar);
    }

    private C52076ei() {
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
                return newMessageInfo(f136664f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0000\u0000\u0002ဉ\u0005\u0003ဉ\u0000\u0004ည\u0007\tဇ\n", new Object[]{"a", C45240c.f118157a, "b", "d", "e"});
            case 3:
                return new C52076ei();
            case 4:
                return new C52075eh();
            case 5:
                return f136664f;
            case 6:
                C63010eb ebVar = f136665g;
                if (ebVar == null) {
                    synchronized (C52076ei.class) {
                        ebVar = f136665g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136664f);
                            f136665g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
