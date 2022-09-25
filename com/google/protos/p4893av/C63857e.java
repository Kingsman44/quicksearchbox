package com.google.protos.p4893av;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.av.e */
/* compiled from: PG */
public final class C63857e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63857e f172677a;

    /* renamed from: c */
    private static volatile C63010eb f172678c;

    /* renamed from: b */
    private C62995dn f172679b = C62995dn.f170057a;

    static {
        C63857e eVar = new C63857e();
        f172677a = eVar;
        C62942bv.registerDefaultInstance(C63857e.class, eVar);
    }

    private C63857e() {
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
                return newMessageInfo(f172677a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", C63856d.f172676a});
            case 3:
                return new C63857e();
            case 4:
                return new C63855c();
            case 5:
                return f172677a;
            case 6:
                C63010eb ebVar = f172678c;
                if (ebVar == null) {
                    synchronized (C63857e.class) {
                        ebVar = f172678c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172677a);
                            f172678c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
