package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p001a.p007b.p011b.p012a.C0027c;

/* renamed from: com.google.common.o.dv */
/* compiled from: PG */
public final class C59737dv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59737dv f160341d;

    /* renamed from: e */
    private static volatile C63010eb f160342e;

    /* renamed from: a */
    public int f160343a;

    /* renamed from: b */
    public int f160344b;

    /* renamed from: c */
    public int f160345c;

    static {
        C59737dv dvVar = new C59737dv();
        f160341d = dvVar;
        C62942bv.registerDefaultInstance(C59737dv.class, dvVar);
    }

    private C59737dv() {
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
                return newMessageInfo(f160341d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C0027c.m10b(), C45240c.f118157a});
            case 3:
                return new C59737dv();
            case 4:
                return new C59736du();
            case 5:
                return f160341d;
            case 6:
                C63010eb ebVar = f160342e;
                if (ebVar == null) {
                    synchronized (C59737dv.class) {
                        ebVar = f160342e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160341d);
                            f160342e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
