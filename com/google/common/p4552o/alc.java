package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.alc */
/* compiled from: PG */
public final class alc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final alc f159009d;

    /* renamed from: e */
    private static volatile C63010eb f159010e;

    /* renamed from: a */
    public int f159011a;

    /* renamed from: b */
    public int f159012b;

    /* renamed from: c */
    public int f159013c;

    static {
        alc alc = new alc();
        f159009d = alc;
        C62942bv.registerDefaultInstance(alc.class, alc);
    }

    private alc() {
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
                return newMessageInfo(f159009d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", alf.m92429b(), C45240c.f118157a});
            case 3:
                return new alc();
            case 4:
                return new alb();
            case 5:
                return f159009d;
            case 6:
                C63010eb ebVar = f159010e;
                if (ebVar == null) {
                    synchronized (alc.class) {
                        ebVar = f159010e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159009d);
                            f159010e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
