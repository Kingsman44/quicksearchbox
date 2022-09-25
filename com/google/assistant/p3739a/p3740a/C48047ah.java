package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ah */
/* compiled from: PG */
public final class C48047ah extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48047ah f124370a;

    /* renamed from: b */
    private static volatile C63010eb f124371b;

    static {
        C48047ah ahVar = new C48047ah();
        f124370a = ahVar;
        C62942bv.registerDefaultInstance(C48047ah.class, ahVar);
    }

    private C48047ah() {
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
                return newMessageInfo(f124370a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48047ah();
            case 4:
                return new C48046ag();
            case 5:
                return f124370a;
            case 6:
                C63010eb ebVar = f124371b;
                if (ebVar == null) {
                    synchronized (C48047ah.class) {
                        ebVar = f124371b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124370a);
                            f124371b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
