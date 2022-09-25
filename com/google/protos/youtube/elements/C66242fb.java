package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.youtube.elements.fb */
/* compiled from: PG */
public final class C66242fb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66242fb f180124e;

    /* renamed from: g */
    private static volatile C63010eb f180125g;

    /* renamed from: a */
    public int f180126a;

    /* renamed from: b */
    public C63088z f180127b = C63088z.f170246b;

    /* renamed from: c */
    public SenderStateOuterClass$SenderState f180128c;

    /* renamed from: d */
    public C66239ez f180129d;

    /* renamed from: f */
    private byte f180130f = 2;

    static {
        C66242fb fbVar = new C66242fb();
        f180124e = fbVar;
        C62942bv.registerDefaultInstance(C66242fb.class, fbVar);
    }

    private C66242fb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180130f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180130f = b;
                return null;
            case 2:
                return newMessageInfo(f180124e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ည\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C66242fb();
            case 4:
                return new C66241fa();
            case 5:
                return f180124e;
            case 6:
                C63010eb ebVar = f180125g;
                if (ebVar == null) {
                    synchronized (C66242fb.class) {
                        ebVar = f180125g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180124e);
                            f180125g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
