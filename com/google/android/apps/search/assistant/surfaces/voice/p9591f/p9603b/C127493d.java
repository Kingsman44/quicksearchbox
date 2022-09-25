package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9603b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.b.d */
/* compiled from: PG */
public final class C127493d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127493d f351010c;

    /* renamed from: d */
    private static volatile C63010eb f351011d;

    /* renamed from: a */
    public int f351012a;

    /* renamed from: b */
    public boolean f351013b;

    static {
        C127493d dVar = new C127493d();
        f351010c = dVar;
        C62942bv.registerDefaultInstance(C127493d.class, dVar);
    }

    private C127493d() {
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
                return newMessageInfo(f351010c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127493d();
            case 4:
                return new C127492c();
            case 5:
                return f351010c;
            case 6:
                C63010eb ebVar = f351011d;
                if (ebVar == null) {
                    synchronized (C127493d.class) {
                        ebVar = f351011d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f351010c);
                            f351011d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
