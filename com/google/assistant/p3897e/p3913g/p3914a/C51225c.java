package com.google.assistant.p3897e.p3913g.p3914a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.g.a.c */
/* compiled from: PG */
public final class C51225c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51225c f133369c;

    /* renamed from: d */
    private static volatile C63010eb f133370d;

    /* renamed from: a */
    public int f133371a;

    /* renamed from: b */
    public int f133372b;

    static {
        C51225c cVar = new C51225c();
        f133369c = cVar;
        C62942bv.registerDefaultInstance(C51225c.class, cVar);
    }

    private C51225c() {
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
                return newMessageInfo(f133369c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဌ\u0000", new Object[]{"a", "b", C51224b.f133368a});
            case 3:
                return new C51225c();
            case 4:
                return new C51223a();
            case 5:
                return f133369c;
            case 6:
                C63010eb ebVar = f133370d;
                if (ebVar == null) {
                    synchronized (C51225c.class) {
                        ebVar = f133370d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133369c);
                            f133370d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
