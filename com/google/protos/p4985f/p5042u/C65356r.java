package com.google.protos.p4985f.p5042u;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.u.r */
/* compiled from: PG */
public final class C65356r extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C65356r f177743a;

    /* renamed from: c */
    private static volatile C63010eb f177744c;

    /* renamed from: b */
    private byte f177745b = 2;

    static {
        C65356r rVar = new C65356r();
        f177743a = rVar;
        C62942bv.registerDefaultInstance(C65356r.class, rVar);
    }

    private C65356r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177745b);
            case 1:
                this.f177745b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f177743a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65356r();
            case 4:
                return new C65355q();
            case 5:
                return f177743a;
            case 6:
                C63010eb ebVar = f177744c;
                if (ebVar == null) {
                    synchronized (C65356r.class) {
                        ebVar = f177744c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177743a);
                            f177744c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
