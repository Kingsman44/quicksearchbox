package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.ar */
/* compiled from: PG */
public final class C54094ar extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C54094ar f141930a;

    /* renamed from: b */
    private static volatile C63010eb f141931b;

    static {
        C54094ar arVar = new C54094ar();
        f141930a = arVar;
        C62942bv.registerDefaultInstance(C54094ar.class, arVar);
    }

    private C54094ar() {
        emptyProtobufList();
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
                return newMessageInfo(f141930a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C54094ar();
            case 4:
                return new C54093aq();
            case 5:
                return f141930a;
            case 6:
                C63010eb ebVar = f141931b;
                if (ebVar == null) {
                    synchronized (C54094ar.class) {
                        ebVar = f141931b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141930a);
                            f141931b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
