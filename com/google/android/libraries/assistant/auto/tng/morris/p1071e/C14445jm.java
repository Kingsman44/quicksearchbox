package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.jm */
/* compiled from: PG */
public final class C14445jm extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C14445jm f43710a;

    /* renamed from: b */
    private static volatile C63010eb f43711b;

    static {
        C14445jm jmVar = new C14445jm();
        f43710a = jmVar;
        C62942bv.registerDefaultInstance(C14445jm.class, jmVar);
    }

    private C14445jm() {
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
                return newMessageInfo(f43710a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C14445jm();
            case 4:
                return new C14444jl();
            case 5:
                return f43710a;
            case 6:
                C63010eb ebVar = f43711b;
                if (ebVar == null) {
                    synchronized (C14445jm.class) {
                        ebVar = f43711b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43710a);
                            f43711b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
