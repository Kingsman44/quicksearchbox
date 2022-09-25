package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.cr */
/* compiled from: PG */
public final class C65126cr extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65126cr f176289b;

    /* renamed from: c */
    private static volatile C63010eb f176290c;

    /* renamed from: a */
    public C62995dn f176291a = C62995dn.f170057a;

    static {
        C65126cr crVar = new C65126cr();
        f176289b = crVar;
        C62942bv.registerDefaultInstance(C65126cr.class, crVar);
    }

    private C65126cr() {
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
                return newMessageInfo(f176289b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C65125cq.f176288a});
            case 3:
                return new C65126cr();
            case 4:
                return new C65124cp();
            case 5:
                return f176289b;
            case 6:
                C63010eb ebVar = f176290c;
                if (ebVar == null) {
                    synchronized (C65126cr.class) {
                        ebVar = f176290c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176289b);
                            f176290c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
