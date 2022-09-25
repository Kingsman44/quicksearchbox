package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.r */
/* compiled from: PG */
public final class C8238r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8238r f28914a;

    /* renamed from: g */
    private static volatile C63010eb f28915g;

    /* renamed from: b */
    private int f28916b;

    /* renamed from: c */
    private C8232l f28917c;

    /* renamed from: d */
    private C8232l f28918d;

    /* renamed from: e */
    private C8232l f28919e;

    /* renamed from: f */
    private byte f28920f = 2;

    static {
        C8238r rVar = new C8238r();
        f28914a = rVar;
        C62942bv.registerDefaultInstance(C8238r.class, rVar);
    }

    private C8238r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28920f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28920f = b;
                return null;
            case 2:
                return newMessageInfo(f28914a, "\u0001\u0003\u0000\u0001\u0006\u000b\u0003\u0000\u0000\u0003\u0006ᐉ\u0005\u0007ᐉ\u0006\u000bᐉ\u0007", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C8238r();
            case 4:
                return new C8237q();
            case 5:
                return f28914a;
            case 6:
                C63010eb ebVar = f28915g;
                if (ebVar == null) {
                    synchronized (C8238r.class) {
                        ebVar = f28915g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28914a);
                            f28915g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
