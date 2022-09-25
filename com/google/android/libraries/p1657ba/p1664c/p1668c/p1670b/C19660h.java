package com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.ba.c.c.b.h */
/* compiled from: PG */
public final class C19660h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19660h f54681b;

    /* renamed from: c */
    private static volatile C63010eb f54682c;

    /* renamed from: a */
    public C62960cg f54683a = emptyFloatList();

    static {
        C19660h hVar = new C19660h();
        f54681b = hVar;
        C62942bv.registerDefaultInstance(C19660h.class, hVar);
    }

    private C19660h() {
        C63088z zVar = C63088z.f170246b;
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
                return newMessageInfo(f54681b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new C19660h();
            case 4:
                return new C19659g();
            case 5:
                return f54681b;
            case 6:
                C63010eb ebVar = f54682c;
                if (ebVar == null) {
                    synchronized (C19660h.class) {
                        ebVar = f54682c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54681b);
                            f54682c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
