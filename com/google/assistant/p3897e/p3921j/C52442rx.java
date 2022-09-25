package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.rx */
/* compiled from: PG */
public final class C52442rx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52442rx f137659a;

    /* renamed from: b */
    private static volatile C63010eb f137660b;

    static {
        C52442rx rxVar = new C52442rx();
        f137659a = rxVar;
        C62942bv.registerDefaultInstance(C52442rx.class, rxVar);
    }

    private C52442rx() {
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
                return newMessageInfo(f137659a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52442rx();
            case 4:
                return new C52441rw();
            case 5:
                return f137659a;
            case 6:
                C63010eb ebVar = f137660b;
                if (ebVar == null) {
                    synchronized (C52442rx.class) {
                        ebVar = f137660b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137659a);
                            f137660b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
