package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.di */
/* compiled from: PG */
public final class C87781di extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87781di f237556c;

    /* renamed from: d */
    private static volatile C63010eb f237557d;

    /* renamed from: a */
    public int f237558a;

    /* renamed from: b */
    public String f237559b = BuildConfig.FLAVOR;

    static {
        C87781di diVar = new C87781di();
        f237556c = diVar;
        C62942bv.registerDefaultInstance(C87781di.class, diVar);
    }

    private C87781di() {
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
                return newMessageInfo(f237556c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C87781di();
            case 4:
                return new C87780dh();
            case 5:
                return f237556c;
            case 6:
                C63010eb ebVar = f237557d;
                if (ebVar == null) {
                    synchronized (C87781di.class) {
                        ebVar = f237557d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237556c);
                            f237557d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
