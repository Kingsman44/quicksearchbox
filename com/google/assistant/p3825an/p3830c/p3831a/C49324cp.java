package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cp */
/* compiled from: PG */
public final class C49324cp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49324cp f127477d;

    /* renamed from: e */
    private static volatile C63010eb f127478e;

    /* renamed from: a */
    public int f127479a = 0;

    /* renamed from: b */
    public Object f127480b;

    /* renamed from: c */
    public String f127481c = BuildConfig.FLAVOR;

    static {
        C49324cp cpVar = new C49324cp();
        f127477d = cpVar;
        C62942bv.registerDefaultInstance(C49324cp.class, cpVar);
    }

    private C49324cp() {
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
                return newMessageInfo(f127477d, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003=\u0000", new Object[]{"b", "a", C45240c.f118157a});
            case 3:
                return new C49324cp();
            case 4:
                return new C49323co();
            case 5:
                return f127477d;
            case 6:
                C63010eb ebVar = f127478e;
                if (ebVar == null) {
                    synchronized (C49324cp.class) {
                        ebVar = f127478e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127477d);
                            f127478e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
