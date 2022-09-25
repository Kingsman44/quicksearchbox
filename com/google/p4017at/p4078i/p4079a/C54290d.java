package com.google.p4017at.p4078i.p4079a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.i.a.d */
/* compiled from: PG */
public final class C54290d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54290d f142638b;

    /* renamed from: d */
    private static volatile C63010eb f142639d;

    /* renamed from: a */
    public C62971cq f142640a = emptyProtobufList();

    /* renamed from: c */
    private byte f142641c = 2;

    static {
        C54290d dVar = new C54290d();
        f142638b = dVar;
        C62942bv.registerDefaultInstance(C54290d.class, dVar);
    }

    private C54290d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142641c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142641c = b;
                return null;
            case 2:
                return newMessageInfo(f142638b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C54292f.class});
            case 3:
                return new C54290d();
            case 4:
                return new C54289c();
            case 5:
                return f142638b;
            case 6:
                C63010eb ebVar = f142639d;
                if (ebVar == null) {
                    synchronized (C54290d.class) {
                        ebVar = f142639d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142638b);
                            f142639d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
