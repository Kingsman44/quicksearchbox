package com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.b.a.a.a.a.a.c */
/* compiled from: PG */
public final class C63145c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63145c f170514c;

    /* renamed from: d */
    private static volatile C63010eb f170515d;

    /* renamed from: a */
    public int f170516a;

    /* renamed from: b */
    public C62971cq f170517b = C62942bv.emptyProtobufList();

    static {
        C63145c cVar = new C63145c();
        f170514c = cVar;
        C62942bv.registerDefaultInstance(C63145c.class, cVar);
    }

    private C63145c() {
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
                return newMessageInfo(f170514c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C63145c();
            case 4:
                return new C63144b();
            case 5:
                return f170514c;
            case 6:
                C63010eb ebVar = f170515d;
                if (ebVar == null) {
                    synchronized (C63145c.class) {
                        ebVar = f170515d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170514c);
                            f170515d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
