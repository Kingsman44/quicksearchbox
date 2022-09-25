package com.google.android.apps.search.googleapp.search.suggest.p10443a.p10445b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.a.b.y */
/* compiled from: PG */
public final class C137965y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C137965y f375352e;

    /* renamed from: f */
    private static volatile C63010eb f375353f;

    /* renamed from: a */
    public int f375354a;

    /* renamed from: b */
    public String f375355b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f375356c;

    /* renamed from: d */
    public long f375357d;

    static {
        C137965y yVar = new C137965y();
        f375352e = yVar;
        C62942bv.registerDefaultInstance(C137965y.class, yVar);
    }

    private C137965y() {
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
                return newMessageInfo(f375352e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C137965y();
            case 4:
                return new C137964x();
            case 5:
                return f375352e;
            case 6:
                C63010eb ebVar = f375353f;
                if (ebVar == null) {
                    synchronized (C137965y.class) {
                        ebVar = f375353f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f375352e);
                            f375353f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
