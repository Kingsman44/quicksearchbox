package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.ab */
/* compiled from: PG */
public final class C53542ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53542ab f140509b;

    /* renamed from: c */
    private static volatile C63010eb f140510c;

    /* renamed from: a */
    public C62971cq f140511a = emptyProtobufList();

    static {
        C53542ab abVar = new C53542ab();
        f140509b = abVar;
        C62942bv.registerDefaultInstance(C53542ab.class, abVar);
    }

    private C53542ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f140509b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53617z.class});
            case 3:
                return new C53542ab();
            case 4:
                return new C53541aa();
            case 5:
                return f140509b;
            case 6:
                C63010eb ebVar = f140510c;
                if (ebVar == null) {
                    synchronized (C53542ab.class) {
                        ebVar = f140510c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140509b);
                            f140510c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
