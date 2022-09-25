package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.b.a.a.a.af */
/* compiled from: PG */
public final class C54662af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54662af f143500a;

    /* renamed from: b */
    private static volatile C63010eb f143501b;

    static {
        C54662af afVar = new C54662af();
        f143500a = afVar;
        C62942bv.registerDefaultInstance(C54662af.class, afVar);
    }

    private C54662af() {
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
                return newMessageInfo(f143500a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54662af();
            case 4:
                return new C54661ae();
            case 5:
                return f143500a;
            case 6:
                C63010eb ebVar = f143501b;
                if (ebVar == null) {
                    synchronized (C54662af.class) {
                        ebVar = f143501b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143500a);
                            f143501b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
