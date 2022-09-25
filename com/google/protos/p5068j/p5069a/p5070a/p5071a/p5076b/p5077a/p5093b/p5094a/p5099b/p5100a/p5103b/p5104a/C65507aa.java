package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.aa */
/* compiled from: PG */
public final class C65507aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65507aa f178066c;

    /* renamed from: d */
    private static volatile C63010eb f178067d;

    /* renamed from: a */
    public int f178068a = 0;

    /* renamed from: b */
    public Object f178069b;

    static {
        C65507aa aaVar = new C65507aa();
        f178066c = aaVar;
        C62942bv.registerDefaultInstance(C65507aa.class, aaVar);
    }

    private C65507aa() {
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
                return newMessageInfo(f178066c, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", C65541y.class, C65515ai.class, C65517ak.class, C65511ae.class, C65513ag.class, C65509ac.class, C65539w.class});
            case 3:
                return new C65507aa();
            case 4:
                return new C65542z();
            case 5:
                return f178066c;
            case 6:
                C63010eb ebVar = f178067d;
                if (ebVar == null) {
                    synchronized (C65507aa.class) {
                        ebVar = f178067d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178066c);
                            f178067d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
