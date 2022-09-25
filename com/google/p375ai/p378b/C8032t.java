package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.t */
/* compiled from: PG */
public final class C8032t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8032t f28216c;

    /* renamed from: f */
    private static volatile C63010eb f28217f;

    /* renamed from: a */
    public C62971cq f28218a = emptyProtobufList();

    /* renamed from: b */
    public int f28219b = 1;

    /* renamed from: d */
    private int f28220d;

    /* renamed from: e */
    private byte f28221e = 2;

    static {
        C8032t tVar = new C8032t();
        f28216c = tVar;
        C62942bv.registerDefaultInstance(C8032t.class, tVar);
    }

    private C8032t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28221e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28221e = b;
                return null;
            case 2:
                return newMessageInfo(f28216c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"d", "a", C7918ou.class, "b", C7978r.f28034a});
            case 3:
                return new C8032t();
            case 4:
                return new C7951q();
            case 5:
                return f28216c;
            case 6:
                C63010eb ebVar = f28217f;
                if (ebVar == null) {
                    synchronized (C8032t.class) {
                        ebVar = f28217f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28216c);
                            f28217f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
