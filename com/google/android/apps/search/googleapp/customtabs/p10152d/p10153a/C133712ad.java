package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.ad */
/* compiled from: PG */
public final class C133712ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133712ad f364202d;

    /* renamed from: e */
    private static volatile C63010eb f364203e;

    /* renamed from: a */
    public int f364204a;

    /* renamed from: b */
    public String f364205b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C133771b f364206c;

    static {
        C133712ad adVar = new C133712ad();
        f364202d = adVar;
        C62942bv.registerDefaultInstance(C133712ad.class, adVar);
    }

    private C133712ad() {
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
                return newMessageInfo(f364202d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C133712ad();
            case 4:
                return new C133711ac();
            case 5:
                return f364202d;
            case 6:
                C63010eb ebVar = f364203e;
                if (ebVar == null) {
                    synchronized (C133712ad.class) {
                        ebVar = f364203e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364202d);
                            f364203e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
