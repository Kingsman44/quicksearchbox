package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cf */
/* compiled from: PG */
public final class C57616cf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57616cf f153905b;

    /* renamed from: d */
    private static volatile C63010eb f153906d;

    /* renamed from: a */
    public C62971cq f153907a = emptyProtobufList();

    /* renamed from: c */
    private byte f153908c = 2;

    static {
        C57616cf cfVar = new C57616cf();
        f153905b = cfVar;
        C62942bv.registerDefaultInstance(C57616cf.class, cfVar);
    }

    private C57616cf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153908c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153908c = b;
                return null;
            case 2:
                return newMessageInfo(f153905b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57618ch.class});
            case 3:
                return new C57616cf();
            case 4:
                return new C57615ce();
            case 5:
                return f153905b;
            case 6:
                C63010eb ebVar = f153906d;
                if (ebVar == null) {
                    synchronized (C57616cf.class) {
                        ebVar = f153906d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153905b);
                            f153906d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
