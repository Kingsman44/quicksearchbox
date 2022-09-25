package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.protos.f.q.dz */
/* compiled from: PG */
public final class C65165dz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65165dz f176356c;

    /* renamed from: f */
    private static volatile C63010eb f176357f;

    /* renamed from: a */
    public int f176358a;

    /* renamed from: b */
    public C62971cq f176359b = emptyProtobufList();

    /* renamed from: d */
    private int f176360d;

    /* renamed from: e */
    private byte f176361e = 2;

    static {
        C65165dz dzVar = new C65165dz();
        f176356c = dzVar;
        C62942bv.registerDefaultInstance(C65165dz.class, dzVar);
    }

    private C65165dz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176361e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176361e = b;
                return null;
            case 2:
                return newMessageInfo(f176356c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0000\u0002Л", new Object[]{"d", "a", C65753ak.m96798c(), "b", C65768az.class});
            case 3:
                return new C65165dz();
            case 4:
                return new C65164dy();
            case 5:
                return f176356c;
            case 6:
                C63010eb ebVar = f176357f;
                if (ebVar == null) {
                    synchronized (C65165dz.class) {
                        ebVar = f176357f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176356c);
                            f176357f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
