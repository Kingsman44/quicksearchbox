package com.google.common.p4552o;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vi */
/* compiled from: PG */
public final class C60585vi extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C60585vi f164348h;

    /* renamed from: i */
    private static volatile C63010eb f164349i;

    /* renamed from: a */
    public int f164350a;

    /* renamed from: b */
    public long f164351b;

    /* renamed from: c */
    public long f164352c;

    /* renamed from: d */
    public long f164353d;

    /* renamed from: e */
    public long f164354e;

    /* renamed from: f */
    public boolean f164355f;

    /* renamed from: g */
    public boolean f164356g;

    static {
        C60585vi viVar = new C60585vi();
        f164348h = viVar;
        C62942bv.registerDefaultInstance(C60585vi.class, viVar);
    }

    private C60585vi() {
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
                return newMessageInfo(f164348h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C60585vi();
            case 4:
                return new C60584vh();
            case 5:
                return f164348h;
            case 6:
                C63010eb ebVar = f164349i;
                if (ebVar == null) {
                    synchronized (C60585vi.class) {
                        ebVar = f164349i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164348h);
                            f164349i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
