package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.uf */
/* compiled from: PG */
public final class C8065uf extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C8065uf f28386j;

    /* renamed from: k */
    private static volatile C63010eb f28387k;

    /* renamed from: a */
    public int f28388a;

    /* renamed from: b */
    public C8150xj f28389b;

    /* renamed from: c */
    public C8150xj f28390c;

    /* renamed from: d */
    public C62971cq f28391d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f28392e = emptyProtobufList();

    /* renamed from: f */
    public C62960cg f28393f = emptyFloatList();

    /* renamed from: g */
    public C62971cq f28394g = emptyProtobufList();

    /* renamed from: h */
    public int f28395h;

    /* renamed from: i */
    public int f28396i;

    static {
        C8065uf ufVar = new C8065uf();
        f28386j = ufVar;
        C62942bv.registerDefaultInstance(C8065uf.class, ufVar);
    }

    private C8065uf() {
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
                return newMessageInfo(f28386j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0004\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005\u0013\u0006\u001b\u0007င\u0002\bင\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C8064ue.class, "e", C7818lb.class, C10662f.f35572a, C30325g.f82003a, C8057ty.class, C19618h.f54585a, "i"});
            case 3:
                return new C8065uf();
            case 4:
                return new C8055tw();
            case 5:
                return f28386j;
            case 6:
                C63010eb ebVar = f28387k;
                if (ebVar == null) {
                    synchronized (C8065uf.class) {
                        ebVar = f28387k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28386j);
                            f28387k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
