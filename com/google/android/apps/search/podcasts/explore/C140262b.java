package com.google.android.apps.search.podcasts.explore;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.explore.b */
/* compiled from: PG */
public final class C140262b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140262b f381049c;

    /* renamed from: d */
    private static volatile C63010eb f381050d;

    /* renamed from: a */
    public boolean f381051a;

    /* renamed from: b */
    public String f381052b = BuildConfig.FLAVOR;

    static {
        C140262b bVar = new C140262b();
        f381049c = bVar;
        C62942bv.registerDefaultInstance(C140262b.class, bVar);
    }

    private C140262b() {
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
                return newMessageInfo(f381049c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C140262b();
            case 4:
                return new C140247a();
            case 5:
                return f381049c;
            case 6:
                C63010eb ebVar = f381050d;
                if (ebVar == null) {
                    synchronized (C140262b.class) {
                        ebVar = f381050d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381049c);
                            f381050d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
