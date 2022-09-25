package com.google.android.apps.search.assistant.surfaces.voice.growth.p9630b.p9631a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.b.a.d */
/* compiled from: PG */
public final class C127716d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127716d f351593a;

    /* renamed from: b */
    private static volatile C63010eb f351594b;

    static {
        C127716d dVar = new C127716d();
        f351593a = dVar;
        C62942bv.registerDefaultInstance(C127716d.class, dVar);
    }

    private C127716d() {
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
                return newMessageInfo(f351593a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127716d();
            case 4:
                return new C127715c();
            case 5:
                return f351593a;
            case 6:
                C63010eb ebVar = f351594b;
                if (ebVar == null) {
                    synchronized (C127716d.class) {
                        ebVar = f351594b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351593a);
                            f351594b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
