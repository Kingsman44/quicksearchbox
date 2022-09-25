package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9250a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.a.az */
/* compiled from: PG */
public final class C121843az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C121843az f338083a;

    /* renamed from: b */
    private static volatile C63010eb f338084b;

    static {
        C121843az azVar = new C121843az();
        f338083a = azVar;
        C62942bv.registerDefaultInstance(C121843az.class, azVar);
    }

    private C121843az() {
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
                return newMessageInfo(f338083a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C121843az();
            case 4:
                return new C121842ay();
            case 5:
                return f338083a;
            case 6:
                C63010eb ebVar = f338084b;
                if (ebVar == null) {
                    synchronized (C121843az.class) {
                        ebVar = f338084b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338083a);
                            f338084b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
