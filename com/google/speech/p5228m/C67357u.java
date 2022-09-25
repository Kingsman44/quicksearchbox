package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.u */
/* compiled from: PG */
public final class C67357u extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C67357u f183084a;

    /* renamed from: c */
    private static volatile C63010eb f183085c;

    /* renamed from: b */
    private byte f183086b = 2;

    static {
        C67357u uVar = new C67357u();
        f183084a = uVar;
        C62942bv.registerDefaultInstance(C67357u.class, uVar);
    }

    private C67357u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183086b);
            case 1:
                this.f183086b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f183084a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67357u();
            case 4:
                return new C67356t();
            case 5:
                return f183084a;
            case 6:
                C63010eb ebVar = f183085c;
                if (ebVar == null) {
                    synchronized (C67357u.class) {
                        ebVar = f183085c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183084a);
                            f183085c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
