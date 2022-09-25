package com.google.assistant.p3745ab.p3774z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.z.h */
/* compiled from: PG */
public final class C48444h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48444h f125165a;

    /* renamed from: c */
    private static volatile C63010eb f125166c;

    /* renamed from: b */
    private C62995dn f125167b = C62995dn.f170057a;

    static {
        C48444h hVar = new C48444h();
        f125165a = hVar;
        C62942bv.registerDefaultInstance(C48444h.class, hVar);
    }

    private C48444h() {
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
                return newMessageInfo(f125165a, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"b", C48443g.f125164a});
            case 3:
                return new C48444h();
            case 4:
                return new C48442f();
            case 5:
                return f125165a;
            case 6:
                C63010eb ebVar = f125166c;
                if (ebVar == null) {
                    synchronized (C48444h.class) {
                        ebVar = f125166c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125165a);
                            f125166c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
