package com.google.android.apps.gsa.search.core.p6494aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.C59794fv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.aa.c */
/* compiled from: PG */
public final class C84392c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C84392c f229649e;

    /* renamed from: f */
    private static volatile C63010eb f229650f;

    /* renamed from: a */
    public int f229651a;

    /* renamed from: b */
    public C62971cq f229652b = emptyProtobufList();

    /* renamed from: c */
    public long f229653c;

    /* renamed from: d */
    public int f229654d;

    static {
        C84392c cVar = new C84392c();
        f229649e = cVar;
        C62942bv.registerDefaultInstance(C84392c.class, cVar);
    }

    private C84392c() {
    }

    /* renamed from: a */
    public final void mo77952a() {
        C62971cq cqVar = this.f229652b;
        if (!cqVar.mo58948c()) {
            this.f229652b = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f229649e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003င\u0001", new Object[]{"a", "b", C59794fv.class, C45240c.f118157a, "d"});
            case 3:
                return new C84392c();
            case 4:
                return new C84388b();
            case 5:
                return f229649e;
            case 6:
                C63010eb ebVar = f229650f;
                if (ebVar == null) {
                    synchronized (C84392c.class) {
                        ebVar = f229650f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f229649e);
                            f229650f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
