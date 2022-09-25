package com.google.android.apps.search.googleapp.googleappbrowser;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.bp */
/* compiled from: PG */
public final class C135523bp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135523bp f369179c;

    /* renamed from: d */
    private static volatile C63010eb f369180d;

    /* renamed from: a */
    public int f369181a;

    /* renamed from: b */
    public String f369182b = BuildConfig.FLAVOR;

    static {
        C135523bp bpVar = new C135523bp();
        f369179c = bpVar;
        C62942bv.registerDefaultInstance(C135523bp.class, bpVar);
    }

    private C135523bp() {
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
                return newMessageInfo(f369179c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C135523bp();
            case 4:
                return new C135522bo();
            case 5:
                return f369179c;
            case 6:
                C63010eb ebVar = f369180d;
                if (ebVar == null) {
                    synchronized (C135523bp.class) {
                        ebVar = f369180d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369179c);
                            f369180d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
