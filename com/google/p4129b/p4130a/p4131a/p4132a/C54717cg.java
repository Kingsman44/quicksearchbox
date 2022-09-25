package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.cg */
/* compiled from: PG */
public final class C54717cg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54717cg f143608b;

    /* renamed from: c */
    private static volatile C63010eb f143609c;

    /* renamed from: a */
    public boolean f143610a;

    static {
        C54717cg cgVar = new C54717cg();
        f143608b = cgVar;
        C62942bv.registerDefaultInstance(C54717cg.class, cgVar);
    }

    private C54717cg() {
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
                return newMessageInfo(f143608b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C54717cg();
            case 4:
                return new C54716cf();
            case 5:
                return f143608b;
            case 6:
                C63010eb ebVar = f143609c;
                if (ebVar == null) {
                    synchronized (C54717cg.class) {
                        ebVar = f143609c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143608b);
                            f143609c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
