package com.google.common.p4552o.p4563i;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.alz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.ab */
/* compiled from: PG */
public final class C59866ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59866ab f161790e;

    /* renamed from: f */
    private static volatile C63010eb f161791f;

    /* renamed from: a */
    public int f161792a;

    /* renamed from: b */
    public alz f161793b;

    /* renamed from: c */
    public C59865aa f161794c;

    /* renamed from: d */
    public int f161795d;

    static {
        C59866ab abVar = new C59866ab();
        f161790e = abVar;
        C62942bv.registerDefaultInstance(C59866ab.class, abVar);
    }

    private C59866ab() {
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
                return newMessageInfo(f161790e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C59866ab();
            case 4:
                return new C59975y();
            case 5:
                return f161790e;
            case 6:
                C63010eb ebVar = f161791f;
                if (ebVar == null) {
                    synchronized (C59866ab.class) {
                        ebVar = f161791f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161790e);
                            f161791f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
