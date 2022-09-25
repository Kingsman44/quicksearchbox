package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.i */
/* compiled from: PG */
public final class C65551i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65551i f178138c;

    /* renamed from: d */
    private static volatile C63010eb f178139d;

    /* renamed from: a */
    public int f178140a = 0;

    /* renamed from: b */
    public Object f178141b;

    static {
        C65551i iVar = new C65551i();
        f178138c = iVar;
        C62942bv.registerDefaultInstance(C65551i.class, iVar);
    }

    private C65551i() {
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
                return newMessageInfo(f178138c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C65561s.class, C65563u.class});
            case 3:
                return new C65551i();
            case 4:
                return new C65550h();
            case 5:
                return f178138c;
            case 6:
                C63010eb ebVar = f178139d;
                if (ebVar == null) {
                    synchronized (C65551i.class) {
                        ebVar = f178139d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178138c);
                            f178139d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
