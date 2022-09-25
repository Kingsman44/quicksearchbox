package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.cr */
/* compiled from: PG */
public final class C59521cr extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59521cr f157924d;

    /* renamed from: e */
    private static volatile C63010eb f157925e;

    /* renamed from: a */
    public int f157926a;

    /* renamed from: b */
    public int f157927b;

    /* renamed from: c */
    public C62995dn f157928c = C62995dn.f170057a;

    static {
        C59521cr crVar = new C59521cr();
        f157924d = crVar;
        C62942bv.registerDefaultInstance(C59521cr.class, crVar);
    }

    private C59521cr() {
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
                return newMessageInfo(f157924d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C59520cq.f157923a});
            case 3:
                return new C59521cr();
            case 4:
                return new C59519cp();
            case 5:
                return f157924d;
            case 6:
                C63010eb ebVar = f157925e;
                if (ebVar == null) {
                    synchronized (C59521cr.class) {
                        ebVar = f157925e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157924d);
                            f157925e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
