package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.dj */
/* compiled from: PG */
public final class C57309dj extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57309dj f152970a;

    /* renamed from: c */
    private static volatile C63010eb f152971c;

    /* renamed from: b */
    private byte f152972b = 2;

    static {
        C57309dj djVar = new C57309dj();
        f152970a = djVar;
        C62942bv.registerDefaultInstance(C57309dj.class, djVar);
    }

    private C57309dj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152972b);
            case 1:
                this.f152972b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152970a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57309dj();
            case 4:
                return new C57308di();
            case 5:
                return f152970a;
            case 6:
                C63010eb ebVar = f152971c;
                if (ebVar == null) {
                    synchronized (C57309dj.class) {
                        ebVar = f152971c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152970a);
                            f152971c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
