package com.google.speech.p5218j.p5220b.p5221a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.c */
/* compiled from: PG */
public final class C66799c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66799c f181658a;

    /* renamed from: b */
    private static volatile C63010eb f181659b;

    static {
        C66799c cVar = new C66799c();
        f181658a = cVar;
        C62942bv.registerDefaultInstance(C66799c.class, cVar);
    }

    private C66799c() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f181658a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66799c();
            case 4:
                return new C66798b();
            case 5:
                return f181658a;
            case 6:
                C63010eb ebVar = f181659b;
                if (ebVar == null) {
                    synchronized (C66799c.class) {
                        ebVar = f181659b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181658a);
                            f181659b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
