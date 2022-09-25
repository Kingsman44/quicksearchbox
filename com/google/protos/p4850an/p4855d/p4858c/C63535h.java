package com.google.protos.p4850an.p4855d.p4858c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.d.c.h */
/* compiled from: PG */
public final class C63535h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63535h f171848b;

    /* renamed from: d */
    private static volatile C63010eb f171849d;

    /* renamed from: a */
    public C62971cq f171850a = emptyProtobufList();

    /* renamed from: c */
    private byte f171851c = 2;

    static {
        C63535h hVar = new C63535h();
        f171848b = hVar;
        C62942bv.registerDefaultInstance(C63535h.class, hVar);
    }

    private C63535h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171851c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171851c = b;
                return null;
            case 2:
                return newMessageInfo(f171848b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", C63531d.class});
            case 3:
                return new C63535h();
            case 4:
                return new C63534g();
            case 5:
                return f171848b;
            case 6:
                C63010eb ebVar = f171849d;
                if (ebVar == null) {
                    synchronized (C63535h.class) {
                        ebVar = f171849d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171848b);
                            f171849d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
