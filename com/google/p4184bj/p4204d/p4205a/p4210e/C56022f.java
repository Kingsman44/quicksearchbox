package com.google.p4184bj.p4204d.p4205a.p4210e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.d.a.e.f */
/* compiled from: PG */
public final class C56022f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56022f f149189c;

    /* renamed from: d */
    private static volatile C63010eb f149190d;

    /* renamed from: a */
    public int f149191a = 0;

    /* renamed from: b */
    public Object f149192b;

    static {
        C56022f fVar = new C56022f();
        f149189c = fVar;
        C62942bv.registerDefaultInstance(C56022f.class, fVar);
    }

    private C56022f() {
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
                return newMessageInfo(f149189c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ျ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C56020d.class, C56018b.class});
            case 3:
                return new C56022f();
            case 4:
                return new C56021e();
            case 5:
                return f149189c;
            case 6:
                C63010eb ebVar = f149190d;
                if (ebVar == null) {
                    synchronized (C56022f.class) {
                        ebVar = f149190d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149189c);
                            f149190d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
