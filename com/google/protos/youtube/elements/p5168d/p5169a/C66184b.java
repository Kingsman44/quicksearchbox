package com.google.protos.youtube.elements.p5168d.p5169a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.d.a.b */
/* compiled from: PG */
public final class C66184b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66184b f179967b;

    /* renamed from: c */
    private static volatile C63010eb f179968c;

    /* renamed from: a */
    public C62971cq f179969a = emptyProtobufList();

    static {
        C66184b bVar = new C66184b();
        f179967b = bVar;
        C62942bv.registerDefaultInstance(C66184b.class, bVar);
    }

    private C66184b() {
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
                return newMessageInfo(f179967b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66186d.class});
            case 3:
                return new C66184b();
            case 4:
                return new C66183a();
            case 5:
                return f179967b;
            case 6:
                C63010eb ebVar = f179968c;
                if (ebVar == null) {
                    synchronized (C66184b.class) {
                        ebVar = f179968c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179967b);
                            f179968c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
