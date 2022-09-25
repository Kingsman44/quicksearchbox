package com.google.protobuf;

/* renamed from: com.google.protobuf.ga */
/* compiled from: PG */
public final class C63063ga extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63063ga f170179c;

    /* renamed from: d */
    private static volatile C63010eb f170180d;

    /* renamed from: a */
    public int f170181a = 0;

    /* renamed from: b */
    public Object f170182b;

    static {
        C63063ga gaVar = new C63063ga();
        f170179c = gaVar;
        C62942bv.registerDefaultInstance(C63063ga.class, gaVar);
    }

    private C63063ga() {
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
                return newMessageInfo(f170179c, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C63037fb.class, C62988dg.class});
            case 3:
                return new C63063ga();
            case 4:
                return new C63060fy();
            case 5:
                return f170179c;
            case 6:
                C63010eb ebVar = f170180d;
                if (ebVar == null) {
                    synchronized (C63063ga.class) {
                        ebVar = f170180d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170179c);
                            f170180d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
