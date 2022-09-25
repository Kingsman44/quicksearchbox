package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ack */
/* compiled from: PG */
public final class ack extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final ack f158305f;

    /* renamed from: g */
    private static volatile C63010eb f158306g;

    /* renamed from: a */
    public int f158307a;

    /* renamed from: b */
    public int f158308b;

    /* renamed from: c */
    public aay f158309c;

    /* renamed from: d */
    public long f158310d;

    /* renamed from: e */
    public long f158311e;

    static {
        ack ack = new ack();
        f158305f = ack;
        C62942bv.registerDefaultInstance(ack.class, ack);
    }

    private ack() {
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
                return newMessageInfo(f158305f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", acj.f158304a, C45240c.f118157a, "d", "e"});
            case 3:
                return new ack();
            case 4:
                return new aci();
            case 5:
                return f158305f;
            case 6:
                C63010eb ebVar = f158306g;
                if (ebVar == null) {
                    synchronized (ack.class) {
                        ebVar = f158306g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158305f);
                            f158306g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
