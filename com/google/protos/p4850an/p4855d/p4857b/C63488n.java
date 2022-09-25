package com.google.protos.p4850an.p4855d.p4857b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.b.n */
/* compiled from: PG */
public final class C63488n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63488n f171563d;

    /* renamed from: e */
    private static volatile C63010eb f171564e;

    /* renamed from: a */
    public int f171565a;

    /* renamed from: b */
    public double f171566b;

    /* renamed from: c */
    public boolean f171567c;

    static {
        C63488n nVar = new C63488n();
        f171563d = nVar;
        C62942bv.registerDefaultInstance(C63488n.class, nVar);
    }

    private C63488n() {
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
                return newMessageInfo(f171563d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002က\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63488n();
            case 4:
                return new C63487m();
            case 5:
                return f171563d;
            case 6:
                C63010eb ebVar = f171564e;
                if (ebVar == null) {
                    synchronized (C63488n.class) {
                        ebVar = f171564e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171563d);
                            f171564e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
