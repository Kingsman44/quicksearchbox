package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.gd */
/* compiled from: PG */
public final class C55108gd extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55108gd f145008d;

    /* renamed from: e */
    private static volatile C63010eb f145009e;

    /* renamed from: a */
    public int f145010a;

    /* renamed from: b */
    public C55110gf f145011b;

    /* renamed from: c */
    public String f145012c = BuildConfig.FLAVOR;

    static {
        C55108gd gdVar = new C55108gd();
        f145008d = gdVar;
        C62942bv.registerDefaultInstance(C55108gd.class, gdVar);
    }

    private C55108gd() {
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
                return newMessageInfo(f145008d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C55108gd();
            case 4:
                return new C55107gc();
            case 5:
                return f145008d;
            case 6:
                C63010eb ebVar = f145009e;
                if (ebVar == null) {
                    synchronized (C55108gd.class) {
                        ebVar = f145009e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145008d);
                            f145009e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
