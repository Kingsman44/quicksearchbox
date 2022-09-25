package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.ag */
/* compiled from: PG */
public final class C52674ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52674ag f138274a;

    /* renamed from: b */
    private static volatile C63010eb f138275b;

    static {
        C52674ag agVar = new C52674ag();
        f138274a = agVar;
        C62942bv.registerDefaultInstance(C52674ag.class, agVar);
    }

    private C52674ag() {
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
                return newMessageInfo(f138274a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52674ag();
            case 4:
                return new C52673af();
            case 5:
                return f138274a;
            case 6:
                C63010eb ebVar = f138275b;
                if (ebVar == null) {
                    synchronized (C52674ag.class) {
                        ebVar = f138275b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138274a);
                            f138275b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
