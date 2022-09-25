package com.google.protos.p4985f.p5009j.p5016g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.g.b */
/* compiled from: PG */
public final class C64888b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64888b f175795a;

    /* renamed from: b */
    private static volatile C63010eb f175796b;

    static {
        C64888b bVar = new C64888b();
        f175795a = bVar;
        C62942bv.registerDefaultInstance(C64888b.class, bVar);
    }

    private C64888b() {
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
                return newMessageInfo(f175795a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64888b();
            case 4:
                return new C64887a();
            case 5:
                return f175795a;
            case 6:
                C63010eb ebVar = f175796b;
                if (ebVar == null) {
                    synchronized (C64888b.class) {
                        ebVar = f175796b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175795a);
                            f175796b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
