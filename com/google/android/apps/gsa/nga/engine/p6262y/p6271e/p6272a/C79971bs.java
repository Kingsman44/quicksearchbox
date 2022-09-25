package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.bs */
/* compiled from: PG */
public final class C79971bs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79971bs f219343e;

    /* renamed from: f */
    private static volatile C63010eb f219344f;

    /* renamed from: a */
    public int f219345a;

    /* renamed from: b */
    public float f219346b;

    /* renamed from: c */
    public float f219347c;

    /* renamed from: d */
    public float f219348d;

    static {
        C79971bs bsVar = new C79971bs();
        f219343e = bsVar;
        C62942bv.registerDefaultInstance(C79971bs.class, bsVar);
    }

    private C79971bs() {
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
                return newMessageInfo(f219343e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C79971bs();
            case 4:
                return new C79970br();
            case 5:
                return f219343e;
            case 6:
                C63010eb ebVar = f219344f;
                if (ebVar == null) {
                    synchronized (C79971bs.class) {
                        ebVar = f219344f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219343e);
                            f219344f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
