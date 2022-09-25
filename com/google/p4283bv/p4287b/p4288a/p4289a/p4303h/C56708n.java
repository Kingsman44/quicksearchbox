package com.google.p4283bv.p4287b.p4288a.p4289a.p4303h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57648i;
import com.google.p4283bv.p4412k.p4415c.p4416a.C57856n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.h.n */
/* compiled from: PG */
public final class C56708n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56708n f151360d;

    /* renamed from: g */
    private static volatile C63010eb f151361g;

    /* renamed from: a */
    public C57569am f151362a;

    /* renamed from: b */
    public C57648i f151363b;

    /* renamed from: c */
    public C57856n f151364c;

    /* renamed from: e */
    private int f151365e;

    /* renamed from: f */
    private byte f151366f = 2;

    static {
        C56708n nVar = new C56708n();
        f151360d = nVar;
        C62942bv.registerDefaultInstance(C56708n.class, nVar);
    }

    private C56708n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151366f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151366f = b;
                return null;
            case 2:
                return newMessageInfo(f151360d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C56708n();
            case 4:
                return new C56707m();
            case 5:
                return f151360d;
            case 6:
                C63010eb ebVar = f151361g;
                if (ebVar == null) {
                    synchronized (C56708n.class) {
                        ebVar = f151361g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151360d);
                            f151361g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
