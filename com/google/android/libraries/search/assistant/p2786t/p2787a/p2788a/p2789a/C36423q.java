package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a.p2789a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.a.q */
/* compiled from: PG */
public final class C36423q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C36423q f95112a;

    /* renamed from: b */
    private static volatile C63010eb f95113b;

    static {
        C36423q qVar = new C36423q();
        f95112a = qVar;
        C62942bv.registerDefaultInstance(C36423q.class, qVar);
    }

    private C36423q() {
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
                return newMessageInfo(f95112a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C36423q();
            case 4:
                return new C36422p();
            case 5:
                return f95112a;
            case 6:
                C63010eb ebVar = f95113b;
                if (ebVar == null) {
                    synchronized (C36423q.class) {
                        ebVar = f95113b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95112a);
                            f95113b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
