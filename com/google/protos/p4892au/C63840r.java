package com.google.protos.p4892au;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.r */
/* compiled from: PG */
public final class C63840r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63840r f172635a;

    /* renamed from: c */
    private static volatile C63010eb f172636c;

    /* renamed from: b */
    private C62995dn f172637b = C62995dn.f170057a;

    static {
        C63840r rVar = new C63840r();
        f172635a = rVar;
        C62942bv.registerDefaultInstance(C63840r.class, rVar);
    }

    private C63840r() {
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f172635a, "\u0000\u0001\u0000\u0000\r\r\u0001\u0001\u0000\u0000\r2", new Object[]{"b", C63839q.f172634a});
            case 3:
                return new C63840r();
            case 4:
                return new C63836n();
            case 5:
                return f172635a;
            case 6:
                C63010eb ebVar = f172636c;
                if (ebVar == null) {
                    synchronized (C63840r.class) {
                        ebVar = f172636c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172635a);
                            f172636c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
