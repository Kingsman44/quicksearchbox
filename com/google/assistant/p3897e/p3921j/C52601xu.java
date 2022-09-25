package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.xu */
/* compiled from: PG */
public final class C52601xu extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52601xu f138113b;

    /* renamed from: d */
    private static volatile C63010eb f138114d;

    /* renamed from: a */
    public C62971cq f138115a = emptyProtobufList();

    /* renamed from: c */
    private byte f138116c = 2;

    static {
        C52601xu xuVar = new C52601xu();
        f138113b = xuVar;
        C62942bv.registerDefaultInstance(C52601xu.class, xuVar);
    }

    private C52601xu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f138116c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f138116c = b;
                return null;
            case 2:
                return newMessageInfo(f138113b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0001\u0003Л", new Object[]{"a", C52605xy.class});
            case 3:
                return new C52601xu();
            case 4:
                return new C52600xt();
            case 5:
                return f138113b;
            case 6:
                C63010eb ebVar = f138114d;
                if (ebVar == null) {
                    synchronized (C52601xu.class) {
                        ebVar = f138114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138113b);
                            f138114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
