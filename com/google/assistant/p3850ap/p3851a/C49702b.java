package com.google.assistant.p3850ap.p3851a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ap.a.b */
/* compiled from: PG */
public final class C49702b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49702b f128278a;

    /* renamed from: b */
    private static volatile C63010eb f128279b;

    static {
        C49702b bVar = new C49702b();
        f128278a = bVar;
        C62942bv.registerDefaultInstance(C49702b.class, bVar);
    }

    private C49702b() {
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
                return newMessageInfo(f128278a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C49702b();
            case 4:
                return new C49701a();
            case 5:
                return f128278a;
            case 6:
                C63010eb ebVar = f128279b;
                if (ebVar == null) {
                    synchronized (C49702b.class) {
                        ebVar = f128279b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128278a);
                            f128279b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
