package com.google.android.apps.search.googleapp.search.settings.p10424a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.search.settings.a.e */
/* compiled from: PG */
public final class C137565e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C137565e f374176c;

    /* renamed from: d */
    private static volatile C63010eb f374177d;

    /* renamed from: a */
    public int f374178a;

    /* renamed from: b */
    public String f374179b = BuildConfig.FLAVOR;

    static {
        C137565e eVar = new C137565e();
        f374176c = eVar;
        C62942bv.registerDefaultInstance(C137565e.class, eVar);
    }

    private C137565e() {
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
                return newMessageInfo(f374176c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C137565e();
            case 4:
                return new C137564d();
            case 5:
                return f374176c;
            case 6:
                C63010eb ebVar = f374177d;
                if (ebVar == null) {
                    synchronized (C137565e.class) {
                        ebVar = f374177d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f374176c);
                            f374177d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
