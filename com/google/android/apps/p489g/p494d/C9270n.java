package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.n */
/* compiled from: PG */
public final class C9270n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9270n f32072e;

    /* renamed from: g */
    private static volatile C63010eb f32073g;

    /* renamed from: a */
    public int f32074a;

    /* renamed from: b */
    public C62971cq f32075b = emptyProtobufList();

    /* renamed from: c */
    public boolean f32076c;

    /* renamed from: d */
    public int f32077d;

    /* renamed from: f */
    private byte f32078f = 2;

    static {
        C9270n nVar = new C9270n();
        f32072e = nVar;
        C62942bv.registerDefaultInstance(C9270n.class, nVar);
    }

    private C9270n() {
    }

    /* renamed from: a */
    public final void mo17463a() {
        C62971cq cqVar = this.f32075b;
        if (!cqVar.mo58948c()) {
            this.f32075b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32078f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32078f = b;
                return null;
            case 2:
                return newMessageInfo(f32072e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000\u0003င\u0001", new Object[]{"a", "b", C9278v.class, C45240c.f118157a, "d"});
            case 3:
                return new C9270n();
            case 4:
                return new C9269m();
            case 5:
                return f32072e;
            case 6:
                C63010eb ebVar = f32073g;
                if (ebVar == null) {
                    synchronized (C9270n.class) {
                        ebVar = f32073g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32072e);
                            f32073g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
