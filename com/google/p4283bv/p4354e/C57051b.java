package com.google.p4283bv.p4354e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b */
/* compiled from: PG */
public final class C57051b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57051b f152305a;

    /* renamed from: c */
    private static volatile C63010eb f152306c;

    /* renamed from: b */
    private byte f152307b = 2;

    static {
        C57051b bVar = new C57051b();
        f152305a = bVar;
        C62942bv.registerDefaultInstance(C57051b.class, bVar);
    }

    private C57051b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152307b);
            case 1:
                this.f152307b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f152305a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57051b();
            case 4:
                return new C57042a();
            case 5:
                return f152305a;
            case 6:
                C63010eb ebVar = f152306c;
                if (ebVar == null) {
                    synchronized (C57051b.class) {
                        ebVar = f152306c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152305a);
                            f152306c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
