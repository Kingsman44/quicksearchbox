package com.google.android.libraries.search.assistant.invocation.p2655o.p2662e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.e.g */
/* compiled from: PG */
public final class C34196g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34196g f91014b;

    /* renamed from: d */
    private static volatile C63010eb f91015d;

    /* renamed from: a */
    public C62995dn f91016a = C62995dn.f170057a;

    /* renamed from: c */
    private byte f91017c = 2;

    static {
        C34196g gVar = new C34196g();
        f91014b = gVar;
        C62942bv.registerDefaultInstance(C34196g.class, gVar);
    }

    private C34196g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f91017c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f91017c = b;
                return null;
            case 2:
                return newMessageInfo(f91014b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"a", C34195f.f91013a});
            case 3:
                return new C34196g();
            case 4:
                return new C34194e();
            case 5:
                return f91014b;
            case 6:
                C63010eb ebVar = f91015d;
                if (ebVar == null) {
                    synchronized (C34196g.class) {
                        ebVar = f91015d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f91014b);
                            f91015d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
