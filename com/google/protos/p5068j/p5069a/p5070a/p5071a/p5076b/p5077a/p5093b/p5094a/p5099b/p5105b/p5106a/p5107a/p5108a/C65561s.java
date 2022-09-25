package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.s */
/* compiled from: PG */
public final class C65561s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65561s f178165a;

    /* renamed from: b */
    private static volatile C63010eb f178166b;

    static {
        C65561s sVar = new C65561s();
        f178165a = sVar;
        C62942bv.registerDefaultInstance(C65561s.class, sVar);
    }

    private C65561s() {
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
                return newMessageInfo(f178165a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65561s();
            case 4:
                return new C65560r();
            case 5:
                return f178165a;
            case 6:
                C63010eb ebVar = f178166b;
                if (ebVar == null) {
                    synchronized (C65561s.class) {
                        ebVar = f178166b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178165a);
                            f178166b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
