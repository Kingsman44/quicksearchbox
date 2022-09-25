package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.j */
/* compiled from: PG */
public final class C52903j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52903j f138741a;

    /* renamed from: b */
    private static volatile C63010eb f138742b;

    static {
        C52903j jVar = new C52903j();
        f138741a = jVar;
        C62942bv.registerDefaultInstance(C52903j.class, jVar);
    }

    private C52903j() {
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
                return newMessageInfo(f138741a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52903j();
            case 4:
                return new C52902i();
            case 5:
                return f138741a;
            case 6:
                C63010eb ebVar = f138742b;
                if (ebVar == null) {
                    synchronized (C52903j.class) {
                        ebVar = f138742b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138741a);
                            f138742b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
