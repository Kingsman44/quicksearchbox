package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.tw */
/* compiled from: PG */
public final class C60545tw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C60545tw f164030b;

    /* renamed from: c */
    private static volatile C63010eb f164031c;

    /* renamed from: a */
    public C62971cq f164032a = emptyProtobufList();

    static {
        C60545tw twVar = new C60545tw();
        f164030b = twVar;
        C62942bv.registerDefaultInstance(C60545tw.class, twVar);
    }

    private C60545tw() {
    }

    /* renamed from: a */
    public final void mo57109a() {
        C62971cq cqVar = this.f164032a;
        if (!cqVar.mo58948c()) {
            this.f164032a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f164030b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C60544tv.class});
            case 3:
                return new C60545tw();
            case 4:
                return new C60540tr();
            case 5:
                return f164030b;
            case 6:
                C63010eb ebVar = f164031c;
                if (ebVar == null) {
                    synchronized (C60545tw.class) {
                        ebVar = f164031c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164030b);
                            f164031c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
