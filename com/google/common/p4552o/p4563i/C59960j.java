package com.google.common.p4552o.p4563i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.j */
/* compiled from: PG */
public final class C59960j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59960j f162046f;

    /* renamed from: g */
    private static volatile C63010eb f162047g;

    /* renamed from: a */
    public int f162048a;

    /* renamed from: b */
    public String f162049b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f162050c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public boolean f162051d;

    /* renamed from: e */
    public boolean f162052e;

    static {
        C59960j jVar = new C59960j();
        f162046f = jVar;
        C62942bv.registerDefaultInstance(C59960j.class, jVar);
    }

    private C59960j() {
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
                return newMessageInfo(f162046f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C59960j();
            case 4:
                return new C59959i();
            case 5:
                return f162046f;
            case 6:
                C63010eb ebVar = f162047g;
                if (ebVar == null) {
                    synchronized (C59960j.class) {
                        ebVar = f162047g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162046f);
                            f162047g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
