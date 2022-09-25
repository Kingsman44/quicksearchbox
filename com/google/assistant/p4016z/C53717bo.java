package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.bo */
/* compiled from: PG */
public final class C53717bo extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53717bo f141026a;

    /* renamed from: b */
    private static volatile C63010eb f141027b;

    static {
        C53717bo boVar = new C53717bo();
        f141026a = boVar;
        C62942bv.registerDefaultInstance(C53717bo.class, boVar);
    }

    private C53717bo() {
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
                return newMessageInfo(f141026a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53717bo();
            case 4:
                return new C53716bn();
            case 5:
                return f141026a;
            case 6:
                C63010eb ebVar = f141027b;
                if (ebVar == null) {
                    synchronized (C53717bo.class) {
                        ebVar = f141027b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141026a);
                            f141027b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
