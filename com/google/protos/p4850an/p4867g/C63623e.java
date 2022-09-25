package com.google.protos.p4850an.p4867g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.g.e */
/* compiled from: PG */
public final class C63623e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63623e f172067a;

    /* renamed from: c */
    private static volatile C63010eb f172068c;

    /* renamed from: b */
    private C62995dn f172069b = C62995dn.f170057a;

    static {
        C63623e eVar = new C63623e();
        f172067a = eVar;
        C62942bv.registerDefaultInstance(C63623e.class, eVar);
    }

    private C63623e() {
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
                return newMessageInfo(f172067a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C63622d.f172066a});
            case 3:
                return new C63623e();
            case 4:
                return new C63621c();
            case 5:
                return f172067a;
            case 6:
                C63010eb ebVar = f172068c;
                if (ebVar == null) {
                    synchronized (C63623e.class) {
                        ebVar = f172068c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172067a);
                            f172068c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
