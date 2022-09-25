package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ao */
/* compiled from: PG */
public final class C119279ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C119279ao f332627a;

    /* renamed from: b */
    private static volatile C63010eb f332628b;

    static {
        C119279ao aoVar = new C119279ao();
        f332627a = aoVar;
        C62942bv.registerDefaultInstance(C119279ao.class, aoVar);
    }

    private C119279ao() {
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
                return newMessageInfo(f332627a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C119279ao();
            case 4:
                return new C119278an();
            case 5:
                return f332627a;
            case 6:
                C63010eb ebVar = f332628b;
                if (ebVar == null) {
                    synchronized (C119279ao.class) {
                        ebVar = f332628b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332627a);
                            f332628b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
