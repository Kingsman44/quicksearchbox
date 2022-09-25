package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.by */
/* compiled from: PG */
public final class C52719by extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52719by f138379a;

    /* renamed from: b */
    private static volatile C63010eb f138380b;

    static {
        C52719by byVar = new C52719by();
        f138379a = byVar;
        C62942bv.registerDefaultInstance(C52719by.class, byVar);
    }

    private C52719by() {
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
                return newMessageInfo(f138379a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52719by();
            case 4:
                return new C52718bx();
            case 5:
                return f138379a;
            case 6:
                C63010eb ebVar = f138380b;
                if (ebVar == null) {
                    synchronized (C52719by.class) {
                        ebVar = f138380b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138379a);
                            f138380b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
