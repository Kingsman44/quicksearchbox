package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.p4283bv.p4379i.C57672c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.y */
/* compiled from: PG */
public final class C63961y extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63961y f172986c;

    /* renamed from: d */
    private static volatile C63010eb f172987d;

    /* renamed from: a */
    public int f172988a = 0;

    /* renamed from: b */
    public Object f172989b;

    static {
        C63961y yVar = new C63961y();
        f172986c = yVar;
        C62942bv.registerDefaultInstance(C63961y.class, yVar);
    }

    private C63961y() {
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
                return newMessageInfo(f172986c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ျ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C63936bw.class, C57672c.class});
            case 3:
                return new C63961y();
            case 4:
                return new C63960x();
            case 5:
                return f172986c;
            case 6:
                C63010eb ebVar = f172987d;
                if (ebVar == null) {
                    synchronized (C63961y.class) {
                        ebVar = f172987d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172986c);
                            f172987d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
