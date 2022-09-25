package com.google.assistant.p3931f.p3939c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.c.k */
/* compiled from: PG */
public final class C52834k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52834k f138628a;

    /* renamed from: b */
    private static volatile C63010eb f138629b;

    static {
        C52834k kVar = new C52834k();
        f138628a = kVar;
        C62942bv.registerDefaultInstance(C52834k.class, kVar);
    }

    private C52834k() {
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
                return newMessageInfo(f138628a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52834k();
            case 4:
                return new C52833j();
            case 5:
                return f138628a;
            case 6:
                C63010eb ebVar = f138629b;
                if (ebVar == null) {
                    synchronized (C52834k.class) {
                        ebVar = f138629b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138628a);
                            f138629b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
