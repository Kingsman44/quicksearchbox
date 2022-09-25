package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ap */
/* compiled from: PG */
public final class C59465ap extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59465ap f157751e;

    /* renamed from: f */
    private static volatile C63010eb f157752f;

    /* renamed from: a */
    public int f157753a;

    /* renamed from: b */
    public C59469at f157754b;

    /* renamed from: c */
    public C62971cq f157755c = emptyProtobufList();

    /* renamed from: d */
    public int f157756d;

    static {
        C59465ap apVar = new C59465ap();
        f157751e = apVar;
        C62942bv.registerDefaultInstance(C59465ap.class, apVar);
    }

    private C59465ap() {
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
                return newMessageInfo(f157751e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"a", "b", C45240c.f118157a, C59467ar.class, "d"});
            case 3:
                return new C59465ap();
            case 4:
                return new C59464ao();
            case 5:
                return f157751e;
            case 6:
                C63010eb ebVar = f157752f;
                if (ebVar == null) {
                    synchronized (C59465ap.class) {
                        ebVar = f157752f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157751e);
                            f157752f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
