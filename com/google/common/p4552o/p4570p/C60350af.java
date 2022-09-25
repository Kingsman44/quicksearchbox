package com.google.common.p4552o.p4570p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.af */
/* compiled from: PG */
public final class C60350af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60350af f163344d;

    /* renamed from: e */
    private static volatile C63010eb f163345e;

    /* renamed from: a */
    public int f163346a;

    /* renamed from: b */
    public int f163347b;

    /* renamed from: c */
    public int f163348c;

    static {
        C60350af afVar = new C60350af();
        f163344d = afVar;
        C62942bv.registerDefaultInstance(C60350af.class, afVar);
    }

    private C60350af() {
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
                return newMessageInfo(f163344d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C60349ae.f163343a});
            case 3:
                return new C60350af();
            case 4:
                return new C60348ad();
            case 5:
                return f163344d;
            case 6:
                C63010eb ebVar = f163345e;
                if (ebVar == null) {
                    synchronized (C60350af.class) {
                        ebVar = f163345e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163344d);
                            f163345e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
