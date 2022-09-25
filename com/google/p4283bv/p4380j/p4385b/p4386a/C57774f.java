package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.a.f */
/* compiled from: PG */
public final class C57774f extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57774f f154362a;

    /* renamed from: c */
    private static volatile C63010eb f154363c;

    /* renamed from: b */
    private byte f154364b = 2;

    static {
        C57774f fVar = new C57774f();
        f154362a = fVar;
        C62942bv.registerDefaultInstance(C57774f.class, fVar);
    }

    private C57774f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154364b);
            case 1:
                this.f154364b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f154362a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57774f();
            case 4:
                return new C57773e();
            case 5:
                return f154362a;
            case 6:
                C63010eb ebVar = f154363c;
                if (ebVar == null) {
                    synchronized (C57774f.class) {
                        ebVar = f154363c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154362a);
                            f154363c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
