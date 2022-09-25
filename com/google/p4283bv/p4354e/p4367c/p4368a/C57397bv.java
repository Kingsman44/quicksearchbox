package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bv */
/* compiled from: PG */
public final class C57397bv extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57397bv f153317c;

    /* renamed from: e */
    private static volatile C63010eb f153318e;

    /* renamed from: a */
    public int f153319a = 0;

    /* renamed from: b */
    public Object f153320b;

    /* renamed from: d */
    private byte f153321d = 2;

    static {
        C57397bv bvVar = new C57397bv();
        f153317c = bvVar;
        C62942bv.registerDefaultInstance(C57397bv.class, bvVar);
    }

    private C57397bv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153321d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153321d = b;
                return null;
            case 2:
                return newMessageInfo(f153317c, "\u0001\u0004\u0001\u0000\u0002\u0005\u0004\u0000\u0000\u0001\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ᐼ\u0000", new Object[]{"b", "a", C57349aa.class, C57492fi.class, C57507o.class, C57488fe.class});
            case 3:
                return new C57397bv();
            case 4:
                return new C57395bt();
            case 5:
                return f153317c;
            case 6:
                C63010eb ebVar = f153318e;
                if (ebVar == null) {
                    synchronized (C57397bv.class) {
                        ebVar = f153318e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153317c);
                            f153318e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
