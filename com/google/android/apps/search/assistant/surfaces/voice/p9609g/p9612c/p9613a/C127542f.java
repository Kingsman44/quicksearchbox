package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.f */
/* compiled from: PG */
public final class C127542f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127542f f351186a;

    /* renamed from: b */
    private static volatile C63010eb f351187b;

    static {
        C127542f fVar = new C127542f();
        f351186a = fVar;
        C62942bv.registerDefaultInstance(C127542f.class, fVar);
    }

    private C127542f() {
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
                return newMessageInfo(f351186a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127542f();
            case 4:
                return new C127541e();
            case 5:
                return f351186a;
            case 6:
                C63010eb ebVar = f351187b;
                if (ebVar == null) {
                    synchronized (C127542f.class) {
                        ebVar = f351187b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351186a);
                            f351187b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
