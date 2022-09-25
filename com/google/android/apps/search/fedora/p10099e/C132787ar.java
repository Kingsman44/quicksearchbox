package com.google.android.apps.search.fedora.p10099e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.fedora.e.ar */
/* compiled from: PG */
public final class C132787ar extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C132787ar f362281g;

    /* renamed from: h */
    private static volatile C63010eb f362282h;

    /* renamed from: a */
    public int f362283a;

    /* renamed from: b */
    public C132786aq f362284b;

    /* renamed from: c */
    public C132784ao f362285c;

    /* renamed from: d */
    public boolean f362286d;

    /* renamed from: e */
    public String f362287e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f362288f;

    static {
        C132787ar arVar = new C132787ar();
        f362281g = arVar;
        C62942bv.registerDefaultInstance(C132787ar.class, arVar);
    }

    private C132787ar() {
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
                return newMessageInfo(f362281g, "\u0001\u0005\u0000\u0001\u0002\u000e\u0005\u0000\u0000\u0000\u0002ဇ\u0002\u0006ဈ\u0003\nဉ\u0000\u000bဉ\u0001\u000eဇ\u0005", new Object[]{"a", "d", "e", "b", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C132787ar();
            case 4:
                return new C132780ak();
            case 5:
                return f362281g;
            case 6:
                C63010eb ebVar = f362282h;
                if (ebVar == null) {
                    synchronized (C132787ar.class) {
                        ebVar = f362282h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f362281g);
                            f362282h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
