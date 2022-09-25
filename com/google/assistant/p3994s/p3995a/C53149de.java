package com.google.assistant.p3994s.p3995a;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.de */
/* compiled from: PG */
public final class C53149de extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53149de f139297b;

    /* renamed from: d */
    private static volatile C63010eb f139298d;

    /* renamed from: a */
    public C62971cq f139299a = emptyProtobufList();

    /* renamed from: c */
    private byte f139300c = 2;

    static {
        C53149de deVar = new C53149de();
        f139297b = deVar;
        C62942bv.registerDefaultInstance(C53149de.class, deVar);
    }

    private C53149de() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139300c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139300c = b;
                return null;
            case 2:
                return newMessageInfo(f139297b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8242v.class});
            case 3:
                return new C53149de();
            case 4:
                return new C53148dd();
            case 5:
                return f139297b;
            case 6:
                C63010eb ebVar = f139298d;
                if (ebVar == null) {
                    synchronized (C53149de.class) {
                        ebVar = f139298d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139297b);
                            f139298d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
