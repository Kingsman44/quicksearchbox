package com.google.p4283bv.p4287b.p4288a.p4289a.p4298c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.c.f */
/* compiled from: PG */
public final class C56672f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56672f f151278a;

    /* renamed from: b */
    private static volatile C63010eb f151279b;

    static {
        C56672f fVar = new C56672f();
        f151278a = fVar;
        C62942bv.registerDefaultInstance(C56672f.class, fVar);
    }

    private C56672f() {
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
                return newMessageInfo(f151278a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56672f();
            case 4:
                return new C56671e();
            case 5:
                return f151278a;
            case 6:
                C63010eb ebVar = f151279b;
                if (ebVar == null) {
                    synchronized (C56672f.class) {
                        ebVar = f151279b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151278a);
                            f151279b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
