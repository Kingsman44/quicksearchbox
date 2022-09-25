package com.google.android.apps.p489g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.o */
/* compiled from: PG */
public final class C9297o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9297o f32274d;

    /* renamed from: f */
    private static volatile C63010eb f32275f;

    /* renamed from: a */
    public int f32276a;

    /* renamed from: b */
    public long f32277b;

    /* renamed from: c */
    public C62971cq f32278c = emptyProtobufList();

    /* renamed from: e */
    private byte f32279e = 2;

    static {
        C9297o oVar = new C9297o();
        f32274d = oVar;
        C62942bv.registerDefaultInstance(C9297o.class, oVar);
    }

    private C9297o() {
    }

    /* renamed from: a */
    public final void mo17484a() {
        C62971cq cqVar = this.f32278c;
        if (!cqVar.mo58948c()) {
            this.f32278c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32279e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32279e = b;
                return null;
            case 2:
                return newMessageInfo(f32274d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဂ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C9296n.class});
            case 3:
                return new C9297o();
            case 4:
                return new C9294l();
            case 5:
                return f32274d;
            case 6:
                C63010eb ebVar = f32275f;
                if (ebVar == null) {
                    synchronized (C9297o.class) {
                        ebVar = f32275f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32274d);
                            f32275f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
