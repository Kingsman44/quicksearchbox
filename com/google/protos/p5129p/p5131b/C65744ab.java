package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.ab */
/* compiled from: PG */
public final class C65744ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65744ab f178605b;

    /* renamed from: d */
    private static volatile C63010eb f178606d;

    /* renamed from: a */
    public C62971cq f178607a = emptyProtobufList();

    /* renamed from: c */
    private byte f178608c = 2;

    static {
        C65744ab abVar = new C65744ab();
        f178605b = abVar;
        C62942bv.registerDefaultInstance(C65744ab.class, abVar);
    }

    private C65744ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178608c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178608c = b;
                return null;
            case 2:
                return newMessageInfo(f178605b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65743aa.class});
            case 3:
                return new C65744ab();
            case 4:
                return new C65856y();
            case 5:
                return f178605b;
            case 6:
                C63010eb ebVar = f178606d;
                if (ebVar == null) {
                    synchronized (C65744ab.class) {
                        ebVar = f178606d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178605b);
                            f178606d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
