package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cf */
/* compiled from: PG */
public final class C57408cf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57408cf f153369c;

    /* renamed from: d */
    private static volatile C63010eb f153370d;

    /* renamed from: a */
    public int f153371a = 0;

    /* renamed from: b */
    public Object f153372b;

    static {
        C57408cf cfVar = new C57408cf();
        f153369c = cfVar;
        C62942bv.registerDefaultInstance(C57408cf.class, cfVar);
    }

    private C57408cf() {
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
                return newMessageInfo(f153369c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001္\u0000\u0002ြ\u0000", new Object[]{"b", "a", C57410ch.class});
            case 3:
                return new C57408cf();
            case 4:
                return new C57407ce();
            case 5:
                return f153369c;
            case 6:
                C63010eb ebVar = f153370d;
                if (ebVar == null) {
                    synchronized (C57408cf.class) {
                        ebVar = f153370d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153369c);
                            f153370d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
