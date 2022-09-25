package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.al */
/* compiled from: PG */
public final class C52679al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52679al f138278a;

    /* renamed from: b */
    private static volatile C63010eb f138279b;

    static {
        C52679al alVar = new C52679al();
        f138278a = alVar;
        C62942bv.registerDefaultInstance(C52679al.class, alVar);
    }

    private C52679al() {
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
                return newMessageInfo(f138278a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52679al();
            case 4:
                return new C52678ak();
            case 5:
                return f138278a;
            case 6:
                C63010eb ebVar = f138279b;
                if (ebVar == null) {
                    synchronized (C52679al.class) {
                        ebVar = f138279b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138278a);
                            f138279b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
