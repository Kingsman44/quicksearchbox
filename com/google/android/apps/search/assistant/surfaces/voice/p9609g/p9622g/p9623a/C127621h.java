package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9623a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.a.h */
/* compiled from: PG */
public final class C127621h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127621h f351344a;

    /* renamed from: b */
    private static volatile C63010eb f351345b;

    static {
        C127621h hVar = new C127621h();
        f351344a = hVar;
        C62942bv.registerDefaultInstance(C127621h.class, hVar);
    }

    private C127621h() {
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
                return newMessageInfo(f351344a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127621h();
            case 4:
                return new C127620g();
            case 5:
                return f351344a;
            case 6:
                C63010eb ebVar = f351345b;
                if (ebVar == null) {
                    synchronized (C127621h.class) {
                        ebVar = f351345b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351344a);
                            f351345b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
