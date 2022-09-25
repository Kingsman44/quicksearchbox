package com.google.common.p4552o.p4566l;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.l.ae */
/* compiled from: PG */
public final class C60113ae extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C60113ae f162565f;

    /* renamed from: h */
    private static volatile C63010eb f162566h;

    /* renamed from: a */
    public int f162567a;

    /* renamed from: b */
    public String f162568b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f162569c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f162570d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f162571e;

    /* renamed from: g */
    private byte f162572g = 2;

    static {
        C60113ae aeVar = new C60113ae();
        f162565f = aeVar;
        C62942bv.registerDefaultInstance(C60113ae.class, aeVar);
    }

    private C60113ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162572g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162572g = b;
                return null;
            case 2:
                return newMessageInfo(f162565f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C60113ae();
            case 4:
                return new C60112ad();
            case 5:
                return f162565f;
            case 6:
                C63010eb ebVar = f162566h;
                if (ebVar == null) {
                    synchronized (C60113ae.class) {
                        ebVar = f162566h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162565f);
                            f162566h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
