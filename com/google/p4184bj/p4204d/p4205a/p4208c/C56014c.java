package com.google.p4184bj.p4204d.p4205a.p4208c;

import com.google.p3717aq.p3720b.p3721a.p3722a.C47889b;
import com.google.p4242bp.p4269i.p4270a.C56421b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.c.c */
/* compiled from: PG */
public final class C56014c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56014c f149175c;

    /* renamed from: d */
    private static volatile C63010eb f149176d;

    /* renamed from: a */
    public int f149177a = 0;

    /* renamed from: b */
    public Object f149178b;

    static {
        C56014c cVar = new C56014c();
        f149175c = cVar;
        C62942bv.registerDefaultInstance(C56014c.class, cVar);
    }

    private C56014c() {
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
                return newMessageInfo(f149175c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ျ\u0000\u0002ဿ\u0000\u0003ျ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C56012a.f149174a, C56421b.class, C47889b.class});
            case 3:
                return new C56014c();
            case 4:
                return new C56013b();
            case 5:
                return f149175c;
            case 6:
                C63010eb ebVar = f149176d;
                if (ebVar == null) {
                    synchronized (C56014c.class) {
                        ebVar = f149176d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149175c);
                            f149176d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
