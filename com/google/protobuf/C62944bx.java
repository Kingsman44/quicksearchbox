package com.google.protobuf;

/* renamed from: com.google.protobuf.bx */
/* compiled from: PG */
public final class C62944bx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62944bx f169980b;

    /* renamed from: c */
    private static volatile C63010eb f169981c;

    /* renamed from: a */
    public int f169982a;

    static {
        C62944bx bxVar = new C62944bx();
        f169980b = bxVar;
        C62942bv.registerDefaultInstance(C62944bx.class, bxVar);
    }

    private C62944bx() {
    }

    /* renamed from: a */
    public static C62944bx m95448a(int i) {
        C62943bw bwVar = (C62943bw) f169980b.createBuilder();
        bwVar.copyOnWrite();
        ((C62944bx) bwVar.instance).f169982a = i;
        return (C62944bx) bwVar.build();
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
                return newMessageInfo(f169980b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C62944bx();
            case 4:
                return new C62943bw();
            case 5:
                return f169980b;
            case 6:
                C63010eb ebVar = f169981c;
                if (ebVar == null) {
                    synchronized (C62944bx.class) {
                        ebVar = f169981c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169980b);
                            f169981c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
