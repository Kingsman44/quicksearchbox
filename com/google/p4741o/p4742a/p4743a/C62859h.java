package com.google.p4741o.p4742a.p4743a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.o.a.a.h */
/* compiled from: PG */
public final class C62859h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62859h f169743b;

    /* renamed from: c */
    private static volatile C63010eb f169744c;

    /* renamed from: a */
    public C62971cq f169745a = emptyProtobufList();

    static {
        C62859h hVar = new C62859h();
        f169743b = hVar;
        C62942bv.registerDefaultInstance(C62859h.class, hVar);
    }

    private C62859h() {
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
                return newMessageInfo(f169743b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62855d.class});
            case 3:
                return new C62859h();
            case 4:
                return new C62858g();
            case 5:
                return f169743b;
            case 6:
                C63010eb ebVar = f169744c;
                if (ebVar == null) {
                    synchronized (C62859h.class) {
                        ebVar = f169744c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169743b);
                            f169744c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
