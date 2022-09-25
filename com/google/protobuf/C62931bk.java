package com.google.protobuf;

/* renamed from: com.google.protobuf.bk */
/* compiled from: PG */
public final class C62931bk extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62931bk f169955b;

    /* renamed from: c */
    private static volatile C63010eb f169956c;

    /* renamed from: a */
    public float f169957a;

    static {
        C62931bk bkVar = new C62931bk();
        f169955b = bkVar;
        C62942bv.registerDefaultInstance(C62931bk.class, bkVar);
    }

    private C62931bk() {
    }

    /* renamed from: a */
    public static C62931bk m95422a(float f) {
        C62930bj bjVar = (C62930bj) f169955b.createBuilder();
        bjVar.copyOnWrite();
        ((C62931bk) bjVar.instance).f169957a = f;
        return (C62931bk) bjVar.build();
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
                return newMessageInfo(f169955b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
            case 3:
                return new C62931bk();
            case 4:
                return new C62930bj();
            case 5:
                return f169955b;
            case 6:
                C63010eb ebVar = f169956c;
                if (ebVar == null) {
                    synchronized (C62931bk.class) {
                        ebVar = f169956c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169955b);
                            f169956c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
