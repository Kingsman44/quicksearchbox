package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9031c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.d.c.b */
/* compiled from: PG */
public final class C119728b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C119728b f333553a;

    /* renamed from: b */
    private static volatile C63010eb f333554b;

    static {
        C119728b bVar = new C119728b();
        f333553a = bVar;
        C62942bv.registerDefaultInstance(C119728b.class, bVar);
    }

    private C119728b() {
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
                return newMessageInfo(f333553a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C119728b();
            case 4:
                return new C119727a();
            case 5:
                return f333553a;
            case 6:
                C63010eb ebVar = f333554b;
                if (ebVar == null) {
                    synchronized (C119728b.class) {
                        ebVar = f333554b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333553a);
                            f333554b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
