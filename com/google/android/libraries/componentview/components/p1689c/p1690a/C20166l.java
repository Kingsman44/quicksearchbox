package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.c.a.l */
/* compiled from: PG */
public final class C20166l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C20166l f56569c;

    /* renamed from: d */
    private static volatile C63010eb f56570d;

    /* renamed from: a */
    public int f56571a;

    /* renamed from: b */
    public String f56572b = BuildConfig.FLAVOR;

    static {
        C20166l lVar = new C20166l();
        f56569c = lVar;
        C62942bv.registerDefaultInstance(C20166l.class, lVar);
    }

    private C20166l() {
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
                return newMessageInfo(f56569c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C20166l();
            case 4:
                return new C20165k();
            case 5:
                return f56569c;
            case 6:
                C63010eb ebVar = f56570d;
                if (ebVar == null) {
                    synchronized (C20166l.class) {
                        ebVar = f56570d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56569c);
                            f56570d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
