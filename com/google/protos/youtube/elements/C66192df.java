package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.df */
/* compiled from: PG */
public final class C66192df extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66192df f179996e;

    /* renamed from: g */
    private static volatile C63010eb f179997g;

    /* renamed from: a */
    public int f179998a;

    /* renamed from: b */
    public C66198dl f179999b;

    /* renamed from: c */
    public int f180000c;

    /* renamed from: d */
    public int f180001d;

    /* renamed from: f */
    private byte f180002f = 2;

    static {
        C66192df dfVar = new C66192df();
        f179996e = dfVar;
        C62942bv.registerDefaultInstance(C66192df.class, dfVar);
    }

    private C66192df() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180002f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180002f = b;
                return null;
            case 2:
                return newMessageInfo(f179996e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66192df();
            case 4:
                return new C66191de();
            case 5:
                return f179996e;
            case 6:
                C63010eb ebVar = f179997g;
                if (ebVar == null) {
                    synchronized (C66192df.class) {
                        ebVar = f179997g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179996e);
                            f179997g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
