package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.n */
/* compiled from: PG */
public final class C105964n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C105964n f295849c;

    /* renamed from: d */
    private static volatile C63010eb f295850d;

    /* renamed from: a */
    public int f295851a;

    /* renamed from: b */
    public String f295852b = BuildConfig.FLAVOR;

    static {
        C105964n nVar = new C105964n();
        f295849c = nVar;
        C62942bv.registerDefaultInstance(C105964n.class, nVar);
    }

    private C105964n() {
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
                return newMessageInfo(f295849c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C105964n();
            case 4:
                return new C105963m();
            case 5:
                return f295849c;
            case 6:
                C63010eb ebVar = f295850d;
                if (ebVar == null) {
                    synchronized (C105964n.class) {
                        ebVar = f295850d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295849c);
                            f295850d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
