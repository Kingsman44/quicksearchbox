package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.cp */
/* compiled from: PG */
public final class C124677cp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C124677cp f343952c;

    /* renamed from: d */
    private static volatile C63010eb f343953d;

    /* renamed from: a */
    public int f343954a;

    /* renamed from: b */
    public String f343955b = BuildConfig.FLAVOR;

    static {
        C124677cp cpVar = new C124677cp();
        f343952c = cpVar;
        C62942bv.registerDefaultInstance(C124677cp.class, cpVar);
    }

    private C124677cp() {
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
                return newMessageInfo(f343952c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C124677cp();
            case 4:
                return new C124676co();
            case 5:
                return f343952c;
            case 6:
                C63010eb ebVar = f343953d;
                if (ebVar == null) {
                    synchronized (C124677cp.class) {
                        ebVar = f343953d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343952c);
                            f343953d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
