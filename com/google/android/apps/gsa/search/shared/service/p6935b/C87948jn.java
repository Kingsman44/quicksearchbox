package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.jn */
/* compiled from: PG */
public final class C87948jn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C87948jn f237863a;

    /* renamed from: b */
    private static volatile C63010eb f237864b;

    static {
        C87948jn jnVar = new C87948jn();
        f237863a = jnVar;
        C62942bv.registerDefaultInstance(C87948jn.class, jnVar);
    }

    private C87948jn() {
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
                return newMessageInfo(f237863a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C87948jn();
            case 4:
                return new C87947jm();
            case 5:
                return f237863a;
            case 6:
                C63010eb ebVar = f237864b;
                if (ebVar == null) {
                    synchronized (C87948jn.class) {
                        ebVar = f237864b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237863a);
                            f237864b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
