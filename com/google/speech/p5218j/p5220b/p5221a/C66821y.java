package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.y */
/* compiled from: PG */
public final class C66821y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C66821y f181709b;

    /* renamed from: c */
    private static volatile C63010eb f181710c;

    /* renamed from: a */
    public C62971cq f181711a = emptyProtobufList();

    static {
        C66821y yVar = new C66821y();
        f181709b = yVar;
        C62942bv.registerDefaultInstance(C66821y.class, yVar);
    }

    private C66821y() {
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
                return newMessageInfo(f181709b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C66818v.class});
            case 3:
                return new C66821y();
            case 4:
                return new C66815s();
            case 5:
                return f181709b;
            case 6:
                C63010eb ebVar = f181710c;
                if (ebVar == null) {
                    synchronized (C66821y.class) {
                        ebVar = f181710c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181709b);
                            f181710c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
