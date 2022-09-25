package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.i */
/* compiled from: PG */
public final class C62789i extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62789i f169559a;

    /* renamed from: b */
    private static volatile C63010eb f169560b;

    static {
        C62789i iVar = new C62789i();
        f169559a = iVar;
        C62942bv.registerDefaultInstance(C62789i.class, iVar);
    }

    private C62789i() {
        emptyIntList();
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
                return newMessageInfo(f169559a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62789i();
            case 4:
                return new C62788h();
            case 5:
                return f169559a;
            case 6:
                C63010eb ebVar = f169560b;
                if (ebVar == null) {
                    synchronized (C62789i.class) {
                        ebVar = f169560b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169559a);
                            f169560b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
