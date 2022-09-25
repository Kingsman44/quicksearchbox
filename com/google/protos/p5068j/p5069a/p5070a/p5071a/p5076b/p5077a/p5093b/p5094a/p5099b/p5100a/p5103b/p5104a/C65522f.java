package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.f */
/* compiled from: PG */
public final class C65522f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65522f f178095a;

    /* renamed from: b */
    private static volatile C63010eb f178096b;

    static {
        C65522f fVar = new C65522f();
        f178095a = fVar;
        C62942bv.registerDefaultInstance(C65522f.class, fVar);
    }

    private C65522f() {
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
                return newMessageInfo(f178095a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65522f();
            case 4:
                return new C65521e();
            case 5:
                return f178095a;
            case 6:
                C63010eb ebVar = f178096b;
                if (ebVar == null) {
                    synchronized (C65522f.class) {
                        ebVar = f178096b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178095a);
                            f178096b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
