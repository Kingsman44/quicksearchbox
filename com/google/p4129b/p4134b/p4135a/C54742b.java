package com.google.p4129b.p4134b.p4135a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.b.a.b */
/* compiled from: PG */
public final class C54742b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54742b f143653a;

    /* renamed from: b */
    private static volatile C63010eb f143654b;

    static {
        C54742b bVar = new C54742b();
        f143653a = bVar;
        C62942bv.registerDefaultInstance(C54742b.class, bVar);
    }

    private C54742b() {
        emptyIntList();
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
                return newMessageInfo(f143653a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54742b();
            case 4:
                return new C54741a();
            case 5:
                return f143653a;
            case 6:
                C63010eb ebVar = f143654b;
                if (ebVar == null) {
                    synchronized (C54742b.class) {
                        ebVar = f143654b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143653a);
                            f143654b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
