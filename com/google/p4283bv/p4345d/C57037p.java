package com.google.p4283bv.p4345d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.p */
/* compiled from: PG */
public final class C57037p extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57037p f152271a;

    /* renamed from: c */
    private static volatile C63010eb f152272c;

    /* renamed from: b */
    private byte f152273b = 2;

    static {
        C57037p pVar = new C57037p();
        f152271a = pVar;
        C62942bv.registerDefaultInstance(C57037p.class, pVar);
    }

    private C57037p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152273b);
            case 1:
                this.f152273b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152271a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57037p();
            case 4:
                return new C57036o();
            case 5:
                return f152271a;
            case 6:
                C63010eb ebVar = f152272c;
                if (ebVar == null) {
                    synchronized (C57037p.class) {
                        ebVar = f152272c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152271a);
                            f152272c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
