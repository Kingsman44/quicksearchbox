package com.google.p4017at.p4027c.p4031b.p4041d.p4042a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.b.d.a.e */
/* compiled from: PG */
public final class C53910e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53910e f141461b;

    /* renamed from: d */
    private static volatile C63010eb f141462d;

    /* renamed from: a */
    public C62971cq f141463a = emptyProtobufList();

    /* renamed from: c */
    private byte f141464c = 2;

    static {
        C53910e eVar = new C53910e();
        f141461b = eVar;
        C62942bv.registerDefaultInstance(C53910e.class, eVar);
    }

    private C53910e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141464c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141464c = b;
                return null;
            case 2:
                return newMessageInfo(f141461b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53912g.class});
            case 3:
                return new C53910e();
            case 4:
                return new C53909d();
            case 5:
                return f141461b;
            case 6:
                C63010eb ebVar = f141462d;
                if (ebVar == null) {
                    synchronized (C53910e.class) {
                        ebVar = f141462d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141461b);
                            f141462d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
