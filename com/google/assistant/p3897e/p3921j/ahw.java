package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ahw */
/* compiled from: PG */
public final class ahw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final ahw f135121a;

    /* renamed from: b */
    private static volatile C63010eb f135122b;

    static {
        ahw ahw = new ahw();
        f135121a = ahw;
        C62942bv.registerDefaultInstance(ahw.class, ahw);
    }

    private ahw() {
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
                return newMessageInfo(f135121a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new ahw();
            case 4:
                return new ahv();
            case 5:
                return f135121a;
            case 6:
                C63010eb ebVar = f135122b;
                if (ebVar == null) {
                    synchronized (ahw.class) {
                        ebVar = f135122b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135121a);
                            f135122b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
