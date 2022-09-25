package com.google.p4140ba.p4141a.p4142a.p4144b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.a.b.w */
/* compiled from: PG */
public final class C54803w extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54803w f143767d;

    /* renamed from: e */
    private static volatile C63010eb f143768e;

    /* renamed from: a */
    public int f143769a;

    /* renamed from: b */
    public int f143770b;

    /* renamed from: c */
    public C62971cq f143771c = emptyProtobufList();

    static {
        C54803w wVar = new C54803w();
        f143767d = wVar;
        C62942bv.registerDefaultInstance(C54803w.class, wVar);
    }

    private C54803w() {
    }

    /* renamed from: a */
    public final void mo54156a() {
        C62971cq cqVar = this.f143771c;
        if (!cqVar.mo58948c()) {
            this.f143771c = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f143767d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဌ\u0000\u0003\u001b", new Object[]{"a", "b", C54801u.f143766a, C45240c.f118157a, C54800t.class});
            case 3:
                return new C54803w();
            case 4:
                return new C54797q();
            case 5:
                return f143767d;
            case 6:
                C63010eb ebVar = f143768e;
                if (ebVar == null) {
                    synchronized (C54803w.class) {
                        ebVar = f143768e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143767d);
                            f143768e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
