package com.google.p4283bv.p4287b.p4288a.p4289a.p4296af;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.af.d */
/* compiled from: PG */
public final class C56652d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56652d f151241a;

    /* renamed from: b */
    private static volatile C63010eb f151242b;

    static {
        C56652d dVar = new C56652d();
        f151241a = dVar;
        C62942bv.registerDefaultInstance(C56652d.class, dVar);
    }

    private C56652d() {
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
                return newMessageInfo(f151241a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56652d();
            case 4:
                return new C56651c();
            case 5:
                return f151241a;
            case 6:
                C63010eb ebVar = f151242b;
                if (ebVar == null) {
                    synchronized (C56652d.class) {
                        ebVar = f151242b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151241a);
                            f151242b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}