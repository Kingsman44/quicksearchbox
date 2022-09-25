package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.au */
/* compiled from: PG */
public final class C51833au extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51833au f135981a;

    /* renamed from: c */
    private static volatile C63010eb f135982c;

    /* renamed from: b */
    private byte f135983b = 2;

    static {
        C51833au auVar = new C51833au();
        f135981a = auVar;
        C62942bv.registerDefaultInstance(C51833au.class, auVar);
    }

    private C51833au() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f135983b);
            case 1:
                this.f135983b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f135981a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51833au();
            case 4:
                return new C51832at();
            case 5:
                return f135981a;
            case 6:
                C63010eb ebVar = f135982c;
                if (ebVar == null) {
                    synchronized (C51833au.class) {
                        ebVar = f135982c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135981a);
                            f135982c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
