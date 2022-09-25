package com.google.protobuf;

/* renamed from: com.google.protobuf.fg */
/* compiled from: PG */
public final class C63042fg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63042fg f170152c;

    /* renamed from: d */
    private static volatile C63010eb f170153d;

    /* renamed from: a */
    public long f170154a;

    /* renamed from: b */
    public int f170155b;

    static {
        C63042fg fgVar = new C63042fg();
        f170152c = fgVar;
        C62942bv.registerDefaultInstance(C63042fg.class, fgVar);
    }

    private C63042fg() {
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
                return newMessageInfo(f170152c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C63042fg();
            case 4:
                return new C63041ff();
            case 5:
                return f170152c;
            case 6:
                C63010eb ebVar = f170153d;
                if (ebVar == null) {
                    synchronized (C63042fg.class) {
                        ebVar = f170153d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170152c);
                            f170153d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
