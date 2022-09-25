package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.afy */
/* compiled from: PG */
public final class afy extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final afy f135024a;

    /* renamed from: b */
    private static volatile C63010eb f135025b;

    static {
        afy afy = new afy();
        f135024a = afy;
        C62942bv.registerDefaultInstance(afy.class, afy);
    }

    private afy() {
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
                return newMessageInfo(f135024a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new afy();
            case 4:
                return new afx();
            case 5:
                return f135024a;
            case 6:
                C63010eb ebVar = f135025b;
                if (ebVar == null) {
                    synchronized (afy.class) {
                        ebVar = f135025b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135024a);
                            f135025b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
