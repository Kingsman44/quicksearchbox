package com.google.android.apps.gsa.nga.shared.p6345h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.ce */
/* compiled from: PG */
public final class C81301ce extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C81301ce f222549f;

    /* renamed from: g */
    private static volatile C63010eb f222550g;

    /* renamed from: a */
    public int f222551a;

    /* renamed from: b */
    public long f222552b;

    /* renamed from: c */
    public C62971cq f222553c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f222554d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f222555e = emptyProtobufList();

    static {
        C81301ce ceVar = new C81301ce();
        f222549f = ceVar;
        C62942bv.registerDefaultInstance(C81301ce.class, ceVar);
    }

    private C81301ce() {
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
                return newMessageInfo(f222549f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဂ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, C81299cc.class, "d", C81299cc.class, "e", C81299cc.class});
            case 3:
                return new C81301ce();
            case 4:
                return new C81300cd();
            case 5:
                return f222549f;
            case 6:
                C63010eb ebVar = f222550g;
                if (ebVar == null) {
                    synchronized (C81301ce.class) {
                        ebVar = f222550g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222549f);
                            f222550g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
