package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6066c;

import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.c.d */
/* compiled from: PG */
public final class C76654d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C76654d f211913b;

    /* renamed from: c */
    private static volatile C63010eb f211914c;

    /* renamed from: a */
    public C52081en f211915a;

    static {
        C76654d dVar = new C76654d();
        f211913b = dVar;
        C62942bv.registerDefaultInstance(C76654d.class, dVar);
    }

    private C76654d() {
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
                return newMessageInfo(f211913b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C76654d();
            case 4:
                return new C76653c();
            case 5:
                return f211913b;
            case 6:
                C63010eb ebVar = f211914c;
                if (ebVar == null) {
                    synchronized (C76654d.class) {
                        ebVar = f211914c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f211913b);
                            f211914c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
