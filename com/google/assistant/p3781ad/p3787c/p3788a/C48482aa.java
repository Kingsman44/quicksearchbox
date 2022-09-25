package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.aa */
/* compiled from: PG */
public final class C48482aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48482aa f125238d;

    /* renamed from: e */
    private static volatile C63010eb f125239e;

    /* renamed from: a */
    public int f125240a;

    /* renamed from: b */
    public double f125241b;

    /* renamed from: c */
    public double f125242c;

    static {
        C48482aa aaVar = new C48482aa();
        f125238d = aaVar;
        C62942bv.registerDefaultInstance(C48482aa.class, aaVar);
    }

    private C48482aa() {
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
                return newMessageInfo(f125238d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48482aa();
            case 4:
                return new C48546z();
            case 5:
                return f125238d;
            case 6:
                C63010eb ebVar = f125239e;
                if (ebVar == null) {
                    synchronized (C48482aa.class) {
                        ebVar = f125239e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125238d);
                            f125239e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
