package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.j */
/* compiled from: PG */
public final class C138259j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C138259j f376158d;

    /* renamed from: e */
    private static volatile C63010eb f376159e;

    /* renamed from: a */
    public int f376160a;

    /* renamed from: b */
    public String f376161b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f376162c;

    static {
        C138259j jVar = new C138259j();
        f376158d = jVar;
        C62942bv.registerDefaultInstance(C138259j.class, jVar);
    }

    private C138259j() {
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
                return newMessageInfo(f376158d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C138259j();
            case 4:
                return new C138258i();
            case 5:
                return f376158d;
            case 6:
                C63010eb ebVar = f376159e;
                if (ebVar == null) {
                    synchronized (C138259j.class) {
                        ebVar = f376159e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376158d);
                            f376159e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
