package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ai */
/* compiled from: PG */
public final class C52676ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52676ai f138276a;

    /* renamed from: b */
    private static volatile C63010eb f138277b;

    static {
        C52676ai aiVar = new C52676ai();
        f138276a = aiVar;
        C62942bv.registerDefaultInstance(C52676ai.class, aiVar);
    }

    private C52676ai() {
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
                return newMessageInfo(f138276a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52676ai();
            case 4:
                return new C52675ah();
            case 5:
                return f138276a;
            case 6:
                C63010eb ebVar = f138277b;
                if (ebVar == null) {
                    synchronized (C52676ai.class) {
                        ebVar = f138277b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138276a);
                            f138277b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
