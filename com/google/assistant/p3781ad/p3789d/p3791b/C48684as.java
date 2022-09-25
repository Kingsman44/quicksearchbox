package com.google.assistant.p3781ad.p3789d.p3791b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.as */
/* compiled from: PG */
public final class C48684as extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48684as f125953b;

    /* renamed from: d */
    private static volatile C63010eb f125954d;

    /* renamed from: a */
    public C62971cq f125955a = emptyProtobufList();

    /* renamed from: c */
    private byte f125956c = 2;

    static {
        C48684as asVar = new C48684as();
        f125953b = asVar;
        C62942bv.registerDefaultInstance(C48684as.class, asVar);
    }

    private C48684as() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125956c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125956c = b;
                return null;
            case 2:
                return newMessageInfo(f125953b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C48682aq.class});
            case 3:
                return new C48684as();
            case 4:
                return new C48683ar();
            case 5:
                return f125953b;
            case 6:
                C63010eb ebVar = f125954d;
                if (ebVar == null) {
                    synchronized (C48684as.class) {
                        ebVar = f125954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125953b);
                            f125954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
