package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.ah */
/* compiled from: PG */
public final class C48592ah extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48592ah f125595b;

    /* renamed from: c */
    private static volatile C63010eb f125596c;

    /* renamed from: a */
    public String f125597a = BuildConfig.FLAVOR;

    static {
        C48592ah ahVar = new C48592ah();
        f125595b = ahVar;
        C62942bv.registerDefaultInstance(C48592ah.class, ahVar);
    }

    private C48592ah() {
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
                return newMessageInfo(f125595b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new C48592ah();
            case 4:
                return new C48591ag();
            case 5:
                return f125595b;
            case 6:
                C63010eb ebVar = f125596c;
                if (ebVar == null) {
                    synchronized (C48592ah.class) {
                        ebVar = f125596c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125595b);
                            f125596c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
