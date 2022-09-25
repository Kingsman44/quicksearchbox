package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.ck */
/* compiled from: PG */
public final class C66166ck extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66166ck f179921e;

    /* renamed from: g */
    private static volatile C63010eb f179922g;

    /* renamed from: a */
    public int f179923a;

    /* renamed from: b */
    public C66244fd f179924b;

    /* renamed from: c */
    public C66208dv f179925c;

    /* renamed from: d */
    public C62971cq f179926d = emptyProtobufList();

    /* renamed from: f */
    private byte f179927f = 2;

    static {
        C66166ck ckVar = new C66166ck();
        f179921e = ckVar;
        C62942bv.registerDefaultInstance(C66166ck.class, ckVar);
    }

    private C66166ck() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179927f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179927f = b;
                return null;
            case 2:
                return newMessageInfo(f179921e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л", new Object[]{"a", "b", C45240c.f118157a, "d", C66166ck.class});
            case 3:
                return new C66166ck();
            case 4:
                return new C66165cj();
            case 5:
                return f179921e;
            case 6:
                C63010eb ebVar = f179922g;
                if (ebVar == null) {
                    synchronized (C66166ck.class) {
                        ebVar = f179922g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179921e);
                            f179922g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
