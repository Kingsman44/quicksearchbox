package com.google.assistant.p3994s.p3995a;

import com.google.assistant.p3820ak.C49217p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.oq */
/* compiled from: PG */
public final class C53458oq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53458oq f140302c;

    /* renamed from: e */
    private static volatile C63010eb f140303e;

    /* renamed from: a */
    public int f140304a = 0;

    /* renamed from: b */
    public Object f140305b;

    /* renamed from: d */
    private byte f140306d = 2;

    static {
        C53458oq oqVar = new C53458oq();
        f140302c = oqVar;
        C62942bv.registerDefaultInstance(C53458oq.class, oqVar);
    }

    private C53458oq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140306d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140306d = b;
                return null;
            case 2:
                return newMessageInfo(f140302c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C53442oa.class, C49217p.class});
            case 3:
                return new C53458oq();
            case 4:
                return new C53457op();
            case 5:
                return f140302c;
            case 6:
                C63010eb ebVar = f140303e;
                if (ebVar == null) {
                    synchronized (C53458oq.class) {
                        ebVar = f140303e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140302c);
                            f140303e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
