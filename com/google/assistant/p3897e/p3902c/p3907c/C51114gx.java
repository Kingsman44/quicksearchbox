package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.gx */
/* compiled from: PG */
public final class C51114gx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51114gx f133036b;

    /* renamed from: d */
    private static volatile C63010eb f133037d;

    /* renamed from: a */
    public C62971cq f133038a = emptyProtobufList();

    /* renamed from: c */
    private byte f133039c = 2;

    static {
        C51114gx gxVar = new C51114gx();
        f133036b = gxVar;
        C62942bv.registerDefaultInstance(C51114gx.class, gxVar);
    }

    private C51114gx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133039c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133039c = b;
                return null;
            case 2:
                return newMessageInfo(f133036b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C51119hb.class});
            case 3:
                return new C51114gx();
            case 4:
                return new C51113gw();
            case 5:
                return f133036b;
            case 6:
                C63010eb ebVar = f133037d;
                if (ebVar == null) {
                    synchronized (C51114gx.class) {
                        ebVar = f133037d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133036b);
                            f133037d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
