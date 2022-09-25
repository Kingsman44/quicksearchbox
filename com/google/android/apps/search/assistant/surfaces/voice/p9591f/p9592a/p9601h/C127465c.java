package com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9601h;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.f.a.h.c */
/* compiled from: PG */
public final class C127465c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C127465c f350959c;

    /* renamed from: d */
    private static volatile C63010eb f350960d;

    /* renamed from: a */
    public int f350961a;

    /* renamed from: b */
    public String f350962b = BuildConfig.FLAVOR;

    static {
        C127465c cVar = new C127465c();
        f350959c = cVar;
        C62942bv.registerDefaultInstance(C127465c.class, cVar);
    }

    private C127465c() {
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
                return newMessageInfo(f350959c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C127465c();
            case 4:
                return new C127463a();
            case 5:
                return f350959c;
            case 6:
                C63010eb ebVar = f350960d;
                if (ebVar == null) {
                    synchronized (C127465c.class) {
                        ebVar = f350960d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f350959c);
                            f350960d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
