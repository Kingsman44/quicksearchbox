package com.google.protobuf;

/* renamed from: com.google.protobuf.fb */
/* compiled from: PG */
public final class C63037fb extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63037fb f170144b;

    /* renamed from: c */
    private static volatile C63010eb f170145c;

    /* renamed from: a */
    public C62995dn f170146a = C62995dn.f170057a;

    static {
        C63037fb fbVar = new C63037fb();
        f170144b = fbVar;
        C62942bv.registerDefaultInstance(C63037fb.class, fbVar);
    }

    private C63037fb() {
    }

    /* renamed from: a */
    public final C62995dn mo59084a() {
        C62995dn dnVar = this.f170146a;
        if (!dnVar.f170058b) {
            this.f170146a = dnVar.mo58980a();
        }
        return this.f170146a;
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
                return newMessageInfo(f170144b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C63036fa.f170143a});
            case 3:
                return new C63037fb();
            case 4:
                return new C63034ez();
            case 5:
                return f170144b;
            case 6:
                C63010eb ebVar = f170145c;
                if (ebVar == null) {
                    synchronized (C63037fb.class) {
                        ebVar = f170145c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170144b);
                            f170145c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
