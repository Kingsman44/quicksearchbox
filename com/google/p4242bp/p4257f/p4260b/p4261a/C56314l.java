package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.lens.p4699e.C62195ah;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.l */
/* compiled from: PG */
public final class C56314l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56314l f150081b;

    /* renamed from: d */
    private static volatile C63010eb f150082d;

    /* renamed from: a */
    public C62971cq f150083a = emptyProtobufList();

    /* renamed from: c */
    private byte f150084c = 2;

    static {
        C56314l lVar = new C56314l();
        f150081b = lVar;
        C62942bv.registerDefaultInstance(C56314l.class, lVar);
    }

    private C56314l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150084c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150084c = b;
                return null;
            case 2:
                return newMessageInfo(f150081b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C62195ah.class});
            case 3:
                return new C56314l();
            case 4:
                return new C56313k();
            case 5:
                return f150081b;
            case 6:
                C63010eb ebVar = f150082d;
                if (ebVar == null) {
                    synchronized (C56314l.class) {
                        ebVar = f150082d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150081b);
                            f150082d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
