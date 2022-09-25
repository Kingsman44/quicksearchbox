package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.bf */
/* compiled from: PG */
public final class C52883bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52883bf f138727a;

    /* renamed from: b */
    private static volatile C63010eb f138728b;

    static {
        C52883bf bfVar = new C52883bf();
        f138727a = bfVar;
        C62942bv.registerDefaultInstance(C52883bf.class, bfVar);
    }

    private C52883bf() {
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
                return newMessageInfo(f138727a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52883bf();
            case 4:
                return new C52882be();
            case 5:
                return f138727a;
            case 6:
                C63010eb ebVar = f138728b;
                if (ebVar == null) {
                    synchronized (C52883bf.class) {
                        ebVar = f138728b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138727a);
                            f138728b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
