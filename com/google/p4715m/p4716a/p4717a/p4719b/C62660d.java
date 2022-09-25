package com.google.p4715m.p4716a.p4717a.p4719b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.m.a.a.b.d */
/* compiled from: PG */
public final class C62660d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62660d f169183b;

    /* renamed from: c */
    private static volatile C63010eb f169184c;

    /* renamed from: a */
    public C62971cq f169185a = emptyProtobufList();

    static {
        C62660d dVar = new C62660d();
        f169183b = dVar;
        C62942bv.registerDefaultInstance(C62660d.class, dVar);
    }

    private C62660d() {
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
                return newMessageInfo(f169183b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C62659c.class});
            case 3:
                return new C62660d();
            case 4:
                return new C62657a();
            case 5:
                return f169183b;
            case 6:
                C63010eb ebVar = f169184c;
                if (ebVar == null) {
                    synchronized (C62660d.class) {
                        ebVar = f169184c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169183b);
                            f169184c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
