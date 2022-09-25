package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.p375ai.p378b.C7718hj;
import com.google.p4152bb.p4153a.C55112gh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.tv */
/* compiled from: PG */
public final class C88226tv extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88226tv f238462c;

    /* renamed from: f */
    private static volatile C63010eb f238463f;

    /* renamed from: a */
    public C7718hj f238464a;

    /* renamed from: b */
    public C55112gh f238465b;

    /* renamed from: d */
    private int f238466d;

    /* renamed from: e */
    private byte f238467e = 2;

    static {
        C88226tv tvVar = new C88226tv();
        f238462c = tvVar;
        C62942bv.registerDefaultInstance(C88226tv.class, tvVar);
    }

    private C88226tv() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238467e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238467e = b;
                return null;
            case 2:
                return newMessageInfo(f238462c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C88226tv();
            case 4:
                return new C88225tu();
            case 5:
                return f238462c;
            case 6:
                C63010eb ebVar = f238463f;
                if (ebVar == null) {
                    synchronized (C88226tv.class) {
                        ebVar = f238463f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238462c);
                            f238463f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
