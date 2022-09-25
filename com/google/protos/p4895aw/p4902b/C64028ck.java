package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.ck */
/* compiled from: PG */
public final class C64028ck extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64028ck f173133b;

    /* renamed from: c */
    private static volatile C63010eb f173134c;

    /* renamed from: a */
    public C62971cq f173135a = emptyProtobufList();

    static {
        C64028ck ckVar = new C64028ck();
        f173133b = ckVar;
        C62942bv.registerDefaultInstance(C64028ck.class, ckVar);
    }

    private C64028ck() {
    }

    /* renamed from: a */
    public final void mo59250a() {
        C62971cq cqVar = this.f173135a;
        if (!cqVar.mo58948c()) {
            this.f173135a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f173133b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C64031cn.class});
            case 3:
                return new C64028ck();
            case 4:
                return new C64027cj();
            case 5:
                return f173133b;
            case 6:
                C63010eb ebVar = f173134c;
                if (ebVar == null) {
                    synchronized (C64028ck.class) {
                        ebVar = f173134c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173133b);
                            f173134c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
