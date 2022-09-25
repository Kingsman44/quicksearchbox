package com.google.lens.p4705i.p4706a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.ab */
/* compiled from: PG */
public final class C62370ab extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62370ab f168371f;

    /* renamed from: g */
    private static volatile C63010eb f168372g;

    /* renamed from: a */
    public int f168373a;

    /* renamed from: b */
    public String f168374b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f168375c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f168376d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f168377e = BuildConfig.FLAVOR;

    static {
        C62370ab abVar = new C62370ab();
        f168371f = abVar;
        C62942bv.registerDefaultInstance(C62370ab.class, abVar);
    }

    private C62370ab() {
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
                return newMessageInfo(f168371f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C62370ab();
            case 4:
                return new C62369aa();
            case 5:
                return f168371f;
            case 6:
                C63010eb ebVar = f168372g;
                if (ebVar == null) {
                    synchronized (C62370ab.class) {
                        ebVar = f168372g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168371f);
                            f168372g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
