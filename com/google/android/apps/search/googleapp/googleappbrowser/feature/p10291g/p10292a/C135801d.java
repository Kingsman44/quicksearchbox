package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.d */
/* compiled from: PG */
public final class C135801d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135801d f369895c;

    /* renamed from: d */
    private static volatile C63010eb f369896d;

    /* renamed from: a */
    public int f369897a;

    /* renamed from: b */
    public String f369898b = BuildConfig.FLAVOR;

    static {
        C135801d dVar = new C135801d();
        f369895c = dVar;
        C62942bv.registerDefaultInstance(C135801d.class, dVar);
    }

    private C135801d() {
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
                return newMessageInfo(f369895c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C135801d();
            case 4:
                return new C135800c();
            case 5:
                return f369895c;
            case 6:
                C63010eb ebVar = f369896d;
                if (ebVar == null) {
                    synchronized (C135801d.class) {
                        ebVar = f369896d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369895c);
                            f369896d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
