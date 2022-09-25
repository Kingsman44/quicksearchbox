package com.google.protobuf;

/* renamed from: com.google.protobuf.ar */
/* compiled from: PG */
public final class C62910ar extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62910ar f169858c;

    /* renamed from: d */
    private static volatile C63010eb f169859d;

    /* renamed from: a */
    public long f169860a;

    /* renamed from: b */
    public int f169861b;

    static {
        C62910ar arVar = new C62910ar();
        f169858c = arVar;
        C62942bv.registerDefaultInstance(C62910ar.class, arVar);
    }

    private C62910ar() {
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
                return newMessageInfo(f169858c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new C62910ar();
            case 4:
                return new C62909aq();
            case 5:
                return f169858c;
            case 6:
                C63010eb ebVar = f169859d;
                if (ebVar == null) {
                    synchronized (C62910ar.class) {
                        ebVar = f169859d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169858c);
                            f169859d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
