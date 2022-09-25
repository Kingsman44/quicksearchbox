package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.h */
/* compiled from: PG */
public final class C60033h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60033h f162265a;

    /* renamed from: f */
    private static volatile C63010eb f162266f;

    /* renamed from: b */
    private int f162267b;

    /* renamed from: c */
    private C60031f f162268c;

    /* renamed from: d */
    private C60031f f162269d;

    /* renamed from: e */
    private byte f162270e = 2;

    static {
        C60033h hVar = new C60033h();
        f162265a = hVar;
        C62942bv.registerDefaultInstance(C60033h.class, hVar);
    }

    private C60033h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162270e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162270e = b;
                return null;
            case 2:
                return newMessageInfo(f162265a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C60033h();
            case 4:
                return new C60032g();
            case 5:
                return f162265a;
            case 6:
                C63010eb ebVar = f162266f;
                if (ebVar == null) {
                    synchronized (C60033h.class) {
                        ebVar = f162266f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162265a);
                            f162266f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
