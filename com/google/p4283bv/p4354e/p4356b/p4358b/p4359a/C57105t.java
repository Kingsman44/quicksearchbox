package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.t */
/* compiled from: PG */
public final class C57105t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57105t f152442b;

    /* renamed from: d */
    private static volatile C63010eb f152443d;

    /* renamed from: a */
    public C62971cq f152444a = emptyProtobufList();

    /* renamed from: c */
    private byte f152445c = 2;

    static {
        C57105t tVar = new C57105t();
        f152442b = tVar;
        C62942bv.registerDefaultInstance(C57105t.class, tVar);
    }

    private C57105t() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152445c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152445c = b;
                return null;
            case 2:
                return newMessageInfo(f152442b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57696b.class});
            case 3:
                return new C57105t();
            case 4:
                return new C57104s();
            case 5:
                return f152442b;
            case 6:
                C63010eb ebVar = f152443d;
                if (ebVar == null) {
                    synchronized (C57105t.class) {
                        ebVar = f152443d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152442b);
                            f152443d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
