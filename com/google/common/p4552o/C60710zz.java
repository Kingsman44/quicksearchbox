package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.zz */
/* compiled from: PG */
public final class C60710zz extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60710zz f164718e;

    /* renamed from: f */
    private static volatile C63010eb f164719f;

    /* renamed from: a */
    public int f164720a;

    /* renamed from: b */
    public int f164721b;

    /* renamed from: c */
    public int f164722c;

    /* renamed from: d */
    public int f164723d;

    static {
        C60710zz zzVar = new C60710zz();
        f164718e = zzVar;
        C62942bv.registerDefaultInstance(C60710zz.class, zzVar);
    }

    private C60710zz() {
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
                return newMessageInfo(f164718e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60710zz();
            case 4:
                return new C60709zy();
            case 5:
                return f164718e;
            case 6:
                C63010eb ebVar = f164719f;
                if (ebVar == null) {
                    synchronized (C60710zz.class) {
                        ebVar = f164719f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164718e);
                            f164719f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
