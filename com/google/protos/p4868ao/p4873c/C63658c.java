package com.google.protos.p4868ao.p4873c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ao.c.c */
/* compiled from: PG */
public final class C63658c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63658c f172137b;

    /* renamed from: c */
    private static volatile C63010eb f172138c;

    /* renamed from: a */
    public C62995dn f172139a = C62995dn.f170057a;

    static {
        C63658c cVar = new C63658c();
        f172137b = cVar;
        C62942bv.registerDefaultInstance(C63658c.class, cVar);
    }

    private C63658c() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f172137b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C63657b.f172136a});
            case 3:
                return new C63658c();
            case 4:
                return new C63656a();
            case 5:
                return f172137b;
            case 6:
                C63010eb ebVar = f172138c;
                if (ebVar == null) {
                    synchronized (C63658c.class) {
                        ebVar = f172138c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172137b);
                            f172138c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
