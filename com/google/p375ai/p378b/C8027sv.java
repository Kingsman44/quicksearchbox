package com.google.p375ai.p378b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.sv */
/* compiled from: PG */
public final class C8027sv extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C8027sv f28188l;

    /* renamed from: m */
    private static volatile C63010eb f28189m;

    /* renamed from: a */
    public int f28190a;

    /* renamed from: b */
    public C8150xj f28191b;

    /* renamed from: c */
    public C8150xj f28192c;

    /* renamed from: d */
    public C8150xj f28193d;

    /* renamed from: e */
    public C62971cq f28194e = emptyProtobufList();

    /* renamed from: f */
    public C7893nw f28195f;

    /* renamed from: g */
    public int f28196g;

    /* renamed from: h */
    public C7893nw f28197h;

    /* renamed from: i */
    public C8069uj f28198i;

    /* renamed from: j */
    public C8069uj f28199j;

    /* renamed from: k */
    public C7838lv f28200k;

    static {
        C8027sv svVar = new C8027sv();
        f28188l = svVar;
        C62942bv.registerDefaultInstance(C8027sv.class, svVar);
    }

    private C8027sv() {
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
                return newMessageInfo(f28188l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u001b\u0005ဉ\u0003\u0006ဉ\u0005\u0007ဌ\u0004\bဉ\u0006\tဉ\u0007\nဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7818lb.class, C10662f.f35572a, C19618h.f54585a, C30325g.f82003a, C7786jx.f27250a, "i", "j", C19621k.f54601a});
            case 3:
                return new C8027sv();
            case 4:
                return new C8026su();
            case 5:
                return f28188l;
            case 6:
                C63010eb ebVar = f28189m;
                if (ebVar == null) {
                    synchronized (C8027sv.class) {
                        ebVar = f28189m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28188l);
                            f28189m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
