package com.google.p427am.p435c.p436a.p437a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.c.a.a.b */
/* compiled from: PG */
public final class C8698b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8698b f30035a;

    /* renamed from: b */
    private static volatile C63010eb f30036b;

    static {
        C8698b bVar = new C8698b();
        f30035a = bVar;
        C62942bv.registerDefaultInstance(C8698b.class, bVar);
    }

    private C8698b() {
        emptyProtobufList();
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
                return newMessageInfo(f30035a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C8698b();
            case 4:
                return new C8697a();
            case 5:
                return f30035a;
            case 6:
                C63010eb ebVar = f30036b;
                if (ebVar == null) {
                    synchronized (C8698b.class) {
                        ebVar = f30036b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30035a);
                            f30036b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
