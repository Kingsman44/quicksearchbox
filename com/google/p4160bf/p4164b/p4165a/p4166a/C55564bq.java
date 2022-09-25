package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.bq */
/* compiled from: PG */
public final class C55564bq extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55564bq f146602f;

    /* renamed from: g */
    private static volatile C63010eb f146603g;

    /* renamed from: a */
    public int f146604a;

    /* renamed from: b */
    public int f146605b;

    /* renamed from: c */
    public int f146606c;

    /* renamed from: d */
    public int f146607d;

    /* renamed from: e */
    public int f146608e;

    static {
        C55564bq bqVar = new C55564bq();
        f146602f = bqVar;
        C62942bv.registerDefaultInstance(C55564bq.class, bqVar);
    }

    private C55564bq() {
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
                return newMessageInfo(f146602f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C55537aq.f146548a, C45240c.f118157a, C55589y.f146681a, "d", C55587w.f146680a, "e", C55559bl.f146594a});
            case 3:
                return new C55564bq();
            case 4:
                return new C55563bp();
            case 5:
                return f146602f;
            case 6:
                C63010eb ebVar = f146603g;
                if (ebVar == null) {
                    synchronized (C55564bq.class) {
                        ebVar = f146603g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146602f);
                            f146603g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
