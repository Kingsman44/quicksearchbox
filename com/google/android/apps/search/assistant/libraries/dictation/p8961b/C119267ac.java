package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.ac */
/* compiled from: PG */
public final class C119267ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C119267ac f332608a;

    /* renamed from: b */
    private static volatile C63010eb f332609b;

    static {
        C119267ac acVar = new C119267ac();
        f332608a = acVar;
        C62942bv.registerDefaultInstance(C119267ac.class, acVar);
    }

    private C119267ac() {
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
                return newMessageInfo(f332608a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C119267ac();
            case 4:
                return new C119266ab();
            case 5:
                return f332608a;
            case 6:
                C63010eb ebVar = f332609b;
                if (ebVar == null) {
                    synchronized (C119267ac.class) {
                        ebVar = f332609b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332608a);
                            f332609b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
