package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.hu */
/* compiled from: PG */
public final class C52169hu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52169hu f136889a;

    /* renamed from: b */
    private static volatile C63010eb f136890b;

    static {
        C52169hu huVar = new C52169hu();
        f136889a = huVar;
        C62942bv.registerDefaultInstance(C52169hu.class, huVar);
    }

    private C52169hu() {
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
                return newMessageInfo(f136889a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52169hu();
            case 4:
                return new C52168ht();
            case 5:
                return f136889a;
            case 6:
                C63010eb ebVar = f136890b;
                if (ebVar == null) {
                    synchronized (C52169hu.class) {
                        ebVar = f136890b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136889a);
                            f136890b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
