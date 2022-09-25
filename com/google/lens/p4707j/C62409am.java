package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.am */
/* compiled from: PG */
public final class C62409am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62409am f168465a;

    /* renamed from: b */
    private static volatile C63010eb f168466b;

    static {
        C62409am amVar = new C62409am();
        f168465a = amVar;
        C62942bv.registerDefaultInstance(C62409am.class, amVar);
    }

    private C62409am() {
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
                return newMessageInfo(f168465a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62409am();
            case 4:
                return new C62408al();
            case 5:
                return f168465a;
            case 6:
                C63010eb ebVar = f168466b;
                if (ebVar == null) {
                    synchronized (C62409am.class) {
                        ebVar = f168466b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168465a);
                            f168466b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
