package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.android.apps.gsa.assistant.shared.l.o;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3791b.C48718bz;
import com.google.assistant.p3860as.C49740ac;
import com.google.assistant.p3861at.act;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bx */
/* compiled from: PG */
public final class C48635bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48635bx f125704d;

    /* renamed from: f */
    private static volatile C63010eb f125705f;

    /* renamed from: a */
    public int f125706a = 0;

    /* renamed from: b */
    public Object f125707b;

    /* renamed from: c */
    public long f125708c;

    /* renamed from: e */
    private byte f125709e = 2;

    static {
        C48635bx bxVar = new C48635bx();
        f125704d = bxVar;
        C62942bv.registerDefaultInstance(C48635bx.class, bxVar);
    }

    private C48635bx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125709e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125709e = b;
                return null;
            case 2:
                return newMessageInfo(f125704d, "\u0000\u001a\u0001\u0000\u0001\u001b\u001a\u0000\u0000\u0004\u0001\u0002\u0002<\u0000\u0003м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\tм\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010м\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017м\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000", new Object[]{"b", "a", C45240c.f118157a, C48642cd.class, C49740ac.class, C48640cb.class, C48626bo.class, C48645f.class, C48630bs.class, act.class, C48643d.class, C48615bd.class, C48592ah.class, C48658s.class, C48661v.class, C48718bz.class, C48590af.class, C48596al.class, C48656q.class, C48647h.class, C48601aq.class, o.class, C48599ao.class, C48588ad.class, C48608ax.class, C48652m.class, C48594aj.class, C48618bg.class});
            case 3:
                return new C48635bx();
            case 4:
                return new C48633bv();
            case 5:
                return f125704d;
            case 6:
                C63010eb ebVar = f125705f;
                if (ebVar == null) {
                    synchronized (C48635bx.class) {
                        ebVar = f125705f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125704d);
                            f125705f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
