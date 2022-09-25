package com.google.protos.p4881ar.p4882a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ar.a.b */
/* compiled from: PG */
public final class C63771b extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C63771b f172510a;

    /* renamed from: c */
    private static volatile C63010eb f172511c;

    /* renamed from: b */
    private byte f172512b = 2;

    static {
        C63771b bVar = new C63771b();
        f172510a = bVar;
        C62942bv.registerDefaultInstance(C63771b.class, bVar);
    }

    private C63771b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172512b);
            case 1:
                this.f172512b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f172510a, "\u0003\u0000", (Object[]) null);
            case 3:
                return new C63771b();
            case 4:
                return new C63770a();
            case 5:
                return f172510a;
            case 6:
                C63010eb ebVar = f172511c;
                if (ebVar == null) {
                    synchronized (C63771b.class) {
                        ebVar = f172511c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172510a);
                            f172511c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
