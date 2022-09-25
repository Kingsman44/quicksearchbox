package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.r */
/* compiled from: PG */
public final class C52911r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52911r f138750a;

    /* renamed from: b */
    private static volatile C63010eb f138751b;

    static {
        C52911r rVar = new C52911r();
        f138750a = rVar;
        C62942bv.registerDefaultInstance(C52911r.class, rVar);
    }

    private C52911r() {
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
                return newMessageInfo(f138750a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52911r();
            case 4:
                return new C52910q();
            case 5:
                return f138750a;
            case 6:
                C63010eb ebVar = f138751b;
                if (ebVar == null) {
                    synchronized (C52911r.class) {
                        ebVar = f138751b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138750a);
                            f138751b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
