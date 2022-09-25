package com.google.lens.p4701g;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.bz */
/* compiled from: PG */
public final class C62303bz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62303bz f168191d;

    /* renamed from: e */
    private static volatile C63010eb f168192e;

    /* renamed from: a */
    public int f168193a;

    /* renamed from: b */
    public String f168194b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f168195c;

    static {
        C62303bz bzVar = new C62303bz();
        f168191d = bzVar;
        C62942bv.registerDefaultInstance(C62303bz.class, bzVar);
    }

    private C62303bz() {
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
                return newMessageInfo(f168191d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62303bz();
            case 4:
                return new C62302by();
            case 5:
                return f168191d;
            case 6:
                C63010eb ebVar = f168192e;
                if (ebVar == null) {
                    synchronized (C62303bz.class) {
                        ebVar = f168192e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168191d);
                            f168192e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
