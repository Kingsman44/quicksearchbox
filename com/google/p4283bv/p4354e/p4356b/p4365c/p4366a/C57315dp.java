package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.p375ai.p378b.C7669fo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dp */
/* compiled from: PG */
public final class C57315dp extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57315dp f152986c;

    /* renamed from: e */
    private static volatile C63010eb f152987e;

    /* renamed from: a */
    public int f152988a;

    /* renamed from: b */
    public C7669fo f152989b;

    /* renamed from: d */
    private byte f152990d = 2;

    static {
        C57315dp dpVar = new C57315dp();
        f152986c = dpVar;
        C62942bv.registerDefaultInstance(C57315dp.class, dpVar);
    }

    private C57315dp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152990d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152990d = b;
                return null;
            case 2:
                return newMessageInfo(f152986c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57315dp();
            case 4:
                return new C57314do();
            case 5:
                return f152986c;
            case 6:
                C63010eb ebVar = f152987e;
                if (ebVar == null) {
                    synchronized (C57315dp.class) {
                        ebVar = f152987e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152986c);
                            f152987e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
