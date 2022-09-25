package com.google.p4129b.p4130a.p4131a.p4132a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.b.a.a.a.s */
/* compiled from: PG */
public final class C54733s extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54733s f143634b;

    /* renamed from: c */
    private static volatile C63010eb f143635c;

    /* renamed from: a */
    public C54683b f143636a;

    static {
        C54733s sVar = new C54733s();
        f143634b = sVar;
        C62942bv.registerDefaultInstance(C54733s.class, sVar);
    }

    private C54733s() {
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
                return newMessageInfo(f143634b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54733s();
            case 4:
                return new C54732r();
            case 5:
                return f143634b;
            case 6:
                C63010eb ebVar = f143635c;
                if (ebVar == null) {
                    synchronized (C54733s.class) {
                        ebVar = f143635c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143634b);
                            f143635c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
