package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.da */
/* compiled from: PG */
public final class C57430da extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57430da f153406c;

    /* renamed from: d */
    private static volatile C63010eb f153407d;

    /* renamed from: a */
    public int f153408a = 0;

    /* renamed from: b */
    public Object f153409b;

    static {
        C57430da daVar = new C57430da();
        f153406c = daVar;
        C62942bv.registerDefaultInstance(C57430da.class, daVar);
    }

    private C57430da() {
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
                return newMessageInfo(f153406c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C57426cx.class, C57434de.class, C57424cv.class});
            case 3:
                return new C57430da();
            case 4:
                return new C57427cy();
            case 5:
                return f153406c;
            case 6:
                C63010eb ebVar = f153407d;
                if (ebVar == null) {
                    synchronized (C57430da.class) {
                        ebVar = f153407d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153406c);
                            f153407d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
