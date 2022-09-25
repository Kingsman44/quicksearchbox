package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.c.a.h */
/* compiled from: PG */
public final class C127544h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127544h f351188a;

    /* renamed from: b */
    private static volatile C63010eb f351189b;

    static {
        C127544h hVar = new C127544h();
        f351188a = hVar;
        C62942bv.registerDefaultInstance(C127544h.class, hVar);
    }

    private C127544h() {
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
                return newMessageInfo(f351188a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127544h();
            case 4:
                return new C127543g();
            case 5:
                return f351188a;
            case 6:
                C63010eb ebVar = f351189b;
                if (ebVar == null) {
                    synchronized (C127544h.class) {
                        ebVar = f351189b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351188a);
                            f351189b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
