package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aib */
/* compiled from: PG */
public final class aib extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final aib f158797c;

    /* renamed from: d */
    private static volatile C63010eb f158798d;

    /* renamed from: a */
    public int f158799a;

    /* renamed from: b */
    public int f158800b;

    static {
        aib aib = new aib();
        f158797c = aib;
        C62942bv.registerDefaultInstance(aib.class, aib);
    }

    private aib() {
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
                return newMessageInfo(f158797c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", aia.f158796a});
            case 3:
                return new aib();
            case 4:
                return new ahz();
            case 5:
                return f158797c;
            case 6:
                C63010eb ebVar = f158798d;
                if (ebVar == null) {
                    synchronized (aib.class) {
                        ebVar = f158798d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158797c);
                            f158798d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
