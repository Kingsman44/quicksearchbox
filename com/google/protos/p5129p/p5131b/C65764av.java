package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.p.b.av */
/* compiled from: PG */
public final class C65764av extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65764av f178782c;

    /* renamed from: d */
    public static final C62940bt f178783d;

    /* renamed from: e */
    private static volatile C63010eb f178784e;

    /* renamed from: a */
    public int f178785a;

    /* renamed from: b */
    public int f178786b;

    static {
        C65764av avVar = new C65764av();
        f178782c = avVar;
        C62942bv.registerDefaultInstance(C65764av.class, avVar);
        f178783d = C62942bv.newSingularGeneratedExtension(C65808cl.f178897d, avVar, avVar, (C62958ce) null, 336978804, C63066gd.MESSAGE, C65764av.class);
    }

    private C65764av() {
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
                return newMessageInfo(f178782c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C65763au.f178781a});
            case 3:
                return new C65764av();
            case 4:
                return new C65762at();
            case 5:
                return f178782c;
            case 6:
                C63010eb ebVar = f178784e;
                if (ebVar == null) {
                    synchronized (C65764av.class) {
                        ebVar = f178784e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178782c);
                            f178784e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
