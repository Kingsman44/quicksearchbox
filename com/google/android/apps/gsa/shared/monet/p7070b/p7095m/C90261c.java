package com.google.android.apps.gsa.shared.monet.p7070b.p7095m;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.m.c */
/* compiled from: PG */
public final class C90261c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C90261c f252127c;

    /* renamed from: d */
    private static volatile C63010eb f252128d;

    /* renamed from: a */
    public int f252129a;

    /* renamed from: b */
    public String f252130b = BuildConfig.FLAVOR;

    static {
        C90261c cVar = new C90261c();
        f252127c = cVar;
        C62942bv.registerDefaultInstance(C90261c.class, cVar);
    }

    private C90261c() {
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
                return newMessageInfo(f252127c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C90261c();
            case 4:
                return new C90260b();
            case 5:
                return f252127c;
            case 6:
                C63010eb ebVar = f252128d;
                if (ebVar == null) {
                    synchronized (C90261c.class) {
                        ebVar = f252128d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252127c);
                            f252128d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
