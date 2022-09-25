package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.bg */
/* compiled from: PG */
public final class C53097bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53097bg f139148c;

    /* renamed from: e */
    private static volatile C63010eb f139149e;

    /* renamed from: a */
    public C62971cq f139150a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f139151b = emptyProtobufList();

    /* renamed from: d */
    private byte f139152d = 2;

    static {
        C53097bg bgVar = new C53097bg();
        f139148c = bgVar;
        C62942bv.registerDefaultInstance(C53097bg.class, bgVar);
    }

    private C53097bg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139152d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139152d = b;
                return null;
            case 2:
                return newMessageInfo(f139148c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001b", new Object[]{"a", C53091ba.class, "b", C53095be.class});
            case 3:
                return new C53097bg();
            case 4:
                return new C53096bf();
            case 5:
                return f139148c;
            case 6:
                C63010eb ebVar = f139149e;
                if (ebVar == null) {
                    synchronized (C53097bg.class) {
                        ebVar = f139149e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139148c);
                            f139149e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
