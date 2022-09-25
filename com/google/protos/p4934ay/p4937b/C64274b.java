package com.google.protos.p4934ay.p4937b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.b.b */
/* compiled from: PG */
public final class C64274b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64274b f173790b;

    /* renamed from: d */
    private static volatile C63010eb f173791d;

    /* renamed from: a */
    public C62971cq f173792a = emptyProtobufList();

    /* renamed from: c */
    private byte f173793c = 2;

    static {
        C64274b bVar = new C64274b();
        f173790b = bVar;
        C62942bv.registerDefaultInstance(C64274b.class, bVar);
    }

    private C64274b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173793c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173793c = b;
                return null;
            case 2:
                return newMessageInfo(f173790b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64276d.class});
            case 3:
                return new C64274b();
            case 4:
                return new C64273a();
            case 5:
                return f173790b;
            case 6:
                C63010eb ebVar = f173791d;
                if (ebVar == null) {
                    synchronized (C64274b.class) {
                        ebVar = f173791d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173790b);
                            f173791d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
