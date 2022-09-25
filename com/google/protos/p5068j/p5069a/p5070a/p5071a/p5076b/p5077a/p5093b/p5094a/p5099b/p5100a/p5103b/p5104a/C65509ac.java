package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ac */
/* compiled from: PG */
public final class C65509ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65509ac f178070c;

    /* renamed from: d */
    private static volatile C63010eb f178071d;

    /* renamed from: a */
    public int f178072a;

    /* renamed from: b */
    public int f178073b;

    static {
        C65509ac acVar = new C65509ac();
        f178070c = acVar;
        C62942bv.registerDefaultInstance(C65509ac.class, acVar);
    }

    private C65509ac() {
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
                return newMessageInfo(f178070c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C65509ac();
            case 4:
                return new C65508ab();
            case 5:
                return f178070c;
            case 6:
                C63010eb ebVar = f178071d;
                if (ebVar == null) {
                    synchronized (C65509ac.class) {
                        ebVar = f178071d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178070c);
                            f178071d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
