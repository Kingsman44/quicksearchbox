package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ao */
/* compiled from: PG */
public final class C52682ao extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52682ao f138281a;

    /* renamed from: b */
    private static volatile C63010eb f138282b;

    static {
        C52682ao aoVar = new C52682ao();
        f138281a = aoVar;
        C62942bv.registerDefaultInstance(C52682ao.class, aoVar);
    }

    private C52682ao() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f138281a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52682ao();
            case 4:
                return new C52681an();
            case 5:
                return f138281a;
            case 6:
                C63010eb ebVar = f138282b;
                if (ebVar == null) {
                    synchronized (C52682ao.class) {
                        ebVar = f138282b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138281a);
                            f138282b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
