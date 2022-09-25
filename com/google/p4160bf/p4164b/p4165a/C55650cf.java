package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.cf */
/* compiled from: PG */
public final class C55650cf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55650cf f146820d;

    /* renamed from: e */
    private static volatile C63010eb f146821e;

    /* renamed from: a */
    public int f146822a;

    /* renamed from: b */
    public String f146823b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f146824c;

    static {
        C55650cf cfVar = new C55650cf();
        f146820d = cfVar;
        C62942bv.registerDefaultInstance(C55650cf.class, cfVar);
    }

    private C55650cf() {
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
                return newMessageInfo(f146820d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C55649ce.f146819a});
            case 3:
                return new C55650cf();
            case 4:
                return new C55648cd();
            case 5:
                return f146820d;
            case 6:
                C63010eb ebVar = f146821e;
                if (ebVar == null) {
                    synchronized (C55650cf.class) {
                        ebVar = f146821e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146820d);
                            f146821e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
