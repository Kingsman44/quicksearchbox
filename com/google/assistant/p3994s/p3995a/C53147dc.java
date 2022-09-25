package com.google.assistant.p3994s.p3995a;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.dc */
/* compiled from: PG */
public final class C53147dc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53147dc f139293b;

    /* renamed from: d */
    private static volatile C63010eb f139294d;

    /* renamed from: a */
    public C62971cq f139295a = emptyProtobufList();

    /* renamed from: c */
    private byte f139296c = 2;

    static {
        C53147dc dcVar = new C53147dc();
        f139293b = dcVar;
        C62942bv.registerDefaultInstance(C53147dc.class, dcVar);
    }

    private C53147dc() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139296c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139296c = b;
                return null;
            case 2:
                return newMessageInfo(f139293b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8242v.class});
            case 3:
                return new C53147dc();
            case 4:
                return new C53146db();
            case 5:
                return f139293b;
            case 6:
                C63010eb ebVar = f139294d;
                if (ebVar == null) {
                    synchronized (C53147dc.class) {
                        ebVar = f139294d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139293b);
                            f139294d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
