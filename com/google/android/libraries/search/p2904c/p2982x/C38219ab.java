package com.google.android.libraries.search.p2904c.p2982x;

import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.x.ab */
/* compiled from: PG */
public final class C38219ab extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38219ab f101295d;

    /* renamed from: e */
    private static volatile C63010eb f101296e;

    /* renamed from: a */
    public int f101297a;

    /* renamed from: b */
    public C37666hm f101298b;

    /* renamed from: c */
    public C37670hq f101299c;

    static {
        C38219ab abVar = new C38219ab();
        f101295d = abVar;
        C62942bv.registerDefaultInstance(C38219ab.class, abVar);
    }

    private C38219ab() {
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
                return newMessageInfo(f101295d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38219ab();
            case 4:
                return new C38218aa();
            case 5:
                return f101295d;
            case 6:
                C63010eb ebVar = f101296e;
                if (ebVar == null) {
                    synchronized (C38219ab.class) {
                        ebVar = f101296e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101295d);
                            f101296e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
