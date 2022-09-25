package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gy */
/* compiled from: PG */
public final class C55129gy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55129gy f145067c;

    /* renamed from: e */
    private static volatile C63010eb f145068e;

    /* renamed from: a */
    public int f145069a;

    /* renamed from: b */
    public int f145070b;

    /* renamed from: d */
    private int f145071d;

    static {
        C55129gy gyVar = new C55129gy();
        f145067c = gyVar;
        C62942bv.registerDefaultInstance(C55129gy.class, gyVar);
    }

    private C55129gy() {
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
                return newMessageInfo(f145067c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"d", "a", C55125gu.f145065a, "b", C55127gw.f145066a});
            case 3:
                return new C55129gy();
            case 4:
                return new C55124gt();
            case 5:
                return f145067c;
            case 6:
                C63010eb ebVar = f145068e;
                if (ebVar == null) {
                    synchronized (C55129gy.class) {
                        ebVar = f145068e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145067c);
                            f145068e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
