package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.o */
/* compiled from: PG */
public final class C65531o extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65531o f178108a;

    /* renamed from: b */
    private static volatile C63010eb f178109b;

    static {
        C65531o oVar = new C65531o();
        f178108a = oVar;
        C62942bv.registerDefaultInstance(C65531o.class, oVar);
    }

    private C65531o() {
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
                return newMessageInfo(f178108a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65531o();
            case 4:
                return new C65530n();
            case 5:
                return f178108a;
            case 6:
                C63010eb ebVar = f178109b;
                if (ebVar == null) {
                    synchronized (C65531o.class) {
                        ebVar = f178109b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178108a);
                            f178109b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
