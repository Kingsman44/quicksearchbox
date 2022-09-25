package com.google.android.libraries.social.populous.p3289c.p3293d;

import com.google.p4181bi.C55844f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.social.populous.c.d.g */
/* compiled from: PG */
public final class C42239g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C42239g f110582c;

    /* renamed from: e */
    private static volatile C63010eb f110583e;

    /* renamed from: a */
    public C55844f f110584a;

    /* renamed from: b */
    public C42237e f110585b;

    /* renamed from: d */
    private byte f110586d = 2;

    static {
        C42239g gVar = new C42239g();
        f110582c = gVar;
        C62942bv.registerDefaultInstance(C42239g.class, gVar);
    }

    private C42239g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f110586d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f110586d = b;
                return null;
            case 2:
                return newMessageInfo(f110582c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C42239g();
            case 4:
                return new C42238f();
            case 5:
                return f110582c;
            case 6:
                C63010eb ebVar = f110583e;
                if (ebVar == null) {
                    synchronized (C42239g.class) {
                        ebVar = f110583e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f110582c);
                            f110583e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
