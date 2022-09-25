package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pi */
/* compiled from: PG */
public final class C50229pi extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50229pi f130598a;

    /* renamed from: b */
    private static volatile C63010eb f130599b;

    static {
        C50229pi piVar = new C50229pi();
        f130598a = piVar;
        C62942bv.registerDefaultInstance(C50229pi.class, piVar);
    }

    private C50229pi() {
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
                return newMessageInfo(f130598a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50229pi();
            case 4:
                return new C50228ph();
            case 5:
                return f130598a;
            case 6:
                C63010eb ebVar = f130599b;
                if (ebVar == null) {
                    synchronized (C50229pi.class) {
                        ebVar = f130599b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130598a);
                            f130599b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
