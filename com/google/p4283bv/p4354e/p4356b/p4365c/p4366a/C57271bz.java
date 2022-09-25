package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4283bv.p4354e.C57051b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.c.a.bz */
/* compiled from: PG */
public final class C57271bz extends C62937bq implements C62938br {

    /* renamed from: f */
    public static final C57271bz f152890f;

    /* renamed from: h */
    private static volatile C63010eb f152891h;

    /* renamed from: a */
    public int f152892a;

    /* renamed from: b */
    public C60220t f152893b;

    /* renamed from: c */
    public C57051b f152894c;

    /* renamed from: d */
    public boolean f152895d;

    /* renamed from: e */
    public C57342y f152896e;

    /* renamed from: g */
    private byte f152897g = 2;

    static {
        C57271bz bzVar = new C57271bz();
        f152890f = bzVar;
        C62942bv.registerDefaultInstance(C57271bz.class, bzVar);
    }

    private C57271bz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152897g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152897g = b;
                return null;
            case 2:
                return newMessageInfo(f152890f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0002\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003\u0006ဉ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C57271bz();
            case 4:
                return new C57270by();
            case 5:
                return f152890f;
            case 6:
                C63010eb ebVar = f152891h;
                if (ebVar == null) {
                    synchronized (C57271bz.class) {
                        ebVar = f152891h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152890f);
                            f152891h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
