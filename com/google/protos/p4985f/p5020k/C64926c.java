package com.google.protos.p4985f.p5020k;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.c */
/* compiled from: PG */
public final class C64926c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64926c f175849a;

    /* renamed from: g */
    private static volatile C63010eb f175850g;

    /* renamed from: b */
    private int f175851b;

    /* renamed from: c */
    private C64939p f175852c;

    /* renamed from: d */
    private C62995dn f175853d = C62995dn.f170057a;

    /* renamed from: e */
    private C64941r f175854e;

    /* renamed from: f */
    private byte f175855f = 2;

    static {
        C64926c cVar = new C64926c();
        f175849a = cVar;
        C62942bv.registerDefaultInstance(C64926c.class, cVar);
    }

    private C64926c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175855f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175855f = b;
                return null;
            case 2:
                return newMessageInfo(f175849a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0001\u0000\u0001\u0001ᐉ\u0000\u00042\u0005ဉ\u0003", new Object[]{"b", C45240c.f118157a, "d", C64925b.f175848a, "e"});
            case 3:
                return new C64926c();
            case 4:
                return new C64898a();
            case 5:
                return f175849a;
            case 6:
                C63010eb ebVar = f175850g;
                if (ebVar == null) {
                    synchronized (C64926c.class) {
                        ebVar = f175850g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175849a);
                            f175850g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
