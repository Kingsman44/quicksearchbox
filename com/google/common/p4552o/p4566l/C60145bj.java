package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.bj */
/* compiled from: PG */
public final class C60145bj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60145bj f162698f;

    /* renamed from: g */
    private static volatile C63010eb f162699g;

    /* renamed from: a */
    public int f162700a;

    /* renamed from: b */
    public int f162701b;

    /* renamed from: c */
    public String f162702c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f162703d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f162704e = BuildConfig.FLAVOR;

    static {
        C60145bj bjVar = new C60145bj();
        f162698f = bjVar;
        C62942bv.registerDefaultInstance(C60145bj.class, bjVar);
    }

    private C60145bj() {
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
                return newMessageInfo(f162698f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0001", new Object[]{"a", "b", C60183cu.f162811a, "d", "e", C45240c.f118157a});
            case 3:
                return new C60145bj();
            case 4:
                return new C60144bi();
            case 5:
                return f162698f;
            case 6:
                C63010eb ebVar = f162699g;
                if (ebVar == null) {
                    synchronized (C60145bj.class) {
                        ebVar = f162699g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162698f);
                            f162699g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
