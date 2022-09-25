package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.e */
/* compiled from: PG */
public final class C48862e extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C48862e f126439a;

    /* renamed from: c */
    private static volatile C63010eb f126440c;

    /* renamed from: b */
    private byte f126441b = 2;

    static {
        C48862e eVar = new C48862e();
        f126439a = eVar;
        C62942bv.registerDefaultInstance(C48862e.class, eVar);
    }

    private C48862e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126441b);
            case 1:
                this.f126441b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f126439a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48862e();
            case 4:
                return new C48861d();
            case 5:
                return f126439a;
            case 6:
                C63010eb ebVar = f126440c;
                if (ebVar == null) {
                    synchronized (C48862e.class) {
                        ebVar = f126440c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126439a);
                            f126440c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
