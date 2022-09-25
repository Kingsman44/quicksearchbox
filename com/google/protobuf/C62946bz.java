package com.google.protobuf;

/* renamed from: com.google.protobuf.bz */
/* compiled from: PG */
public final class C62946bz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62946bz f169983b;

    /* renamed from: c */
    private static volatile C63010eb f169984c;

    /* renamed from: a */
    public long f169985a;

    static {
        C62946bz bzVar = new C62946bz();
        f169983b = bzVar;
        C62942bv.registerDefaultInstance(C62946bz.class, bzVar);
    }

    private C62946bz() {
    }

    /* renamed from: a */
    public static C62946bz m95449a(long j) {
        C62945by byVar = (C62945by) f169983b.createBuilder();
        byVar.copyOnWrite();
        ((C62946bz) byVar.instance).f169985a = j;
        return (C62946bz) byVar.build();
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
                return newMessageInfo(f169983b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new C62946bz();
            case 4:
                return new C62945by();
            case 5:
                return f169983b;
            case 6:
                C63010eb ebVar = f169984c;
                if (ebVar == null) {
                    synchronized (C62946bz.class) {
                        ebVar = f169984c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169983b);
                            f169984c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
