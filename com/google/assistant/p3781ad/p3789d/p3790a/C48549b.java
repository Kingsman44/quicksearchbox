package com.google.assistant.p3781ad.p3789d.p3790a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.a.b */
/* compiled from: PG */
public final class C48549b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48549b f125423a;

    /* renamed from: b */
    private static volatile C63010eb f125424b;

    static {
        C48549b bVar = new C48549b();
        f125423a = bVar;
        C62942bv.registerDefaultInstance(C48549b.class, bVar);
    }

    private C48549b() {
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
                return newMessageInfo(f125423a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48549b();
            case 4:
                return new C48548a();
            case 5:
                return f125423a;
            case 6:
                C63010eb ebVar = f125424b;
                if (ebVar == null) {
                    synchronized (C48549b.class) {
                        ebVar = f125424b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125423a);
                            f125424b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
