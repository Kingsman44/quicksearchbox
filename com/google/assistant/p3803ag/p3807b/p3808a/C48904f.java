package com.google.assistant.p3803ag.p3807b.p3808a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.b.a.f */
/* compiled from: PG */
public final class C48904f extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C48904f f126552a;

    /* renamed from: c */
    private static volatile C63010eb f126553c;

    /* renamed from: b */
    private byte f126554b = 2;

    static {
        C48904f fVar = new C48904f();
        f126552a = fVar;
        C62942bv.registerDefaultInstance(C48904f.class, fVar);
    }

    private C48904f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126554b);
            case 1:
                this.f126554b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f126552a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48904f();
            case 4:
                return new C48903e();
            case 5:
                return f126552a;
            case 6:
                C63010eb ebVar = f126553c;
                if (ebVar == null) {
                    synchronized (C48904f.class) {
                        ebVar = f126553c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126552a);
                            f126553c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
