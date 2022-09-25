package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58072d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.gi */
/* compiled from: PG */
public final class C53234gi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53234gi f139523e;

    /* renamed from: f */
    private static volatile C63010eb f139524f;

    /* renamed from: a */
    public int f139525a;

    /* renamed from: b */
    public C58072d f139526b;

    /* renamed from: c */
    public int f139527c;

    /* renamed from: d */
    public C62971cq f139528d = emptyProtobufList();

    static {
        C53234gi giVar = new C53234gi();
        f139523e = giVar;
        C62942bv.registerDefaultInstance(C53234gi.class, giVar);
    }

    private C53234gi() {
    }

    /* renamed from: a */
    public final void mo53969a() {
        C62971cq cqVar = this.f139528d;
        if (!cqVar.mo58948c()) {
            this.f139528d = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f139523e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", C53244gs.class});
            case 3:
                return new C53234gi();
            case 4:
                return new C53233gh();
            case 5:
                return f139523e;
            case 6:
                C63010eb ebVar = f139524f;
                if (ebVar == null) {
                    synchronized (C53234gi.class) {
                        ebVar = f139524f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139523e);
                            f139524f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
