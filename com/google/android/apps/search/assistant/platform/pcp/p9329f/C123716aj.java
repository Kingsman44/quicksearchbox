package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.aj */
/* compiled from: PG */
public final class C123716aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C123716aj f341727c;

    /* renamed from: e */
    private static volatile C63010eb f341728e;

    /* renamed from: a */
    public int f341729a;

    /* renamed from: b */
    public String f341730b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f341731d;

    static {
        C123716aj ajVar = new C123716aj();
        f341727c = ajVar;
        C62942bv.registerDefaultInstance(C123716aj.class, ajVar);
    }

    private C123716aj() {
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
                return newMessageInfo(f341727c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", C53306j.m86810b(), "b"});
            case 3:
                return new C123716aj();
            case 4:
                return new C123715ai();
            case 5:
                return f341727c;
            case 6:
                C63010eb ebVar = f341728e;
                if (ebVar == null) {
                    synchronized (C123716aj.class) {
                        ebVar = f341728e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341727c);
                            f341728e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
