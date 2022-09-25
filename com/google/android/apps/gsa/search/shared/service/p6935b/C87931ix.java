package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ix */
/* compiled from: PG */
public final class C87931ix extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87931ix f237843d;

    /* renamed from: e */
    private static volatile C63010eb f237844e;

    /* renamed from: a */
    public int f237845a;

    /* renamed from: b */
    public C87928iu f237846b;

    /* renamed from: c */
    public C87924iq f237847c;

    static {
        C87931ix ixVar = new C87931ix();
        f237843d = ixVar;
        C62942bv.registerDefaultInstance(C87931ix.class, ixVar);
    }

    private C87931ix() {
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
                return newMessageInfo(f237843d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C87931ix();
            case 4:
                return new C87930iw();
            case 5:
                return f237843d;
            case 6:
                C63010eb ebVar = f237844e;
                if (ebVar == null) {
                    synchronized (C87931ix.class) {
                        ebVar = f237844e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237843d);
                            f237844e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
