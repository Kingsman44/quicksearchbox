package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.dp */
/* compiled from: PG */
public final class C52764dp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52764dp f138459a;

    /* renamed from: b */
    private static volatile C63010eb f138460b;

    static {
        C52764dp dpVar = new C52764dp();
        f138459a = dpVar;
        C62942bv.registerDefaultInstance(C52764dp.class, dpVar);
    }

    private C52764dp() {
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
                return newMessageInfo(f138459a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52764dp();
            case 4:
                return new C52763do();
            case 5:
                return f138459a;
            case 6:
                C63010eb ebVar = f138460b;
                if (ebVar == null) {
                    synchronized (C52764dp.class) {
                        ebVar = f138460b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138459a);
                            f138460b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
