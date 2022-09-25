package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.j */
/* compiled from: PG */
public final class C54445j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54445j f142973a;

    /* renamed from: b */
    private static volatile C63010eb f142974b;

    static {
        C54445j jVar = new C54445j();
        f142973a = jVar;
        C62942bv.registerDefaultInstance(C54445j.class, jVar);
    }

    private C54445j() {
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
                return newMessageInfo(f142973a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54445j();
            case 4:
                return new C54444i();
            case 5:
                return f142973a;
            case 6:
                C63010eb ebVar = f142974b;
                if (ebVar == null) {
                    synchronized (C54445j.class) {
                        ebVar = f142974b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142973a);
                            f142974b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
