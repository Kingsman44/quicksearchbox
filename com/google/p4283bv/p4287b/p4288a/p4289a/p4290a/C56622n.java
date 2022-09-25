package com.google.p4283bv.p4287b.p4288a.p4289a.p4290a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4253e.p4254a.C56182b;
import com.google.p4242bp.p4253e.p4254a.C56190j;
import com.google.p4242bp.p4253e.p4254a.C56196p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.a.n */
/* compiled from: PG */
public final class C56622n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C56622n f151177e;

    /* renamed from: f */
    private static volatile C63010eb f151178f;

    /* renamed from: a */
    public int f151179a;

    /* renamed from: b */
    public C56182b f151180b;

    /* renamed from: c */
    public C56196p f151181c;

    /* renamed from: d */
    public C56190j f151182d;

    static {
        C56622n nVar = new C56622n();
        f151177e = nVar;
        C62942bv.registerDefaultInstance(C56622n.class, nVar);
    }

    private C56622n() {
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
                return newMessageInfo(f151177e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C56622n();
            case 4:
                return new C56621m();
            case 5:
                return f151177e;
            case 6:
                C63010eb ebVar = f151178f;
                if (ebVar == null) {
                    synchronized (C56622n.class) {
                        ebVar = f151178f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151177e);
                            f151178f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
