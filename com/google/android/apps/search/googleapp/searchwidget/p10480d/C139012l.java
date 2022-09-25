package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.l */
/* compiled from: PG */
public final class C139012l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C139012l f378057d;

    /* renamed from: e */
    private static volatile C63010eb f378058e;

    /* renamed from: a */
    public int f378059a;

    /* renamed from: b */
    public C63088z f378060b = C63088z.f170246b;

    /* renamed from: c */
    public String f378061c = BuildConfig.FLAVOR;

    static {
        C139012l lVar = new C139012l();
        f378057d = lVar;
        C62942bv.registerDefaultInstance(C139012l.class, lVar);
    }

    private C139012l() {
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
                return newMessageInfo(f378057d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C139012l();
            case 4:
                return new C139011k();
            case 5:
                return f378057d;
            case 6:
                C63010eb ebVar = f378058e;
                if (ebVar == null) {
                    synchronized (C139012l.class) {
                        ebVar = f378058e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378057d);
                            f378058e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
