package com.google.p3562ao.p3563a.p3568d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.k */
/* compiled from: PG */
public final class C45573k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45573k f119105d;

    /* renamed from: e */
    private static volatile C63010eb f119106e;

    /* renamed from: a */
    public C45558bb f119107a;

    /* renamed from: b */
    public C45530aa f119108b;

    /* renamed from: c */
    public int f119109c;

    static {
        C45573k kVar = new C45573k();
        f119105d = kVar;
        C62942bv.registerDefaultInstance(C45573k.class, kVar);
    }

    private C45573k() {
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
                return newMessageInfo(f119105d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45573k();
            case 4:
                return new C45572j();
            case 5:
                return f119105d;
            case 6:
                C63010eb ebVar = f119106e;
                if (ebVar == null) {
                    synchronized (C45573k.class) {
                        ebVar = f119106e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119105d);
                            f119106e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
