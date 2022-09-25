package com.google.android.libraries.search.p3055n;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.ax */
/* compiled from: PG */
public final class C39274ax extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C39274ax f103452c;

    /* renamed from: d */
    private static volatile C63010eb f103453d;

    /* renamed from: a */
    public int f103454a;

    /* renamed from: b */
    public String f103455b = BuildConfig.FLAVOR;

    static {
        C39274ax axVar = new C39274ax();
        f103452c = axVar;
        C62942bv.registerDefaultInstance(C39274ax.class, axVar);
    }

    private C39274ax() {
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
                return newMessageInfo(f103452c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C39274ax();
            case 4:
                return new C39273aw();
            case 5:
                return f103452c;
            case 6:
                C63010eb ebVar = f103453d;
                if (ebVar == null) {
                    synchronized (C39274ax.class) {
                        ebVar = f103453d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103452c);
                            f103453d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
