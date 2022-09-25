package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ah */
/* compiled from: PG */
public final class C59457ah extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59457ah f157719e;

    /* renamed from: f */
    private static volatile C63010eb f157720f;

    /* renamed from: a */
    public int f157721a;

    /* renamed from: b */
    public long f157722b;

    /* renamed from: c */
    public long f157723c;

    /* renamed from: d */
    public int f157724d;

    static {
        C59457ah ahVar = new C59457ah();
        f157719e = ahVar;
        C62942bv.registerDefaultInstance(C59457ah.class, ahVar);
    }

    private C59457ah() {
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
                return newMessageInfo(f157719e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59457ah();
            case 4:
                return new C59456ag();
            case 5:
                return f157719e;
            case 6:
                C63010eb ebVar = f157720f;
                if (ebVar == null) {
                    synchronized (C59457ah.class) {
                        ebVar = f157720f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157719e);
                            f157720f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
