package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123733b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.bd */
/* compiled from: PG */
public final class C80126bd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80126bd f219867d;

    /* renamed from: f */
    private static volatile C63010eb f219868f;

    /* renamed from: a */
    public int f219869a;

    /* renamed from: b */
    public int f219870b;

    /* renamed from: c */
    public C123733b f219871c;

    /* renamed from: e */
    private int f219872e;

    static {
        C80126bd bdVar = new C80126bd();
        f219867d = bdVar;
        C62942bv.registerDefaultInstance(C80126bd.class, bdVar);
    }

    private C80126bd() {
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
                return newMessageInfo(f219867d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C80124bb.f219866a, C45240c.f118157a});
            case 3:
                return new C80126bd();
            case 4:
                return new C80123ba();
            case 5:
                return f219867d;
            case 6:
                C63010eb ebVar = f219868f;
                if (ebVar == null) {
                    synchronized (C80126bd.class) {
                        ebVar = f219868f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219867d);
                            f219868f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
