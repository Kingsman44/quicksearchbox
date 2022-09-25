package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dc */
/* compiled from: PG */
public final class C9221dc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9221dc f31871c;

    /* renamed from: d */
    private static volatile C63010eb f31872d;

    /* renamed from: a */
    public int f31873a;

    /* renamed from: b */
    public String f31874b = BuildConfig.FLAVOR;

    static {
        C9221dc dcVar = new C9221dc();
        f31871c = dcVar;
        C62942bv.registerDefaultInstance(C9221dc.class, dcVar);
    }

    private C9221dc() {
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
                return newMessageInfo(f31871c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9221dc();
            case 4:
                return new C9220db();
            case 5:
                return f31871c;
            case 6:
                C63010eb ebVar = f31872d;
                if (ebVar == null) {
                    synchronized (C9221dc.class) {
                        ebVar = f31872d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31871c);
                            f31872d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
