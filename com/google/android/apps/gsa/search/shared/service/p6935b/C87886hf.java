package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hf */
/* compiled from: PG */
public final class C87886hf extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87886hf f237753b;

    /* renamed from: d */
    private static volatile C63010eb f237754d;

    /* renamed from: a */
    public String f237755a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f237756c;

    static {
        C87886hf hfVar = new C87886hf();
        f237753b = hfVar;
        C62942bv.registerDefaultInstance(C87886hf.class, hfVar);
    }

    private C87886hf() {
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
                return newMessageInfo(f237753b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87886hf();
            case 4:
                return new C87885he();
            case 5:
                return f237753b;
            case 6:
                C63010eb ebVar = f237754d;
                if (ebVar == null) {
                    synchronized (C87886hf.class) {
                        ebVar = f237754d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237753b);
                            f237754d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
