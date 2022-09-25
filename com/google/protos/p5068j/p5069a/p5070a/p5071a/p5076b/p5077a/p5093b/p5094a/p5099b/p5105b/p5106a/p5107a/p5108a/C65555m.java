package com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.j.a.a.a.b.a.b.a.b.b.a.a.a.m */
/* compiled from: PG */
public final class C65555m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65555m f178142c;

    /* renamed from: d */
    private static volatile C63010eb f178143d;

    /* renamed from: a */
    public int f178144a = 0;

    /* renamed from: b */
    public Object f178145b;

    static {
        C65555m mVar = new C65555m();
        f178142c = mVar;
        C62942bv.registerDefaultInstance(C65555m.class, mVar);
    }

    private C65555m() {
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
                return newMessageInfo(f178142c, "\u0001\u0003\u0001\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003ျ\u0000\u0004့\u0000\u0005ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C65555m();
            case 4:
                return new C65554l();
            case 5:
                return f178142c;
            case 6:
                C63010eb ebVar = f178143d;
                if (ebVar == null) {
                    synchronized (C65555m.class) {
                        ebVar = f178143d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178142c);
                            f178143d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
