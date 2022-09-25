package com.google.android.apps.gsa.search.shared.actions;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.k */
/* compiled from: PG */
public final class C87423k extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87423k f236084e;

    /* renamed from: f */
    private static volatile C63010eb f236085f;

    /* renamed from: a */
    public int f236086a;

    /* renamed from: b */
    public int f236087b;

    /* renamed from: c */
    public int f236088c;

    /* renamed from: d */
    public String f236089d = BuildConfig.FLAVOR;

    static {
        C87423k kVar = new C87423k();
        f236084e = kVar;
        C62942bv.registerDefaultInstance(C87423k.class, kVar);
    }

    private C87423k() {
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
                return newMessageInfo(f236084e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C87477t.f236246a, C45240c.f118157a, "d"});
            case 3:
                return new C87423k();
            case 4:
                return new C87422j();
            case 5:
                return f236084e;
            case 6:
                C63010eb ebVar = f236085f;
                if (ebVar == null) {
                    synchronized (C87423k.class) {
                        ebVar = f236085f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f236084e);
                            f236085f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
