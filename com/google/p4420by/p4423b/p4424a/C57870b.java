package com.google.p4420by.p4423b.p4424a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.b.a.b */
/* compiled from: PG */
public final class C57870b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57870b f154591c;

    /* renamed from: d */
    private static volatile C63010eb f154592d;

    /* renamed from: a */
    public int f154593a = 0;

    /* renamed from: b */
    public Object f154594b;

    static {
        C57870b bVar = new C57870b();
        f154591c = bVar;
        C62942bv.registerDefaultInstance(C57870b.class, bVar);
    }

    private C57870b() {
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
                return newMessageInfo(f154591c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000\u0003ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C57870b();
            case 4:
                return new C57869a();
            case 5:
                return f154591c;
            case 6:
                C63010eb ebVar = f154592d;
                if (ebVar == null) {
                    synchronized (C57870b.class) {
                        ebVar = f154592d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154591c);
                            f154592d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
