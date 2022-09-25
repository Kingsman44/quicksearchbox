package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ul */
/* compiled from: PG */
public final class C60561ul extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60561ul f164283d;

    /* renamed from: f */
    private static volatile C63010eb f164284f;

    /* renamed from: a */
    public int f164285a;

    /* renamed from: b */
    public String f164286b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f164287c = C62942bv.emptyProtobufList();

    /* renamed from: e */
    private byte f164288e = 2;

    static {
        C60561ul ulVar = new C60561ul();
        f164283d = ulVar;
        C62942bv.registerDefaultInstance(C60561ul.class, ulVar);
    }

    private C60561ul() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f164288e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f164288e = b;
                return null;
            case 2:
                return newMessageInfo(f164283d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ᔈ\u0000\u0002\u001a", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60561ul();
            case 4:
                return new C60560uk();
            case 5:
                return f164283d;
            case 6:
                C63010eb ebVar = f164284f;
                if (ebVar == null) {
                    synchronized (C60561ul.class) {
                        ebVar = f164284f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164283d);
                            f164284f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
