package com.google.assistant.p3803ag.p3809c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.d */
/* compiled from: PG */
public final class C49007d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49007d f126766b;

    /* renamed from: c */
    private static volatile C63010eb f126767c;

    /* renamed from: a */
    public int f126768a;

    static {
        C49007d dVar = new C49007d();
        f126766b = dVar;
        C62942bv.registerDefaultInstance(C49007d.class, dVar);
    }

    private C49007d() {
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
                return newMessageInfo(f126766b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C49007d();
            case 4:
                return new C48926a();
            case 5:
                return f126766b;
            case 6:
                C63010eb ebVar = f126767c;
                if (ebVar == null) {
                    synchronized (C49007d.class) {
                        ebVar = f126767c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126766b);
                            f126767c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
