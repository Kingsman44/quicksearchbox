package com.google.p4160bf.p4161a.p4163b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.a.b.o */
/* compiled from: PG */
public final class C55507o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55507o f146480e;

    /* renamed from: f */
    private static volatile C63010eb f146481f;

    /* renamed from: a */
    public int f146482a;

    /* renamed from: b */
    public int f146483b = 0;

    /* renamed from: c */
    public Object f146484c;

    /* renamed from: d */
    public C55504l f146485d;

    static {
        C55507o oVar = new C55507o();
        f146480e = oVar;
        C62942bv.registerDefaultInstance(C55507o.class, oVar);
    }

    private C55507o() {
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
                return newMessageInfo(f146480e, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C55493cc.class, C55458av.class, C55479bp.class});
            case 3:
                return new C55507o();
            case 4:
                return new C55505m();
            case 5:
                return f146480e;
            case 6:
                C63010eb ebVar = f146481f;
                if (ebVar == null) {
                    synchronized (C55507o.class) {
                        ebVar = f146481f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146480e);
                            f146481f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
