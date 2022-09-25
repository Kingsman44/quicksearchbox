package com.google.protobuf;

/* renamed from: com.google.protobuf.at */
/* compiled from: PG */
public final class C62912at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62912at f169862a;

    /* renamed from: b */
    private static volatile C63010eb f169863b;

    static {
        C62912at atVar = new C62912at();
        f169862a = atVar;
        C62942bv.registerDefaultInstance(C62912at.class, atVar);
    }

    private C62912at() {
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
                return newMessageInfo(f169862a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C62912at();
            case 4:
                return new C62911as();
            case 5:
                return f169862a;
            case 6:
                C63010eb ebVar = f169863b;
                if (ebVar == null) {
                    synchronized (C62912at.class) {
                        ebVar = f169863b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169862a);
                            f169863b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
