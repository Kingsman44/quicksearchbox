package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.ae */
/* compiled from: PG */
public final class C57223ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57223ae f152758a;

    /* renamed from: e */
    private static volatile C63010eb f152759e;

    /* renamed from: b */
    private int f152760b;

    /* renamed from: c */
    private C57696b f152761c;

    /* renamed from: d */
    private byte f152762d = 2;

    static {
        C57223ae aeVar = new C57223ae();
        f152758a = aeVar;
        C62942bv.registerDefaultInstance(C57223ae.class, aeVar);
    }

    private C57223ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152762d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152762d = b;
                return null;
            case 2:
                return newMessageInfo(f152758a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C57223ae();
            case 4:
                return new C57222ad();
            case 5:
                return f152758a;
            case 6:
                C63010eb ebVar = f152759e;
                if (ebVar == null) {
                    synchronized (C57223ae.class) {
                        ebVar = f152759e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152758a);
                            f152759e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
