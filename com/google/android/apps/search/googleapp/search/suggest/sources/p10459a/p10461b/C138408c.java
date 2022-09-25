package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a.p10461b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.b.c */
/* compiled from: PG */
public final class C138408c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C138408c f376504c;

    /* renamed from: d */
    private static volatile C63010eb f376505d;

    /* renamed from: a */
    public int f376506a;

    /* renamed from: b */
    public String f376507b = BuildConfig.FLAVOR;

    static {
        C138408c cVar = new C138408c();
        f376504c = cVar;
        C62942bv.registerDefaultInstance(C138408c.class, cVar);
    }

    private C138408c() {
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
                return newMessageInfo(f376504c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C138408c();
            case 4:
                return new C138407b();
            case 5:
                return f376504c;
            case 6:
                C63010eb ebVar = f376505d;
                if (ebVar == null) {
                    synchronized (C138408c.class) {
                        ebVar = f376505d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f376504c);
                            f376505d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
