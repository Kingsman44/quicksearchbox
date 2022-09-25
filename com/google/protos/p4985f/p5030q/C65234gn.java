package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.protos.f.q.gn */
/* compiled from: PG */
public final class C65234gn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65234gn f176522c;

    /* renamed from: d */
    private static volatile C63010eb f176523d;

    /* renamed from: a */
    public int f176524a;

    /* renamed from: b */
    public C65682h f176525b;

    static {
        C65234gn gnVar = new C65234gn();
        f176522c = gnVar;
        C62942bv.registerDefaultInstance(C65234gn.class, gnVar);
    }

    private C65234gn() {
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
                return newMessageInfo(f176522c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65234gn();
            case 4:
                return new C65233gm();
            case 5:
                return f176522c;
            case 6:
                C63010eb ebVar = f176523d;
                if (ebVar == null) {
                    synchronized (C65234gn.class) {
                        ebVar = f176523d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176522c);
                            f176523d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
