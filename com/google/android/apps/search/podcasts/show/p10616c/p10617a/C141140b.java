package com.google.android.apps.search.podcasts.show.p10616c.p10617a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.show.c.a.b */
/* compiled from: PG */
public final class C141140b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C141140b f383193b;

    /* renamed from: c */
    private static volatile C63010eb f383194c;

    /* renamed from: a */
    public String f383195a = BuildConfig.FLAVOR;

    static {
        C141140b bVar = new C141140b();
        f383193b = bVar;
        C62942bv.registerDefaultInstance(C141140b.class, bVar);
    }

    private C141140b() {
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
                return newMessageInfo(f383193b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C141140b();
            case 4:
                return new C141139a();
            case 5:
                return f383193b;
            case 6:
                C63010eb ebVar = f383194c;
                if (ebVar == null) {
                    synchronized (C141140b.class) {
                        ebVar = f383194c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383193b);
                            f383194c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
