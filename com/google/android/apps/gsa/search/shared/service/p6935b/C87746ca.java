package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ca */
/* compiled from: PG */
public final class C87746ca extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87746ca f237493c;

    /* renamed from: e */
    private static volatile C63010eb f237494e;

    /* renamed from: a */
    public String f237495a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f237496b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f237497d;

    static {
        C87746ca caVar = new C87746ca();
        f237493c = caVar;
        C62942bv.registerDefaultInstance(C87746ca.class, caVar);
    }

    private C87746ca() {
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
                return newMessageInfo(f237493c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C87746ca();
            case 4:
                return new C87744bz();
            case 5:
                return f237493c;
            case 6:
                C63010eb ebVar = f237494e;
                if (ebVar == null) {
                    synchronized (C87746ca.class) {
                        ebVar = f237494e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237493c);
                            f237494e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
