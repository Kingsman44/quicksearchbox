package com.google.android.libraries.search.p3055n.p3086i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.i.i */
/* compiled from: PG */
public final class C39787i extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C39787i f104645a;

    /* renamed from: c */
    private static volatile C63010eb f104646c;

    /* renamed from: b */
    private byte f104647b = 2;

    static {
        C39787i iVar = new C39787i();
        f104645a = iVar;
        C62942bv.registerDefaultInstance(C39787i.class, iVar);
    }

    private C39787i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f104647b);
            case 1:
                this.f104647b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f104645a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39787i();
            case 4:
                return new C39786h();
            case 5:
                return f104645a;
            case 6:
                C63010eb ebVar = f104646c;
                if (ebVar == null) {
                    synchronized (C39787i.class) {
                        ebVar = f104646c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104645a);
                            f104646c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
