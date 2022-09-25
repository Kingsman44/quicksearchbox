package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.ad */
/* compiled from: PG */
public final class C48043ad extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C48043ad f124359e;

    /* renamed from: f */
    private static volatile C63010eb f124360f;

    /* renamed from: a */
    public String f124361a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f124362b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f124363c;

    /* renamed from: d */
    public C48066b f124364d;

    static {
        C48043ad adVar = new C48043ad();
        f124359e = adVar;
        C62942bv.registerDefaultInstance(C48043ad.class, adVar);
    }

    private C48043ad() {
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
                return newMessageInfo(f124359e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C48043ad();
            case 4:
                return new C48042ac();
            case 5:
                return f124359e;
            case 6:
                C63010eb ebVar = f124360f;
                if (ebVar == null) {
                    synchronized (C48043ad.class) {
                        ebVar = f124360f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124359e);
                            f124360f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
