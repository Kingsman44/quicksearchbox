package com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36265d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.c.b */
/* compiled from: PG */
public final class C107271b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C107271b f298567d;

    /* renamed from: e */
    private static volatile C63010eb f298568e;

    /* renamed from: a */
    public int f298569a;

    /* renamed from: b */
    public String f298570b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C36265d f298571c;

    static {
        C107271b bVar = new C107271b();
        f298567d = bVar;
        C62942bv.registerDefaultInstance(C107271b.class, bVar);
    }

    private C107271b() {
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
                return newMessageInfo(f298567d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C107271b();
            case 4:
                return new C107270a();
            case 5:
                return f298567d;
            case 6:
                C63010eb ebVar = f298568e;
                if (ebVar == null) {
                    synchronized (C107271b.class) {
                        ebVar = f298568e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f298567d);
                            f298568e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
