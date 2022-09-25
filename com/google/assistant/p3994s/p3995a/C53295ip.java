package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ip */
/* compiled from: PG */
public final class C53295ip extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53295ip f139724a;

    /* renamed from: e */
    private static volatile C63010eb f139725e;

    /* renamed from: b */
    private int f139726b;

    /* renamed from: c */
    private C51447ia f139727c;

    /* renamed from: d */
    private byte f139728d = 2;

    static {
        C53295ip ipVar = new C53295ip();
        f139724a = ipVar;
        C62942bv.registerDefaultInstance(C53295ip.class, ipVar);
    }

    private C53295ip() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139728d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139728d = b;
                return null;
            case 2:
                return newMessageInfo(f139724a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C53295ip();
            case 4:
                return new C53294io();
            case 5:
                return f139724a;
            case 6:
                C63010eb ebVar = f139725e;
                if (ebVar == null) {
                    synchronized (C53295ip.class) {
                        ebVar = f139725e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139724a);
                            f139725e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
