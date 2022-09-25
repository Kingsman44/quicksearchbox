package com.google.p4283bv.p4287b.p4288a.p4289a.p4298c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.c.d */
/* compiled from: PG */
public final class C56670d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56670d f151276a;

    /* renamed from: b */
    private static volatile C63010eb f151277b;

    static {
        C56670d dVar = new C56670d();
        f151276a = dVar;
        C62942bv.registerDefaultInstance(C56670d.class, dVar);
    }

    private C56670d() {
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
                return newMessageInfo(f151276a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56670d();
            case 4:
                return new C56669c();
            case 5:
                return f151276a;
            case 6:
                C63010eb ebVar = f151277b;
                if (ebVar == null) {
                    synchronized (C56670d.class) {
                        ebVar = f151277b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151276a);
                            f151277b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
