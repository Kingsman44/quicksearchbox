package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9595b;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h.C127465c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.b.g */
/* compiled from: PG */
public final class C127420g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127420g f350858c;

    /* renamed from: d */
    private static volatile C63010eb f350859d;

    /* renamed from: a */
    public int f350860a;

    /* renamed from: b */
    public C127465c f350861b;

    static {
        C127420g gVar = new C127420g();
        f350858c = gVar;
        C62942bv.registerDefaultInstance(C127420g.class, gVar);
    }

    private C127420g() {
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
                return newMessageInfo(f350858c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C127420g();
            case 4:
                return new C127419f();
            case 5:
                return f350858c;
            case 6:
                C63010eb ebVar = f350859d;
                if (ebVar == null) {
                    synchronized (C127420g.class) {
                        ebVar = f350859d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350858c);
                            f350859d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
