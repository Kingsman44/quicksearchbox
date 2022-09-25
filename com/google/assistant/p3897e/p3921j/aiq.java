package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aiq */
/* compiled from: PG */
public final class aiq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aiq f135190a;

    /* renamed from: b */
    private static volatile C63010eb f135191b;

    static {
        aiq aiq = new aiq();
        f135190a = aiq;
        C62942bv.registerDefaultInstance(aiq.class, aiq);
    }

    private aiq() {
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
                return newMessageInfo(f135190a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aiq();
            case 4:
                return new aip();
            case 5:
                return f135190a;
            case 6:
                C63010eb ebVar = f135191b;
                if (ebVar == null) {
                    synchronized (aiq.class) {
                        ebVar = f135191b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135190a);
                            f135191b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
