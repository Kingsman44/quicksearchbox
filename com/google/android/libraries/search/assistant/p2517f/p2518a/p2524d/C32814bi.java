package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.bi */
/* compiled from: PG */
public final class C32814bi extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C32814bi f87999a;

    /* renamed from: c */
    private static volatile C63010eb f88000c;

    /* renamed from: b */
    private byte f88001b = 2;

    static {
        C32814bi biVar = new C32814bi();
        f87999a = biVar;
        C62942bv.registerDefaultInstance(C32814bi.class, biVar);
    }

    private C32814bi() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f88001b);
            case 1:
                this.f88001b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f87999a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C32814bi();
            case 4:
                return new C32813bh();
            case 5:
                return f87999a;
            case 6:
                C63010eb ebVar = f88000c;
                if (ebVar == null) {
                    synchronized (C32814bi.class) {
                        ebVar = f88000c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f87999a);
                            f88000c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
