package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4868ao.p4871b.p4872a.C63654h;

/* renamed from: com.google.common.o.aid */
/* compiled from: PG */
public final class aid extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aid f158801c;

    /* renamed from: d */
    private static volatile C63010eb f158802d;

    /* renamed from: a */
    public int f158803a;

    /* renamed from: b */
    public int f158804b;

    static {
        aid aid = new aid();
        f158801c = aid;
        C62942bv.registerDefaultInstance(aid.class, aid);
    }

    private aid() {
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
                return newMessageInfo(f158801c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C63654h.f172135a});
            case 3:
                return new aid();
            case 4:
                return new aic();
            case 5:
                return f158801c;
            case 6:
                C63010eb ebVar = f158802d;
                if (ebVar == null) {
                    synchronized (aid.class) {
                        ebVar = f158802d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158801c);
                            f158802d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
