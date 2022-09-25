package com.google.android.p10712d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.ab */
/* compiled from: PG */
public final class C142296ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C142296ab f386036e;

    /* renamed from: f */
    private static volatile C63010eb f386037f;

    /* renamed from: a */
    public int f386038a;

    /* renamed from: b */
    public int f386039b;

    /* renamed from: c */
    public int f386040c;

    /* renamed from: d */
    public String f386041d = BuildConfig.FLAVOR;

    static {
        C142296ab abVar = new C142296ab();
        f386036e = abVar;
        C62942bv.registerDefaultInstance(C142296ab.class, abVar);
    }

    private C142296ab() {
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
                return newMessageInfo(f386036e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C142296ab();
            case 4:
                return new C142295aa();
            case 5:
                return f386036e;
            case 6:
                C63010eb ebVar = f386037f;
                if (ebVar == null) {
                    synchronized (C142296ab.class) {
                        ebVar = f386037f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386036e);
                            f386037f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
