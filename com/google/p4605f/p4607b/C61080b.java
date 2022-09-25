package com.google.p4605f.p4607b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.f.b.b */
/* compiled from: PG */
public final class C61080b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61080b f165362a;

    /* renamed from: f */
    private static volatile C63010eb f165363f;

    /* renamed from: b */
    private int f165364b;

    /* renamed from: c */
    private C61752n f165365c;

    /* renamed from: d */
    private C61752n f165366d;

    /* renamed from: e */
    private byte f165367e = 2;

    static {
        C61080b bVar = new C61080b();
        f165362a = bVar;
        C62942bv.registerDefaultInstance(C61080b.class, bVar);
    }

    private C61080b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f165367e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f165367e = b;
                return null;
            case 2:
                return newMessageInfo(f165362a, "\u0001\u0002\u0000\u0001\u0005\n\u0002\u0000\u0000\u0002\u0005ᐉ\u0003\nᐉ\u0005", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C61080b();
            case 4:
                return new C61079a();
            case 5:
                return f165362a;
            case 6:
                C63010eb ebVar = f165363f;
                if (ebVar == null) {
                    synchronized (C61080b.class) {
                        ebVar = f165363f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165362a);
                            f165363f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
