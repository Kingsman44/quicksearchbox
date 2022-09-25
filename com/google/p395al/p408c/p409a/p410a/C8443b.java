package com.google.p395al.p408c.p409a.p410a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.a.a.b */
/* compiled from: PG */
public final class C8443b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8443b f29340b;

    /* renamed from: d */
    private static volatile C63010eb f29341d;

    /* renamed from: a */
    public C62971cq f29342a = emptyProtobufList();

    /* renamed from: c */
    private byte f29343c = 2;

    static {
        C8443b bVar = new C8443b();
        f29340b = bVar;
        C62942bv.registerDefaultInstance(C8443b.class, bVar);
    }

    private C8443b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29343c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29343c = b;
                return null;
            case 2:
                return newMessageInfo(f29340b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8448g.class});
            case 3:
                return new C8443b();
            case 4:
                return new C8442a();
            case 5:
                return f29340b;
            case 6:
                C63010eb ebVar = f29341d;
                if (ebVar == null) {
                    synchronized (C8443b.class) {
                        ebVar = f29341d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29340b);
                            f29341d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
