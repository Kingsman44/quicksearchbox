package com.google.assistant.p3745ab.p3759k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.k.b */
/* compiled from: PG */
public final class C48351b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48351b f125015a;

    /* renamed from: b */
    private static volatile C63010eb f125016b;

    static {
        C48351b bVar = new C48351b();
        f125015a = bVar;
        C62942bv.registerDefaultInstance(C48351b.class, bVar);
    }

    private C48351b() {
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
                return newMessageInfo(f125015a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48351b();
            case 4:
                return new C48350a();
            case 5:
                return f125015a;
            case 6:
                C63010eb ebVar = f125016b;
                if (ebVar == null) {
                    synchronized (C48351b.class) {
                        ebVar = f125016b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125015a);
                            f125016b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
