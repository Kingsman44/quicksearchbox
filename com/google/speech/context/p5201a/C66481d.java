package com.google.speech.context.p5201a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.context.a.d */
/* compiled from: PG */
public final class C66481d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66481d f180773b;

    /* renamed from: c */
    private static volatile C63010eb f180774c;

    /* renamed from: a */
    public C62971cq f180775a = emptyProtobufList();

    static {
        C66481d dVar = new C66481d();
        f180773b = dVar;
        C62942bv.registerDefaultInstance(C66481d.class, dVar);
    }

    private C66481d() {
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
                return newMessageInfo(f180773b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66480c.class});
            case 3:
                return new C66481d();
            case 4:
                return new C66478a();
            case 5:
                return f180773b;
            case 6:
                C63010eb ebVar = f180774c;
                if (ebVar == null) {
                    synchronized (C66481d.class) {
                        ebVar = f180774c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180773b);
                            f180774c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
