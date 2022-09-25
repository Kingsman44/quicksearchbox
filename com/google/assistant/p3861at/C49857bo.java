package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.bo */
/* compiled from: PG */
public final class C49857bo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49857bo f129562a;

    /* renamed from: b */
    private static volatile C63010eb f129563b;

    static {
        C49857bo boVar = new C49857bo();
        f129562a = boVar;
        C62942bv.registerDefaultInstance(C49857bo.class, boVar);
    }

    private C49857bo() {
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
                return newMessageInfo(f129562a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49857bo();
            case 4:
                return new C49856bn();
            case 5:
                return f129562a;
            case 6:
                C63010eb ebVar = f129563b;
                if (ebVar == null) {
                    synchronized (C49857bo.class) {
                        ebVar = f129563b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129562a);
                            f129563b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
