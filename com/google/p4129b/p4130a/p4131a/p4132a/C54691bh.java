package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.bh */
/* compiled from: PG */
public final class C54691bh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54691bh f143555c;

    /* renamed from: d */
    private static volatile C63010eb f143556d;

    /* renamed from: a */
    public int f143557a = 0;

    /* renamed from: b */
    public Object f143558b;

    static {
        C54691bh bhVar = new C54691bh();
        f143555c = bhVar;
        C62942bv.registerDefaultInstance(C54691bh.class, bhVar);
    }

    private C54691bh() {
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
                return newMessageInfo(f143555c, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C54717cg.class, C54703bt.class, C54676at.class, C54738x.class});
            case 3:
                return new C54691bh();
            case 4:
                return new C54690bg();
            case 5:
                return f143555c;
            case 6:
                C63010eb ebVar = f143556d;
                if (ebVar == null) {
                    synchronized (C54691bh.class) {
                        ebVar = f143556d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143555c);
                            f143556d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
