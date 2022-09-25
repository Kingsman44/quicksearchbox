package com.google.android.libraries.assistant.p1363c.p1364a.p1370c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.c.a.c.n */
/* compiled from: PG */
public final class C16990n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C16990n f49632b;

    /* renamed from: d */
    private static volatile C63010eb f49633d;

    /* renamed from: a */
    public C62971cq f49634a = emptyProtobufList();

    /* renamed from: c */
    private byte f49635c = 2;

    static {
        C16990n nVar = new C16990n();
        f49632b = nVar;
        C62942bv.registerDefaultInstance(C16990n.class, nVar);
    }

    private C16990n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f49635c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f49635c = b;
                return null;
            case 2:
                return newMessageInfo(f49632b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C16980d.class});
            case 3:
                return new C16990n();
            case 4:
                return new C16989m();
            case 5:
                return f49632b;
            case 6:
                C63010eb ebVar = f49633d;
                if (ebVar == null) {
                    synchronized (C16990n.class) {
                        ebVar = f49633d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49632b);
                            f49633d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
