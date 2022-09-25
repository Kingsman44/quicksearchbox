package com.google.p4283bv.p4354e.p4356b.p4358b.p4360b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.b.n */
/* compiled from: PG */
public final class C57157n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57157n f152589b;

    /* renamed from: d */
    private static volatile C63010eb f152590d;

    /* renamed from: a */
    public boolean f152591a;

    /* renamed from: c */
    private int f152592c;

    static {
        C57157n nVar = new C57157n();
        f152589b = nVar;
        C62942bv.registerDefaultInstance(C57157n.class, nVar);
    }

    private C57157n() {
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
                return newMessageInfo(f152589b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57157n();
            case 4:
                return new C57156m();
            case 5:
                return f152589b;
            case 6:
                C63010eb ebVar = f152590d;
                if (ebVar == null) {
                    synchronized (C57157n.class) {
                        ebVar = f152590d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152589b);
                            f152590d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
