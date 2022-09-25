package com.google.p4160bf.p4164b.p4165a.p4166a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.a.u */
/* compiled from: PG */
public final class C55585u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55585u f146652d;

    /* renamed from: f */
    private static volatile C63010eb f146653f;

    /* renamed from: a */
    public boolean f146654a;

    /* renamed from: b */
    public String f146655b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f146656c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f146657e;

    static {
        C55585u uVar = new C55585u();
        f146652d = uVar;
        C62942bv.registerDefaultInstance(C55585u.class, uVar);
    }

    private C55585u() {
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
                return newMessageInfo(f146652d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C55585u();
            case 4:
                return new C55584t();
            case 5:
                return f146652d;
            case 6:
                C63010eb ebVar = f146653f;
                if (ebVar == null) {
                    synchronized (C55585u.class) {
                        ebVar = f146653f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146652d);
                            f146653f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
