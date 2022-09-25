package com.google.protos.p4757ac.p4758a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ac.a.h */
/* compiled from: PG */
public final class C63109h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63109h f170342e;

    /* renamed from: f */
    private static volatile C63010eb f170343f;

    /* renamed from: a */
    public int f170344a;

    /* renamed from: b */
    public C63113l f170345b;

    /* renamed from: c */
    public C62971cq f170346c = emptyProtobufList();

    /* renamed from: d */
    public boolean f170347d;

    static {
        C63109h hVar = new C63109h();
        f170342e = hVar;
        C62942bv.registerDefaultInstance(C63109h.class, hVar);
    }

    private C63109h() {
    }

    /* renamed from: a */
    public final void mo59181a() {
        C62971cq cqVar = this.f170346c;
        if (!cqVar.mo58948c()) {
            this.f170346c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f170342e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63111j.class, "d"});
            case 3:
                return new C63109h();
            case 4:
                return new C63108g();
            case 5:
                return f170342e;
            case 6:
                C63010eb ebVar = f170343f;
                if (ebVar == null) {
                    synchronized (C63109h.class) {
                        ebVar = f170343f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170342e);
                            f170343f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
