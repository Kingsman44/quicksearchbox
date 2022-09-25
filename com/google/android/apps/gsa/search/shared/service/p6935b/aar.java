package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.aar */
/* compiled from: PG */
public final class aar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aar f237098d;

    /* renamed from: e */
    private static volatile C63010eb f237099e;

    /* renamed from: a */
    public int f237100a;

    /* renamed from: b */
    public String f237101b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237102c = BuildConfig.FLAVOR;

    static {
        aar aar = new aar();
        f237098d = aar;
        C62942bv.registerDefaultInstance(aar.class, aar);
    }

    private aar() {
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
                return newMessageInfo(f237098d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aar();
            case 4:
                return new aaq();
            case 5:
                return f237098d;
            case 6:
                C63010eb ebVar = f237099e;
                if (ebVar == null) {
                    synchronized (aar.class) {
                        ebVar = f237099e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237098d);
                            f237099e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
