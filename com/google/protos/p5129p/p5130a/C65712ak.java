package com.google.protos.p5129p.p5130a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.a.ak */
/* compiled from: PG */
public final class C65712ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65712ak f178531c;

    /* renamed from: d */
    private static volatile C63010eb f178532d;

    /* renamed from: a */
    public int f178533a;

    /* renamed from: b */
    public long f178534b;

    static {
        C65712ak akVar = new C65712ak();
        f178531c = akVar;
        C62942bv.registerDefaultInstance(C65712ak.class, akVar);
    }

    private C65712ak() {
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
                return newMessageInfo(f178531c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65712ak();
            case 4:
                return new C65711aj();
            case 5:
                return f178531c;
            case 6:
                C63010eb ebVar = f178532d;
                if (ebVar == null) {
                    synchronized (C65712ak.class) {
                        ebVar = f178532d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178531c);
                            f178532d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
