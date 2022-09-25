package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.aop */
/* compiled from: PG */
public final class aop extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final aop f159501f;

    /* renamed from: g */
    private static volatile C63010eb f159502g;

    /* renamed from: a */
    public int f159503a;

    /* renamed from: b */
    public boolean f159504b;

    /* renamed from: c */
    public boolean f159505c;

    /* renamed from: d */
    public boolean f159506d;

    /* renamed from: e */
    public int f159507e;

    static {
        aop aop = new aop();
        f159501f = aop;
        C62942bv.registerDefaultInstance(aop.class, aop);
    }

    private aop() {
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
                return newMessageInfo(f159501f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new aop();
            case 4:
                return new aoo();
            case 5:
                return f159501f;
            case 6:
                C63010eb ebVar = f159502g;
                if (ebVar == null) {
                    synchronized (aop.class) {
                        ebVar = f159502g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159501f);
                            f159502g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
