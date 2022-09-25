package com.google.protobuf;

/* renamed from: com.google.protobuf.ax */
/* compiled from: PG */
public final class C62916ax extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62916ax f169865a;

    /* renamed from: b */
    private static volatile C63010eb f169866b;

    static {
        C62916ax axVar = new C62916ax();
        f169865a = axVar;
        C62942bv.registerDefaultInstance(C62916ax.class, axVar);
    }

    private C62916ax() {
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
                return newMessageInfo(f169865a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62916ax();
            case 4:
                return new C62915aw();
            case 5:
                return f169865a;
            case 6:
                C63010eb ebVar = f169866b;
                if (ebVar == null) {
                    synchronized (C62916ax.class) {
                        ebVar = f169866b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169865a);
                            f169866b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
