package com.google.speech.p5207g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.g.b */
/* compiled from: PG */
public final class C66504b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66504b f180871b;

    /* renamed from: c */
    private static volatile C63010eb f180872c;

    /* renamed from: a */
    public C62971cq f180873a = emptyProtobufList();

    static {
        C66504b bVar = new C66504b();
        f180871b = bVar;
        C62942bv.registerDefaultInstance(C66504b.class, bVar);
    }

    private C66504b() {
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
                return newMessageInfo(f180871b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C66506d.class});
            case 3:
                return new C66504b();
            case 4:
                return new C66503a();
            case 5:
                return f180871b;
            case 6:
                C63010eb ebVar = f180872c;
                if (ebVar == null) {
                    synchronized (C66504b.class) {
                        ebVar = f180872c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180871b);
                            f180872c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
