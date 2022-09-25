package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4995e.C64801a;

/* renamed from: com.google.protos.f.q.dk */
/* compiled from: PG */
public final class C65150dk extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65150dk f176324c;

    /* renamed from: d */
    private static volatile C63010eb f176325d;

    /* renamed from: a */
    public int f176326a;

    /* renamed from: b */
    public int f176327b;

    static {
        C65150dk dkVar = new C65150dk();
        f176324c = dkVar;
        C62942bv.registerDefaultInstance(C65150dk.class, dkVar);
    }

    private C65150dk() {
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
                return newMessageInfo(f176324c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C64801a.f175617a});
            case 3:
                return new C65150dk();
            case 4:
                return new C65149dj();
            case 5:
                return f176324c;
            case 6:
                C63010eb ebVar = f176325d;
                if (ebVar == null) {
                    synchronized (C65150dk.class) {
                        ebVar = f176325d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176324c);
                            f176325d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
