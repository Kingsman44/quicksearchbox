package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.an */
/* compiled from: PG */
public final class C56233an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56233an f149775d;

    /* renamed from: e */
    private static volatile C63010eb f149776e;

    /* renamed from: a */
    public int f149777a;

    /* renamed from: b */
    public C62971cq f149778b = emptyProtobufList();

    /* renamed from: c */
    public C56224ae f149779c;

    static {
        C56233an anVar = new C56233an();
        f149775d = anVar;
        C62942bv.registerDefaultInstance(C56233an.class, anVar);
    }

    private C56233an() {
    }

    /* renamed from: a */
    public final void mo54341a() {
        C62971cq cqVar = this.f149778b;
        if (!cqVar.mo58948c()) {
            this.f149778b = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f149775d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"a", "b", C56241av.class, C45240c.f118157a});
            case 3:
                return new C56233an();
            case 4:
                return new C56232am();
            case 5:
                return f149775d;
            case 6:
                C63010eb ebVar = f149776e;
                if (ebVar == null) {
                    synchronized (C56233an.class) {
                        ebVar = f149776e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149775d);
                            f149776e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
