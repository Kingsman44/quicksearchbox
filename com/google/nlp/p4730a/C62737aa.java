package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.aa */
/* compiled from: PG */
public final class C62737aa extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62737aa f169457a;

    /* renamed from: b */
    private static volatile C63010eb f169458b;

    static {
        C62737aa aaVar = new C62737aa();
        f169457a = aaVar;
        C62942bv.registerDefaultInstance(C62737aa.class, aaVar);
    }

    private C62737aa() {
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
                return newMessageInfo(f169457a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62737aa();
            case 4:
                return new C62806z();
            case 5:
                return f169457a;
            case 6:
                C63010eb ebVar = f169458b;
                if (ebVar == null) {
                    synchronized (C62737aa.class) {
                        ebVar = f169458b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169457a);
                            f169458b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
