package com.google.protos.p5127o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.u */
/* compiled from: PG */
public final class C65695u extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C65695u f178492a;

    /* renamed from: c */
    private static volatile C63010eb f178493c;

    /* renamed from: b */
    private byte f178494b = 2;

    static {
        C65695u uVar = new C65695u();
        f178492a = uVar;
        C62942bv.registerDefaultInstance(C65695u.class, uVar);
    }

    private C65695u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178494b);
            case 1:
                this.f178494b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f178492a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65695u();
            case 4:
                return new C65694t();
            case 5:
                return f178492a;
            case 6:
                C63010eb ebVar = f178493c;
                if (ebVar == null) {
                    synchronized (C65695u.class) {
                        ebVar = f178493c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178492a);
                            f178493c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
