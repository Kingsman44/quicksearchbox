package com.google.protobuf;

/* renamed from: com.google.protobuf.dg */
/* compiled from: PG */
public final class C62988dg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62988dg f170043b;

    /* renamed from: c */
    private static volatile C63010eb f170044c;

    /* renamed from: a */
    public C62971cq f170045a = emptyProtobufList();

    static {
        C62988dg dgVar = new C62988dg();
        f170043b = dgVar;
        C62942bv.registerDefaultInstance(C62988dg.class, dgVar);
    }

    private C62988dg() {
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
                return newMessageInfo(f170043b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63063ga.class});
            case 3:
                return new C62988dg();
            case 4:
                return new C62987df();
            case 5:
                return f170043b;
            case 6:
                C63010eb ebVar = f170044c;
                if (ebVar == null) {
                    synchronized (C62988dg.class) {
                        ebVar = f170044c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170043b);
                            f170044c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
