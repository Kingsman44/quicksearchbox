package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.g.g */
/* compiled from: PG */
public final class C127459g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C127459g f350947b;

    /* renamed from: c */
    private static volatile C63010eb f350948c;

    /* renamed from: a */
    public C127465c f350949a;

    static {
        C127459g gVar = new C127459g();
        f350947b = gVar;
        C62942bv.registerDefaultInstance(C127459g.class, gVar);
    }

    private C127459g() {
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
                return newMessageInfo(f350947b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C127459g();
            case 4:
                return new C127458f();
            case 5:
                return f350947b;
            case 6:
                C63010eb ebVar = f350948c;
                if (ebVar == null) {
                    synchronized (C127459g.class) {
                        ebVar = f350948c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350947b);
                            f350948c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
