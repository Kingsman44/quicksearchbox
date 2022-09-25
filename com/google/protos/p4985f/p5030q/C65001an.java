package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.an */
/* compiled from: PG */
public final class C65001an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65001an f176040c;

    /* renamed from: d */
    private static volatile C63010eb f176041d;

    /* renamed from: a */
    public int f176042a;

    /* renamed from: b */
    public C65682h f176043b;

    static {
        C65001an anVar = new C65001an();
        f176040c = anVar;
        C62942bv.registerDefaultInstance(C65001an.class, anVar);
    }

    private C65001an() {
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
                return newMessageInfo(f176040c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65001an();
            case 4:
                return new C65000am();
            case 5:
                return f176040c;
            case 6:
                C63010eb ebVar = f176041d;
                if (ebVar == null) {
                    synchronized (C65001an.class) {
                        ebVar = f176041d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176040c);
                            f176041d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
