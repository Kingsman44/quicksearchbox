package com.google.p371ag.p372a.p373a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ag.a.a.b */
/* compiled from: PG */
public final class C7498b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7498b f24709a;

    /* renamed from: b */
    private static volatile C63010eb f24710b;

    static {
        C7498b bVar = new C7498b();
        f24709a = bVar;
        C62942bv.registerDefaultInstance(C7498b.class, bVar);
    }

    private C7498b() {
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
                return newMessageInfo(f24709a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7498b();
            case 4:
                return new C7497a();
            case 5:
                return f24709a;
            case 6:
                C63010eb ebVar = f24710b;
                if (ebVar == null) {
                    synchronized (C7498b.class) {
                        ebVar = f24710b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24709a);
                            f24710b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
