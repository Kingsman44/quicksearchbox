package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.n */
/* compiled from: PG */
public final class C48732n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48732n f126102b;

    /* renamed from: c */
    private static volatile C63010eb f126103c;

    /* renamed from: a */
    public C62971cq f126104a = emptyProtobufList();

    static {
        C48732n nVar = new C48732n();
        f126102b = nVar;
        C62942bv.registerDefaultInstance(C48732n.class, nVar);
    }

    private C48732n() {
    }

    /* renamed from: a */
    public final void mo53180a() {
        C62971cq cqVar = this.f126104a;
        if (!cqVar.mo58948c()) {
            this.f126104a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f126102b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48734p.class});
            case 3:
                return new C48732n();
            case 4:
                return new C48731m();
            case 5:
                return f126102b;
            case 6:
                C63010eb ebVar = f126103c;
                if (ebVar == null) {
                    synchronized (C48732n.class) {
                        ebVar = f126103c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126102b);
                            f126103c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
