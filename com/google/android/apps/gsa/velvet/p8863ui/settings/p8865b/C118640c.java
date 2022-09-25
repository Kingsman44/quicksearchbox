package com.google.android.apps.gsa.velvet.p8863ui.settings.p8865b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b.c */
/* compiled from: PG */
public final class C118640c extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C118640c f330976g;

    /* renamed from: h */
    private static volatile C63010eb f330977h;

    /* renamed from: a */
    public int f330978a;

    /* renamed from: b */
    public String f330979b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f330980c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f330981d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f330982e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f330983f;

    static {
        C118640c cVar = new C118640c();
        f330976g = cVar;
        C62942bv.registerDefaultInstance(C118640c.class, cVar);
    }

    private C118640c() {
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
                return newMessageInfo(f330976g, "\u0001\u0005\u0000\u0001\u0004\b\u0005\u0000\u0000\u0000\u0004ဈ\u0003\u0005ဈ\u0000\u0006ဈ\u0001\u0007ဈ\u0002\bဇ\u0004", new Object[]{"a", "e", "b", C45240c.f118157a, "d", C10662f.f35572a});
            case 3:
                return new C118640c();
            case 4:
                return new C118639b();
            case 5:
                return f330976g;
            case 6:
                C63010eb ebVar = f330977h;
                if (ebVar == null) {
                    synchronized (C118640c.class) {
                        ebVar = f330977h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f330976g);
                            f330977h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
