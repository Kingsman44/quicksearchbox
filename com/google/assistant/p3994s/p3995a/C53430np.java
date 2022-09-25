package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51133hp;
import com.google.assistant.p3897e.p3921j.p3926e.C51992gr;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.np */
/* compiled from: PG */
public final class C53430np extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53430np f140222e;

    /* renamed from: g */
    private static volatile C63010eb f140223g;

    /* renamed from: a */
    public int f140224a;

    /* renamed from: b */
    public C62971cq f140225b = emptyProtobufList();

    /* renamed from: c */
    public int f140226c;

    /* renamed from: d */
    public long f140227d;

    /* renamed from: f */
    private byte f140228f = 2;

    static {
        C53430np npVar = new C53430np();
        f140222e = npVar;
        C62942bv.registerDefaultInstance(C53430np.class, npVar);
    }

    private C53430np() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140228f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140228f = b;
                return null;
            case 2:
                return newMessageInfo(f140222e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003ဂ\u0001", new Object[]{"a", "b", C51992gr.class, C45240c.f118157a, C51133hp.m86036b(), "d"});
            case 3:
                return new C53430np();
            case 4:
                return new C53429no();
            case 5:
                return f140222e;
            case 6:
                C63010eb ebVar = f140223g;
                if (ebVar == null) {
                    synchronized (C53430np.class) {
                        ebVar = f140223g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140222e);
                            f140223g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
