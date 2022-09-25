package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.aa */
/* compiled from: PG */
public final class C59450aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59450aa f157704d;

    /* renamed from: f */
    private static volatile C63010eb f157705f;

    /* renamed from: a */
    public boolean f157706a;

    /* renamed from: b */
    public boolean f157707b;

    /* renamed from: c */
    public boolean f157708c;

    /* renamed from: e */
    private int f157709e;

    static {
        C59450aa aaVar = new C59450aa();
        f157704d = aaVar;
        C62942bv.registerDefaultInstance(C59450aa.class, aaVar);
    }

    private C59450aa() {
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
                return newMessageInfo(f157704d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C59450aa();
            case 4:
                return new C59570z();
            case 5:
                return f157704d;
            case 6:
                C63010eb ebVar = f157705f;
                if (ebVar == null) {
                    synchronized (C59450aa.class) {
                        ebVar = f157705f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157704d);
                            f157705f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
