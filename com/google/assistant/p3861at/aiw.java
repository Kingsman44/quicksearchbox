package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aiw */
/* compiled from: PG */
public final class aiw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final aiw f129439a;

    /* renamed from: b */
    private static volatile C63010eb f129440b;

    static {
        aiw aiw = new aiw();
        f129439a = aiw;
        C62942bv.registerDefaultInstance(aiw.class, aiw);
    }

    private aiw() {
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
                return newMessageInfo(f129439a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new aiw();
            case 4:
                return new aiv();
            case 5:
                return f129439a;
            case 6:
                C63010eb ebVar = f129440b;
                if (ebVar == null) {
                    synchronized (aiw.class) {
                        ebVar = f129440b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129439a);
                            f129440b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
