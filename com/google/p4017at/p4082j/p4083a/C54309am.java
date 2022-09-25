package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.am */
/* compiled from: PG */
public final class C54309am extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54309am f142677a;

    /* renamed from: b */
    private static volatile C63010eb f142678b;

    static {
        C54309am amVar = new C54309am();
        f142677a = amVar;
        C62942bv.registerDefaultInstance(C54309am.class, amVar);
    }

    private C54309am() {
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
                return newMessageInfo(f142677a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C54309am();
            case 4:
                return new C54308al();
            case 5:
                return f142677a;
            case 6:
                C63010eb ebVar = f142678b;
                if (ebVar == null) {
                    synchronized (C54309am.class) {
                        ebVar = f142678b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142677a);
                            f142678b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
