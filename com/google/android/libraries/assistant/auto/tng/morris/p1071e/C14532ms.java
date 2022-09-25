package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ms */
/* compiled from: PG */
public final class C14532ms extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14532ms f43919b;

    /* renamed from: c */
    private static volatile C63010eb f43920c;

    /* renamed from: a */
    public C62971cq f43921a = emptyProtobufList();

    static {
        C14532ms msVar = new C14532ms();
        f43919b = msVar;
        C62942bv.registerDefaultInstance(C14532ms.class, msVar);
    }

    private C14532ms() {
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
                return newMessageInfo(f43919b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C14528mo.class});
            case 3:
                return new C14532ms();
            case 4:
                return new C14531mr();
            case 5:
                return f43919b;
            case 6:
                C63010eb ebVar = f43920c;
                if (ebVar == null) {
                    synchronized (C14532ms.class) {
                        ebVar = f43920c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43919b);
                            f43920c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
