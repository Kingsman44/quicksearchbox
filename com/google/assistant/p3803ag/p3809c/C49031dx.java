package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.dx */
/* compiled from: PG */
public final class C49031dx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49031dx f126821b;

    /* renamed from: d */
    private static volatile C63010eb f126822d;

    /* renamed from: a */
    public C62971cq f126823a = emptyProtobufList();

    /* renamed from: c */
    private byte f126824c = 2;

    static {
        C49031dx dxVar = new C49031dx();
        f126821b = dxVar;
        C62942bv.registerDefaultInstance(C49031dx.class, dxVar);
    }

    private C49031dx() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126824c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126824c = b;
                return null;
            case 2:
                return newMessageInfo(f126821b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C49019dl.class});
            case 3:
                return new C49031dx();
            case 4:
                return new C49030dw();
            case 5:
                return f126821b;
            case 6:
                C63010eb ebVar = f126822d;
                if (ebVar == null) {
                    synchronized (C49031dx.class) {
                        ebVar = f126822d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126821b);
                            f126822d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
