package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.ad */
/* compiled from: PG */
public final class C121550ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C121550ad f337292b;

    /* renamed from: c */
    private static volatile C63010eb f337293c;

    /* renamed from: a */
    public String f337294a = BuildConfig.FLAVOR;

    static {
        C121550ad adVar = new C121550ad();
        f337292b = adVar;
        C62942bv.registerDefaultInstance(C121550ad.class, adVar);
    }

    private C121550ad() {
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
                return newMessageInfo(f337292b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C121550ad();
            case 4:
                return new C121549ac();
            case 5:
                return f337292b;
            case 6:
                C63010eb ebVar = f337293c;
                if (ebVar == null) {
                    synchronized (C121550ad.class) {
                        ebVar = f337293c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f337292b);
                            f337293c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
