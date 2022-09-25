package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.w */
/* compiled from: PG */
public final class C41697w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C41697w f109068c;

    /* renamed from: d */
    private static volatile C63010eb f109069d;

    /* renamed from: a */
    public int f109070a;

    /* renamed from: b */
    public String f109071b = BuildConfig.FLAVOR;

    static {
        C41697w wVar = new C41697w();
        f109068c = wVar;
        C62942bv.registerDefaultInstance(C41697w.class, wVar);
    }

    private C41697w() {
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
                return newMessageInfo(f109068c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C41697w();
            case 4:
                return new C41696v();
            case 5:
                return f109068c;
            case 6:
                C63010eb ebVar = f109069d;
                if (ebVar == null) {
                    synchronized (C41697w.class) {
                        ebVar = f109069d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f109068c);
                            f109069d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
