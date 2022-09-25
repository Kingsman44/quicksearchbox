package com.google.p4017at.p4018a.p4019a.p4020a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.x */
/* compiled from: PG */
public final class C53813x extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53813x f141233c;

    /* renamed from: d */
    private static volatile C63010eb f141234d;

    /* renamed from: a */
    public int f141235a;

    /* renamed from: b */
    public String f141236b = BuildConfig.FLAVOR;

    static {
        C53813x xVar = new C53813x();
        f141233c = xVar;
        C62942bv.registerDefaultInstance(C53813x.class, xVar);
    }

    private C53813x() {
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
                return newMessageInfo(f141233c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53813x();
            case 4:
                return new C53812w();
            case 5:
                return f141233c;
            case 6:
                C63010eb ebVar = f141234d;
                if (ebVar == null) {
                    synchronized (C53813x.class) {
                        ebVar = f141234d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141233c);
                            f141234d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
