package com.google.p4160bf.p4164b.p4165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bf.b.a.bv */
/* compiled from: PG */
public final class C55639bv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55639bv f146800d;

    /* renamed from: e */
    private static volatile C63010eb f146801e;

    /* renamed from: a */
    public int f146802a;

    /* renamed from: b */
    public long f146803b;

    /* renamed from: c */
    public String f146804c = BuildConfig.FLAVOR;

    static {
        C55639bv bvVar = new C55639bv();
        f146800d = bvVar;
        C62942bv.registerDefaultInstance(C55639bv.class, bvVar);
    }

    private C55639bv() {
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
                return newMessageInfo(f146800d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55639bv();
            case 4:
                return new C55638bu();
            case 5:
                return f146800d;
            case 6:
                C63010eb ebVar = f146801e;
                if (ebVar == null) {
                    synchronized (C55639bv.class) {
                        ebVar = f146801e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146800d);
                            f146801e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
