package com.google.android.apps.search.googleapp.search.p10404a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.a.c */
/* compiled from: PG */
public final class C137382c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C137382c f373684d;

    /* renamed from: e */
    private static volatile C63010eb f373685e;

    /* renamed from: a */
    public int f373686a;

    /* renamed from: b */
    public String f373687b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f373688c;

    static {
        C137382c cVar = new C137382c();
        f373684d = cVar;
        C62942bv.registerDefaultInstance(C137382c.class, cVar);
    }

    private C137382c() {
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
                return newMessageInfo(f373684d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C137382c();
            case 4:
                return new C137381b();
            case 5:
                return f373684d;
            case 6:
                C63010eb ebVar = f373685e;
                if (ebVar == null) {
                    synchronized (C137382c.class) {
                        ebVar = f373685e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373684d);
                            f373685e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
