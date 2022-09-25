package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.co */
/* compiled from: PG */
public final class C59518co extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59518co f157917e;

    /* renamed from: f */
    private static volatile C63010eb f157918f;

    /* renamed from: a */
    public int f157919a;

    /* renamed from: b */
    public int f157920b;

    /* renamed from: c */
    public int f157921c;

    /* renamed from: d */
    public C62971cq f157922d = emptyProtobufList();

    static {
        C59518co coVar = new C59518co();
        f157917e = coVar;
        C62942bv.registerDefaultInstance(C59518co.class, coVar);
    }

    private C59518co() {
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
                return newMessageInfo(f157917e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C59511ch.class});
            case 3:
                return new C59518co();
            case 4:
                return new C59517cn();
            case 5:
                return f157917e;
            case 6:
                C63010eb ebVar = f157918f;
                if (ebVar == null) {
                    synchronized (C59518co.class) {
                        ebVar = f157918f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157917e);
                            f157918f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
