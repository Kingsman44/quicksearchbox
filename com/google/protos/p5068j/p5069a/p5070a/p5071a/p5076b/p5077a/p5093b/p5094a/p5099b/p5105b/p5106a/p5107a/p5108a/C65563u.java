package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.u */
/* compiled from: PG */
public final class C65563u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65563u f178167a;

    /* renamed from: b */
    private static volatile C63010eb f178168b;

    static {
        C65563u uVar = new C65563u();
        f178167a = uVar;
        C62942bv.registerDefaultInstance(C65563u.class, uVar);
    }

    private C65563u() {
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
                return newMessageInfo(f178167a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65563u();
            case 4:
                return new C65562t();
            case 5:
                return f178167a;
            case 6:
                C63010eb ebVar = f178168b;
                if (ebVar == null) {
                    synchronized (C65563u.class) {
                        ebVar = f178168b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178167a);
                            f178168b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
