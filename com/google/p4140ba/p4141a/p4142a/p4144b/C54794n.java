package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.n */
/* compiled from: PG */
public final class C54794n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54794n f143741d;

    /* renamed from: e */
    private static volatile C63010eb f143742e;

    /* renamed from: a */
    public int f143743a;

    /* renamed from: b */
    public int f143744b;

    /* renamed from: c */
    public boolean f143745c;

    static {
        C54794n nVar = new C54794n();
        f143741d = nVar;
        C62942bv.registerDefaultInstance(C54794n.class, nVar);
    }

    private C54794n() {
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
                return newMessageInfo(f143741d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C54792l.f143740a, C45240c.f118157a});
            case 3:
                return new C54794n();
            case 4:
                return new C54791k();
            case 5:
                return f143741d;
            case 6:
                C63010eb ebVar = f143742e;
                if (ebVar == null) {
                    synchronized (C54794n.class) {
                        ebVar = f143742e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143741d);
                            f143742e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
