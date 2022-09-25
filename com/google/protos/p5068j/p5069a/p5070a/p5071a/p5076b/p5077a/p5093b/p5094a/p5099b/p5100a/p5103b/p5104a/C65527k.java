package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.k */
/* compiled from: PG */
public final class C65527k extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65527k f178101a;

    /* renamed from: b */
    private static volatile C63010eb f178102b;

    static {
        C65527k kVar = new C65527k();
        f178101a = kVar;
        C62942bv.registerDefaultInstance(C65527k.class, kVar);
    }

    private C65527k() {
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
                return newMessageInfo(f178101a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C65527k();
            case 4:
                return new C65526j();
            case 5:
                return f178101a;
            case 6:
                C63010eb ebVar = f178102b;
                if (ebVar == null) {
                    synchronized (C65527k.class) {
                        ebVar = f178102b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178101a);
                            f178102b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
