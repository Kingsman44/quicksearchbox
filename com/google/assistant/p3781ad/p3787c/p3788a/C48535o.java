package com.google.assistant.p3781ad.p3787c.p3788a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.o */
/* compiled from: PG */
public final class C48535o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48535o f125377d;

    /* renamed from: f */
    private static volatile C63010eb f125378f;

    /* renamed from: a */
    public int f125379a;

    /* renamed from: b */
    public C62995dn f125380b = C62995dn.f170057a;

    /* renamed from: c */
    public double f125381c;

    /* renamed from: e */
    private int f125382e;

    static {
        C48535o oVar = new C48535o();
        f125377d = oVar;
        C62942bv.registerDefaultInstance(C48535o.class, oVar);
    }

    private C48535o() {
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
                return newMessageInfo(f125377d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဌ\u0000\u00022\u0003က\u0001", new Object[]{"e", "a", C48536p.f125383a, "b", C48534n.f125376a, C45240c.f118157a});
            case 3:
                return new C48535o();
            case 4:
                return new C48533m();
            case 5:
                return f125377d;
            case 6:
                C63010eb ebVar = f125378f;
                if (ebVar == null) {
                    synchronized (C48535o.class) {
                        ebVar = f125378f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125377d);
                            f125378f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
