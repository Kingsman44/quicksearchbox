package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aj */
/* compiled from: PG */
public final class C87701aj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87701aj f237156b;

    /* renamed from: d */
    private static volatile C63010eb f237157d;

    /* renamed from: a */
    public String f237158a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f237159c;

    static {
        C87701aj ajVar = new C87701aj();
        f237156b = ajVar;
        C62942bv.registerDefaultInstance(C87701aj.class, ajVar);
    }

    private C87701aj() {
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
                return newMessageInfo(f237156b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87701aj();
            case 4:
                return new C87700ai();
            case 5:
                return f237156b;
            case 6:
                C63010eb ebVar = f237157d;
                if (ebVar == null) {
                    synchronized (C87701aj.class) {
                        ebVar = f237157d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237156b);
                            f237157d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
