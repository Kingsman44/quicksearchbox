package com.google.assistant.p3980n.p3986d.p3987a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.d.a.b */
/* compiled from: PG */
public final class C53028b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53028b f138990a;

    /* renamed from: b */
    private static volatile C63010eb f138991b;

    static {
        C53028b bVar = new C53028b();
        f138990a = bVar;
        C62942bv.registerDefaultInstance(C53028b.class, bVar);
    }

    private C53028b() {
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
                return newMessageInfo(f138990a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53028b();
            case 4:
                return new C53027a();
            case 5:
                return f138990a;
            case 6:
                C63010eb ebVar = f138991b;
                if (ebVar == null) {
                    synchronized (C53028b.class) {
                        ebVar = f138991b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138990a);
                            f138991b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
