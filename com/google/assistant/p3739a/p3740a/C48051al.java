package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.al */
/* compiled from: PG */
public final class C48051al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48051al f124374a;

    /* renamed from: b */
    private static volatile C63010eb f124375b;

    static {
        C48051al alVar = new C48051al();
        f124374a = alVar;
        C62942bv.registerDefaultInstance(C48051al.class, alVar);
    }

    private C48051al() {
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
                return newMessageInfo(f124374a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48051al();
            case 4:
                return new C48050ak();
            case 5:
                return f124374a;
            case 6:
                C63010eb ebVar = f124375b;
                if (ebVar == null) {
                    synchronized (C48051al.class) {
                        ebVar = f124375b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124374a);
                            f124375b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
