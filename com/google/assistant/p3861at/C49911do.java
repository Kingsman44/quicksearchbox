package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.do */
/* compiled from: PG */
public final class C49911do extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49911do f129729e;

    /* renamed from: f */
    private static volatile C63010eb f129730f;

    /* renamed from: a */
    public int f129731a;

    /* renamed from: b */
    public C49910dn f129732b;

    /* renamed from: c */
    public C49906dj f129733c;

    /* renamed from: d */
    public boolean f129734d;

    static {
        C49911do doVar = new C49911do();
        f129729e = doVar;
        C62942bv.registerDefaultInstance(C49911do.class, doVar);
    }

    private C49911do() {
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
                return newMessageInfo(f129729e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49911do();
            case 4:
                return new C49904dh();
            case 5:
                return f129729e;
            case 6:
                C63010eb ebVar = f129730f;
                if (ebVar == null) {
                    synchronized (C49911do.class) {
                        ebVar = f129730f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129729e);
                            f129730f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
