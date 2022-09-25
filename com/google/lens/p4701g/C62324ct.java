package com.google.lens.p4701g;

import com.google.android.libraries.p1657ba.p1664c.p1668c.C19652b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ct */
/* compiled from: PG */
public final class C62324ct extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62324ct f168237e;

    /* renamed from: f */
    private static volatile C63010eb f168238f;

    /* renamed from: a */
    public int f168239a;

    /* renamed from: b */
    public boolean f168240b;

    /* renamed from: c */
    public int f168241c;

    /* renamed from: d */
    public C62971cq f168242d = emptyProtobufList();

    static {
        C62324ct ctVar = new C62324ct();
        f168237e = ctVar;
        C62942bv.registerDefaultInstance(C62324ct.class, ctVar);
    }

    private C62324ct() {
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
                return newMessageInfo(f168237e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C62322cr.f168236a, "d", C19652b.class});
            case 3:
                return new C62324ct();
            case 4:
                return new C62321cq();
            case 5:
                return f168237e;
            case 6:
                C63010eb ebVar = f168238f;
                if (ebVar == null) {
                    synchronized (C62324ct.class) {
                        ebVar = f168238f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168237e);
                            f168238f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
