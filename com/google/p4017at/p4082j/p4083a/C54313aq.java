package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.aq */
/* compiled from: PG */
public final class C54313aq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54313aq f142682a;

    /* renamed from: b */
    private static volatile C63010eb f142683b;

    static {
        C54313aq aqVar = new C54313aq();
        f142682a = aqVar;
        C62942bv.registerDefaultInstance(C54313aq.class, aqVar);
    }

    private C54313aq() {
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
                return newMessageInfo(f142682a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54313aq();
            case 4:
                return new C54312ap();
            case 5:
                return f142682a;
            case 6:
                C63010eb ebVar = f142683b;
                if (ebVar == null) {
                    synchronized (C54313aq.class) {
                        ebVar = f142683b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142682a);
                            f142683b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
