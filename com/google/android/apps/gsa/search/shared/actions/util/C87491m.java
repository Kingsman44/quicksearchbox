package com.google.android.apps.gsa.search.shared.actions.util;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55361pn;
import com.google.p4152bb.p4153a.C55373pz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.m */
/* compiled from: PG */
public final class C87491m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87491m f236316d;

    /* renamed from: f */
    private static volatile C63010eb f236317f;

    /* renamed from: a */
    public int f236318a;

    /* renamed from: b */
    public C62971cq f236319b = emptyProtobufList();

    /* renamed from: c */
    public C55373pz f236320c;

    /* renamed from: e */
    private byte f236321e = 2;

    static {
        C87491m mVar = new C87491m();
        f236316d = mVar;
        C62942bv.registerDefaultInstance(C87491m.class, mVar);
    }

    private C87491m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f236321e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f236321e = b;
                return null;
            case 2:
                return newMessageInfo(f236316d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", C55361pn.class, C45240c.f118157a});
            case 3:
                return new C87491m();
            case 4:
                return new C87490l();
            case 5:
                return f236316d;
            case 6:
                C63010eb ebVar = f236317f;
                if (ebVar == null) {
                    synchronized (C87491m.class) {
                        ebVar = f236317f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f236316d);
                            f236317f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
