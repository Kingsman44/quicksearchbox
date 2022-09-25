package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.n */
/* compiled from: PG */
public final class C10269n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C10269n f34808d;

    /* renamed from: e */
    private static volatile C63010eb f34809e;

    /* renamed from: a */
    public int f34810a;

    /* renamed from: b */
    public String f34811b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C10279x f34812c;

    static {
        C10269n nVar = new C10269n();
        f34808d = nVar;
        C62942bv.registerDefaultInstance(C10269n.class, nVar);
    }

    private C10269n() {
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
                return newMessageInfo(f34808d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C10269n();
            case 4:
                return new C10268m();
            case 5:
                return f34808d;
            case 6:
                C63010eb ebVar = f34809e;
                if (ebVar == null) {
                    synchronized (C10269n.class) {
                        ebVar = f34809e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34808d);
                            f34809e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
