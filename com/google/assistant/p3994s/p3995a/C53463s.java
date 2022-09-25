package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.s */
/* compiled from: PG */
public final class C53463s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53463s f140317b;

    /* renamed from: d */
    private static volatile C63010eb f140318d;

    /* renamed from: a */
    public C62971cq f140319a = emptyProtobufList();

    /* renamed from: c */
    private byte f140320c = 2;

    static {
        C53463s sVar = new C53463s();
        f140317b = sVar;
        C62942bv.registerDefaultInstance(C53463s.class, sVar);
    }

    private C53463s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140320c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140320c = b;
                return null;
            case 2:
                return newMessageInfo(f140317b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C53387m.class});
            case 3:
                return new C53463s();
            case 4:
                return new C53462r();
            case 5:
                return f140317b;
            case 6:
                C63010eb ebVar = f140318d;
                if (ebVar == null) {
                    synchronized (C53463s.class) {
                        ebVar = f140318d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140317b);
                            f140318d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
