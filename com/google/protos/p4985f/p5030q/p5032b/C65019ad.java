package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.ad */
/* compiled from: PG */
public final class C65019ad extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65019ad f176072c;

    /* renamed from: d */
    private static volatile C63010eb f176073d;

    /* renamed from: a */
    public int f176074a = 0;

    /* renamed from: b */
    public Object f176075b;

    static {
        C65019ad adVar = new C65019ad();
        f176072c = adVar;
        C62942bv.registerDefaultInstance(C65019ad.class, adVar);
    }

    private C65019ad() {
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
                return newMessageInfo(f176072c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C65016aa.class, C65018ac.class});
            case 3:
                return new C65019ad();
            case 4:
                return new C65078y();
            case 5:
                return f176072c;
            case 6:
                C63010eb ebVar = f176073d;
                if (ebVar == null) {
                    synchronized (C65019ad.class) {
                        ebVar = f176073d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176072c);
                            f176073d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
