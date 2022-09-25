package com.google.android.apps.gsa.assistant.settings.features.appactions.p567c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.c.e */
/* compiled from: PG */
public final class C10260e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C10260e f34780c;

    /* renamed from: d */
    private static volatile C63010eb f34781d;

    /* renamed from: a */
    public int f34782a;

    /* renamed from: b */
    public String f34783b = BuildConfig.FLAVOR;

    static {
        C10260e eVar = new C10260e();
        f34780c = eVar;
        C62942bv.registerDefaultInstance(C10260e.class, eVar);
    }

    private C10260e() {
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
                return newMessageInfo(f34780c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C10260e();
            case 4:
                return new C10259d();
            case 5:
                return f34780c;
            case 6:
                C63010eb ebVar = f34781d;
                if (ebVar == null) {
                    synchronized (C10260e.class) {
                        ebVar = f34781d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f34780c);
                            f34781d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
