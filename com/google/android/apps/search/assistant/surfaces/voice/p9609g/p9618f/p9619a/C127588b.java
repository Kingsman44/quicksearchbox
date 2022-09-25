package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9618f.p9619a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.f.a.b */
/* compiled from: PG */
public final class C127588b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C127588b f351288a;

    /* renamed from: b */
    private static volatile C63010eb f351289b;

    static {
        C127588b bVar = new C127588b();
        f351288a = bVar;
        C62942bv.registerDefaultInstance(C127588b.class, bVar);
    }

    private C127588b() {
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
                return newMessageInfo(f351288a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C127588b();
            case 4:
                return new C127587a();
            case 5:
                return f351288a;
            case 6:
                C63010eb ebVar = f351289b;
                if (ebVar == null) {
                    synchronized (C127588b.class) {
                        ebVar = f351289b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351288a);
                            f351289b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
