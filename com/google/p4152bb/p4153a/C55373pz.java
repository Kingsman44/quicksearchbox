package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.pz */
/* compiled from: PG */
public final class C55373pz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55373pz f145913d;

    /* renamed from: g */
    private static volatile C63010eb f145914g;

    /* renamed from: a */
    public int f145915a;

    /* renamed from: b */
    public C62971cq f145916b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f145917c = emptyProtobufList();

    /* renamed from: e */
    private int f145918e;

    /* renamed from: f */
    private byte f145919f = 2;

    static {
        C55373pz pzVar = new C55373pz();
        f145913d = pzVar;
        C62942bv.registerDefaultInstance(C55373pz.class, pzVar);
    }

    private C55373pz() {
    }

    /* renamed from: a */
    public final void mo54255a() {
        C62971cq cqVar = this.f145916b;
        if (!cqVar.mo58948c()) {
            this.f145916b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145919f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145919f = b;
                return null;
            case 2:
                return newMessageInfo(f145913d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0002\u0002\u0001င\u0000\u0003Л\u0004Л", new Object[]{"e", "a", "b", C55371px.class, C45240c.f118157a, C55371px.class});
            case 3:
                return new C55373pz();
            case 4:
                return new C55372py();
            case 5:
                return f145913d;
            case 6:
                C63010eb ebVar = f145914g;
                if (ebVar == null) {
                    synchronized (C55373pz.class) {
                        ebVar = f145914g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145913d);
                            f145914g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
