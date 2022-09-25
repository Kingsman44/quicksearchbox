package com.google.android.apps.gsa.opaonboarding.p6462d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.d.o */
/* compiled from: PG */
public final class C83928o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C83928o f228580d;

    /* renamed from: e */
    private static volatile C63010eb f228581e;

    /* renamed from: a */
    public int f228582a;

    /* renamed from: b */
    public String f228583b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f228584c;

    static {
        C83928o oVar = new C83928o();
        f228580d = oVar;
        C62942bv.registerDefaultInstance(C83928o.class, oVar);
    }

    private C83928o() {
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
                return newMessageInfo(f228580d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C83930q.f228588a});
            case 3:
                return new C83928o();
            case 4:
                return new C83927n();
            case 5:
                return f228580d;
            case 6:
                C63010eb ebVar = f228581e;
                if (ebVar == null) {
                    synchronized (C83928o.class) {
                        ebVar = f228581e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228580d);
                            f228581e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
