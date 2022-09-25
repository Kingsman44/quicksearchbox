package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.f */
/* compiled from: PG */
public final class C57091f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57091f f152411b;

    /* renamed from: d */
    private static volatile C63010eb f152412d;

    /* renamed from: a */
    public C62971cq f152413a = emptyProtobufList();

    /* renamed from: c */
    private byte f152414c = 2;

    static {
        C57091f fVar = new C57091f();
        f152411b = fVar;
        C62942bv.registerDefaultInstance(C57091f.class, fVar);
    }

    private C57091f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152414c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152414c = b;
                return null;
            case 2:
                return newMessageInfo(f152411b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57696b.class});
            case 3:
                return new C57091f();
            case 4:
                return new C57090e();
            case 5:
                return f152411b;
            case 6:
                C63010eb ebVar = f152412d;
                if (ebVar == null) {
                    synchronized (C57091f.class) {
                        ebVar = f152412d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152411b);
                            f152412d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
