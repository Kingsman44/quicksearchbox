package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vk */
/* compiled from: PG */
public final class C60587vk extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60587vk f164357e;

    /* renamed from: f */
    private static volatile C63010eb f164358f;

    /* renamed from: a */
    public int f164359a;

    /* renamed from: b */
    public int f164360b;

    /* renamed from: c */
    public int f164361c;

    /* renamed from: d */
    public int f164362d;

    static {
        C60587vk vkVar = new C60587vk();
        f164357e = vkVar;
        C62942bv.registerDefaultInstance(C60587vk.class, vkVar);
    }

    private C60587vk() {
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
                return newMessageInfo(f164357e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C60587vk();
            case 4:
                return new C60586vj();
            case 5:
                return f164357e;
            case 6:
                C63010eb ebVar = f164358f;
                if (ebVar == null) {
                    synchronized (C60587vk.class) {
                        ebVar = f164358f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164357e);
                            f164358f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
