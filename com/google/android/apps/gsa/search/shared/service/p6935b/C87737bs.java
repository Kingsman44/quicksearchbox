package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bs */
/* compiled from: PG */
public final class C87737bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87737bs f237225b;

    /* renamed from: d */
    private static volatile C63010eb f237226d;

    /* renamed from: a */
    public String f237227a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f237228c;

    static {
        C87737bs bsVar = new C87737bs();
        f237225b = bsVar;
        C62942bv.registerDefaultInstance(C87737bs.class, bsVar);
    }

    private C87737bs() {
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
                return newMessageInfo(f237225b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87737bs();
            case 4:
                return new C87736br();
            case 5:
                return f237225b;
            case 6:
                C63010eb ebVar = f237226d;
                if (ebVar == null) {
                    synchronized (C87737bs.class) {
                        ebVar = f237226d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237225b);
                            f237226d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
