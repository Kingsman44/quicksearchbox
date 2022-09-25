package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.z */
/* compiled from: PG */
public final class C64350z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64350z f173949b;

    /* renamed from: d */
    private static volatile C63010eb f173950d;

    /* renamed from: a */
    public C62971cq f173951a = emptyProtobufList();

    /* renamed from: c */
    private byte f173952c = 2;

    static {
        C64350z zVar = new C64350z();
        f173949b = zVar;
        C62942bv.registerDefaultInstance(C64350z.class, zVar);
    }

    private C64350z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173952c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173952c = b;
                return null;
            case 2:
                return newMessageInfo(f173949b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64311bc.class});
            case 3:
                return new C64350z();
            case 4:
                return new C64349y();
            case 5:
                return f173949b;
            case 6:
                C63010eb ebVar = f173950d;
                if (ebVar == null) {
                    synchronized (C64350z.class) {
                        ebVar = f173950d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173949b);
                            f173950d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
