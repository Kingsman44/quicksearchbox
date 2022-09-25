package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9025c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.c.c.b */
/* compiled from: PG */
public final class C119709b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C119709b f333525a;

    /* renamed from: b */
    private static volatile C63010eb f333526b;

    static {
        C119709b bVar = new C119709b();
        f333525a = bVar;
        C62942bv.registerDefaultInstance(C119709b.class, bVar);
    }

    private C119709b() {
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
                return newMessageInfo(f333525a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C119709b();
            case 4:
                return new C119708a();
            case 5:
                return f333525a;
            case 6:
                C63010eb ebVar = f333526b;
                if (ebVar == null) {
                    synchronized (C119709b.class) {
                        ebVar = f333526b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333525a);
                            f333526b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
