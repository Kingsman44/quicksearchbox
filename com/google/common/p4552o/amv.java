package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amv */
/* compiled from: PG */
public final class amv extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final amv f159247f;

    /* renamed from: g */
    private static volatile C63010eb f159248g;

    /* renamed from: a */
    public int f159249a;

    /* renamed from: b */
    public boolean f159250b;

    /* renamed from: c */
    public boolean f159251c;

    /* renamed from: d */
    public int f159252d;

    /* renamed from: e */
    public boolean f159253e;

    static {
        amv amv = new amv();
        f159247f = amv;
        C62942bv.registerDefaultInstance(amv.class, amv);
    }

    private amv() {
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
                return newMessageInfo(f159247f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new amv();
            case 4:
                return new amu();
            case 5:
                return f159247f;
            case 6:
                C63010eb ebVar = f159248g;
                if (ebVar == null) {
                    synchronized (amv.class) {
                        ebVar = f159248g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159247f);
                            f159248g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
