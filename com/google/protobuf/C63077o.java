package com.google.protobuf;

/* renamed from: com.google.protobuf.o */
/* compiled from: PG */
public final class C63077o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63077o f170228b;

    /* renamed from: c */
    private static volatile C63010eb f170229c;

    /* renamed from: a */
    public boolean f170230a;

    static {
        C63077o oVar = new C63077o();
        f170228b = oVar;
        C62942bv.registerDefaultInstance(C63077o.class, oVar);
    }

    private C63077o() {
    }

    /* renamed from: a */
    public static C63077o m96099a(boolean z) {
        C63076n nVar = (C63076n) f170228b.createBuilder();
        nVar.copyOnWrite();
        ((C63077o) nVar.instance).f170230a = z;
        return (C63077o) nVar.build();
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
                return newMessageInfo(f170228b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C63077o();
            case 4:
                return new C63076n();
            case 5:
                return f170228b;
            case 6:
                C63010eb ebVar = f170229c;
                if (ebVar == null) {
                    synchronized (C63077o.class) {
                        ebVar = f170229c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170228b);
                            f170229c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
