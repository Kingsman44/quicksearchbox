package com.google.protos.p4985f.p4986a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5001d.C64821c;

/* renamed from: com.google.protos.f.a.bj */
/* compiled from: PG */
public final class C64683bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64683bj f175334c;

    /* renamed from: d */
    private static volatile C63010eb f175335d;

    /* renamed from: a */
    public int f175336a;

    /* renamed from: b */
    public int f175337b;

    static {
        C64683bj bjVar = new C64683bj();
        f175334c = bjVar;
        C62942bv.registerDefaultInstance(C64683bj.class, bjVar);
    }

    private C64683bj() {
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
                return newMessageInfo(f175334c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C64821c.f175665a});
            case 3:
                return new C64683bj();
            case 4:
                return new C64682bi();
            case 5:
                return f175334c;
            case 6:
                C63010eb ebVar = f175335d;
                if (ebVar == null) {
                    synchronized (C64683bj.class) {
                        ebVar = f175335d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175334c);
                            f175335d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
