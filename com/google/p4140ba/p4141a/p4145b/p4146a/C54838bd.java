package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.bd */
/* compiled from: PG */
public final class C54838bd extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54838bd f143905f;

    /* renamed from: g */
    private static volatile C63010eb f143906g;

    /* renamed from: a */
    public int f143907a;

    /* renamed from: b */
    public boolean f143908b;

    /* renamed from: c */
    public float f143909c;

    /* renamed from: d */
    public float f143910d;

    /* renamed from: e */
    public boolean f143911e;

    static {
        C54838bd bdVar = new C54838bd();
        f143905f = bdVar;
        C62942bv.registerDefaultInstance(C54838bd.class, bdVar);
    }

    private C54838bd() {
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
                return newMessageInfo(f143905f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54838bd();
            case 4:
                return new C54837bc();
            case 5:
                return f143905f;
            case 6:
                C63010eb ebVar = f143906g;
                if (ebVar == null) {
                    synchronized (C54838bd.class) {
                        ebVar = f143906g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143905f);
                            f143906g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
