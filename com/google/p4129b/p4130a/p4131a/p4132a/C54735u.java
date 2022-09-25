package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.u */
/* compiled from: PG */
public final class C54735u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54735u f143637a;

    /* renamed from: b */
    private static volatile C63010eb f143638b;

    static {
        C54735u uVar = new C54735u();
        f143637a = uVar;
        C62942bv.registerDefaultInstance(C54735u.class, uVar);
    }

    private C54735u() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f143637a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54735u();
            case 4:
                return new C54734t();
            case 5:
                return f143637a;
            case 6:
                C63010eb ebVar = f143638b;
                if (ebVar == null) {
                    synchronized (C54735u.class) {
                        ebVar = f143638b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143637a);
                            f143638b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
