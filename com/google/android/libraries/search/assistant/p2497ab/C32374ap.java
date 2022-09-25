package com.google.android.libraries.search.assistant.p2497ab;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.ab.ap */
/* compiled from: PG */
public final class C32374ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C32374ap f86791d;

    /* renamed from: e */
    private static volatile C63010eb f86792e;

    /* renamed from: a */
    public int f86793a;

    /* renamed from: b */
    public C62995dn f86794b = C62995dn.f170057a;

    /* renamed from: c */
    public String f86795c = BuildConfig.FLAVOR;

    static {
        C32374ap apVar = new C32374ap();
        f86791d = apVar;
        C62942bv.registerDefaultInstance(C32374ap.class, apVar);
    }

    private C32374ap() {
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
                return newMessageInfo(f86791d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0001\u0000\u0000\u00022\u0003ဈ\u0001", new Object[]{"a", "b", C32373ao.f86790a, C45240c.f118157a});
            case 3:
                return new C32374ap();
            case 4:
                return new C32372an();
            case 5:
                return f86791d;
            case 6:
                C63010eb ebVar = f86792e;
                if (ebVar == null) {
                    synchronized (C32374ap.class) {
                        ebVar = f86792e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86791d);
                            f86792e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
