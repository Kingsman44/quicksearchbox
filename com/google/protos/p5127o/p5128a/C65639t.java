package com.google.protos.p5127o.p5128a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.o.a.t */
/* compiled from: PG */
public final class C65639t extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65639t f178360c;

    /* renamed from: d */
    private static volatile C63010eb f178361d;

    /* renamed from: a */
    public int f178362a;

    /* renamed from: b */
    public C65682h f178363b;

    static {
        C65639t tVar = new C65639t();
        f178360c = tVar;
        C62942bv.registerDefaultInstance(C65639t.class, tVar);
    }

    private C65639t() {
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
                return newMessageInfo(f178360c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65639t();
            case 4:
                return new C65638s();
            case 5:
                return f178360c;
            case 6:
                C63010eb ebVar = f178361d;
                if (ebVar == null) {
                    synchronized (C65639t.class) {
                        ebVar = f178361d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178360c);
                            f178361d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
