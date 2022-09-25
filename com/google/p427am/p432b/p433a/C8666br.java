package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.br */
/* compiled from: PG */
public final class C8666br extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8666br f29976b;

    /* renamed from: c */
    private static volatile C63010eb f29977c;

    /* renamed from: a */
    public C8677g f29978a;

    static {
        C8666br brVar = new C8666br();
        f29976b = brVar;
        C62942bv.registerDefaultInstance(C8666br.class, brVar);
    }

    private C8666br() {
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
                return newMessageInfo(f29976b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C8666br();
            case 4:
                return new C8665bq();
            case 5:
                return f29976b;
            case 6:
                C63010eb ebVar = f29977c;
                if (ebVar == null) {
                    synchronized (C8666br.class) {
                        ebVar = f29977c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29976b);
                            f29977c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
