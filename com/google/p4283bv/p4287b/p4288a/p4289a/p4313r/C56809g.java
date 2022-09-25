package com.google.p4283bv.p4287b.p4288a.p4289a.p4313r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.r.g */
/* compiled from: PG */
public final class C56809g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56809g f151591a;

    /* renamed from: b */
    private static volatile C63010eb f151592b;

    static {
        C56809g gVar = new C56809g();
        f151591a = gVar;
        C62942bv.registerDefaultInstance(C56809g.class, gVar);
    }

    private C56809g() {
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
                return newMessageInfo(f151591a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56809g();
            case 4:
                return new C56808f();
            case 5:
                return f151591a;
            case 6:
                C63010eb ebVar = f151592b;
                if (ebVar == null) {
                    synchronized (C56809g.class) {
                        ebVar = f151592b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151591a);
                            f151592b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
