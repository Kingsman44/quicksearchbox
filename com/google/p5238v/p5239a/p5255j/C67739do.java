package com.google.p5238v.p5239a.p5255j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.do */
/* compiled from: PG */
public final class C67739do extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67739do f183781c;

    /* renamed from: d */
    private static volatile C63010eb f183782d;

    /* renamed from: a */
    public int f183783a;

    /* renamed from: b */
    public C67741dq f183784b;

    static {
        C67739do doVar = new C67739do();
        f183781c = doVar;
        C62942bv.registerDefaultInstance(C67739do.class, doVar);
    }

    private C67739do() {
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
                return newMessageInfo(f183781c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C67739do();
            case 4:
                return new C67738dn();
            case 5:
                return f183781c;
            case 6:
                C63010eb ebVar = f183782d;
                if (ebVar == null) {
                    synchronized (C67739do.class) {
                        ebVar = f183782d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183781c);
                            f183782d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
