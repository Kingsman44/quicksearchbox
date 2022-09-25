package com.google.p395al.p408c.p414c.p415a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.a.c */
/* compiled from: PG */
public final class C8453c extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8453c f29363b;

    /* renamed from: c */
    private static volatile C63010eb f29364c;

    /* renamed from: a */
    public C62995dn f29365a = C62995dn.f170057a;

    static {
        C8453c cVar = new C8453c();
        f29363b = cVar;
        C62942bv.registerDefaultInstance(C8453c.class, cVar);
    }

    private C8453c() {
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
                return newMessageInfo(f29363b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C8452b.f29362a});
            case 3:
                return new C8453c();
            case 4:
                return new C8451a();
            case 5:
                return f29363b;
            case 6:
                C63010eb ebVar = f29364c;
                if (ebVar == null) {
                    synchronized (C8453c.class) {
                        ebVar = f29364c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29363b);
                            f29364c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
