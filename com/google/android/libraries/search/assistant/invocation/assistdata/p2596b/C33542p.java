package com.google.android.libraries.search.assistant.invocation.assistdata.p2596b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.assistdata.b.p */
/* compiled from: PG */
public final class C33542p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33542p f89710a;

    /* renamed from: b */
    private static volatile C63010eb f89711b;

    static {
        C33542p pVar = new C33542p();
        f89710a = pVar;
        C62942bv.registerDefaultInstance(C33542p.class, pVar);
    }

    private C33542p() {
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
                return newMessageInfo(f89710a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33542p();
            case 4:
                return new C33541o();
            case 5:
                return f89710a;
            case 6:
                C63010eb ebVar = f89711b;
                if (ebVar == null) {
                    synchronized (C33542p.class) {
                        ebVar = f89711b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f89710a);
                            f89711b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
