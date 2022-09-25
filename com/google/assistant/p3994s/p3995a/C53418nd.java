package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52013hl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.assistant.s.a.nd */
/* compiled from: PG */
public final class C53418nd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53418nd f140159d;

    /* renamed from: f */
    private static volatile C63010eb f140160f;

    /* renamed from: a */
    public int f140161a;

    /* renamed from: b */
    public C52013hl f140162b;

    /* renamed from: c */
    public C63204j f140163c;

    /* renamed from: e */
    private byte f140164e = 2;

    static {
        C53418nd ndVar = new C53418nd();
        f140159d = ndVar;
        C62942bv.registerDefaultInstance(C53418nd.class, ndVar);
    }

    private C53418nd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140164e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140164e = b;
                return null;
            case 2:
                return newMessageInfo(f140159d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53418nd();
            case 4:
                return new C53417nc();
            case 5:
                return f140159d;
            case 6:
                C63010eb ebVar = f140160f;
                if (ebVar == null) {
                    synchronized (C53418nd.class) {
                        ebVar = f140160f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140159d);
                            f140160f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
