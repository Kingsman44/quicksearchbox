package com.google.assistant.p3821al.p3822a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.al.a.j */
/* compiled from: PG */
public final class C49227j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49227j f127271a;

    /* renamed from: b */
    private static volatile C63010eb f127272b;

    static {
        C49227j jVar = new C49227j();
        f127271a = jVar;
        C62942bv.registerDefaultInstance(C49227j.class, jVar);
    }

    private C49227j() {
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
                return newMessageInfo(f127271a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49227j();
            case 4:
                return new C49226i();
            case 5:
                return f127271a;
            case 6:
                C63010eb ebVar = f127272b;
                if (ebVar == null) {
                    synchronized (C49227j.class) {
                        ebVar = f127272b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127271a);
                            f127272b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
