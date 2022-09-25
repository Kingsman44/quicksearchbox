package com.google.p4463ce.p4475b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ce.b.c */
/* compiled from: PG */
public final class C58058c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C58058c f155197a;

    /* renamed from: c */
    private static volatile C63010eb f155198c;

    /* renamed from: b */
    private C62995dn f155199b = C62995dn.f170057a;

    static {
        C58058c cVar = new C58058c();
        f155197a = cVar;
        C62942bv.registerDefaultInstance(C58058c.class, cVar);
    }

    private C58058c() {
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
                return newMessageInfo(f155197a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C58057b.f155196a});
            case 3:
                return new C58058c();
            case 4:
                return new C58056a();
            case 5:
                return f155197a;
            case 6:
                C63010eb ebVar = f155198c;
                if (ebVar == null) {
                    synchronized (C58058c.class) {
                        ebVar = f155198c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155197a);
                            f155198c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
