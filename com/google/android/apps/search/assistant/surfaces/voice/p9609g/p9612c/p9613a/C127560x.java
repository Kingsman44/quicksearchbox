package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.x */
/* compiled from: PG */
public final class C127560x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127560x f351206a;

    /* renamed from: b */
    private static volatile C63010eb f351207b;

    static {
        C127560x xVar = new C127560x();
        f351206a = xVar;
        C62942bv.registerDefaultInstance(C127560x.class, xVar);
    }

    private C127560x() {
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
                return newMessageInfo(f351206a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127560x();
            case 4:
                return new C127559w();
            case 5:
                return f351206a;
            case 6:
                C63010eb ebVar = f351207b;
                if (ebVar == null) {
                    synchronized (C127560x.class) {
                        ebVar = f351207b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351206a);
                            f351207b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
