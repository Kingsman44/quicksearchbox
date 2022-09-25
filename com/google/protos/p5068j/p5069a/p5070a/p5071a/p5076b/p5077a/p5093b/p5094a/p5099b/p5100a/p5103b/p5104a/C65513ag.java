package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.a.b.a.ag */
/* compiled from: PG */
public final class C65513ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65513ag f178078b;

    /* renamed from: c */
    private static volatile C63010eb f178079c;

    /* renamed from: a */
    public int f178080a;

    static {
        C65513ag agVar = new C65513ag();
        f178078b = agVar;
        C62942bv.registerDefaultInstance(C65513ag.class, agVar);
    }

    private C65513ag() {
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
                return newMessageInfo(f178078b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C65513ag();
            case 4:
                return new C65512af();
            case 5:
                return f178078b;
            case 6:
                C63010eb ebVar = f178079c;
                if (ebVar == null) {
                    synchronized (C65513ag.class) {
                        ebVar = f178079c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178078b);
                            f178079c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
