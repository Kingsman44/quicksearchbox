package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ap.b.a.e */
/* compiled from: PG */
public final class C63694e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63694e f172213b;

    /* renamed from: d */
    private static volatile C63010eb f172214d;

    /* renamed from: a */
    public C63700k f172215a;

    /* renamed from: c */
    private int f172216c;

    static {
        C63694e eVar = new C63694e();
        f172213b = eVar;
        C62942bv.registerDefaultInstance(C63694e.class, eVar);
    }

    private C63694e() {
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
                return newMessageInfo(f172213b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C63694e();
            case 4:
                return new C63693d();
            case 5:
                return f172213b;
            case 6:
                C63010eb ebVar = f172214d;
                if (ebVar == null) {
                    synchronized (C63694e.class) {
                        ebVar = f172214d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172213b);
                            f172214d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
