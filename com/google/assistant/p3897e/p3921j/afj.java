package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afj */
/* compiled from: PG */
public final class afj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final afj f135003c;

    /* renamed from: d */
    private static volatile C63010eb f135004d;

    /* renamed from: a */
    public int f135005a;

    /* renamed from: b */
    public boolean f135006b;

    static {
        afj afj = new afj();
        f135003c = afj;
        C62942bv.registerDefaultInstance(afj.class, afj);
    }

    private afj() {
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
                return newMessageInfo(f135003c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new afj();
            case 4:
                return new afi();
            case 5:
                return f135003c;
            case 6:
                C63010eb ebVar = f135004d;
                if (ebVar == null) {
                    synchronized (afj.class) {
                        ebVar = f135004d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135003c);
                            f135004d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
