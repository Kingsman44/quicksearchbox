package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.q */
/* compiled from: PG */
public final class C18987q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18987q f53351a;

    /* renamed from: b */
    private static volatile C63010eb f53352b;

    static {
        C18987q qVar = new C18987q();
        f53351a = qVar;
        C62942bv.registerDefaultInstance(C18987q.class, qVar);
    }

    private C18987q() {
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
                return newMessageInfo(f53351a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C18987q();
            case 4:
                return new C18986p();
            case 5:
                return f53351a;
            case 6:
                C63010eb ebVar = f53352b;
                if (ebVar == null) {
                    synchronized (C18987q.class) {
                        ebVar = f53352b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53351a);
                            f53352b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
