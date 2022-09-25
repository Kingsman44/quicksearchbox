package com.google.android.libraries.search.assistant.invocation.p2636j.p2640c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.j.c.h */
/* compiled from: PG */
public final class C33902h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C33902h f90442c;

    /* renamed from: e */
    private static volatile C63010eb f90443e;

    /* renamed from: a */
    public String f90444a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f90445b;

    /* renamed from: d */
    private int f90446d;

    static {
        C33902h hVar = new C33902h();
        f90442c = hVar;
        C62942bv.registerDefaultInstance(C33902h.class, hVar);
    }

    private C33902h() {
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
                return newMessageInfo(f90442c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002\f", new Object[]{"d", "a", "b"});
            case 3:
                return new C33902h();
            case 4:
                return new C33900f();
            case 5:
                return f90442c;
            case 6:
                C63010eb ebVar = f90443e;
                if (ebVar == null) {
                    synchronized (C33902h.class) {
                        ebVar = f90443e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90442c);
                            f90443e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
