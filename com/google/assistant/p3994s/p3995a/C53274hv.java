package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.hv */
/* compiled from: PG */
public final class C53274hv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53274hv f139676c;

    /* renamed from: d */
    private static volatile C63010eb f139677d;

    /* renamed from: a */
    public C62971cq f139678a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62995dn f139679b = C62995dn.f170057a;

    static {
        C53274hv hvVar = new C53274hv();
        f139676c = hvVar;
        C62942bv.registerDefaultInstance(C53274hv.class, hvVar);
    }

    private C53274hv() {
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
                return newMessageInfo(f139676c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001a\u00022", new Object[]{"a", "b", C53273hu.f139675a});
            case 3:
                return new C53274hv();
            case 4:
                return new C53272ht();
            case 5:
                return f139676c;
            case 6:
                C63010eb ebVar = f139677d;
                if (ebVar == null) {
                    synchronized (C53274hv.class) {
                        ebVar = f139677d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139676c);
                            f139677d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
