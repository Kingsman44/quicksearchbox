package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ai */
/* compiled from: PG */
public final class C62405ai extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62405ai f168456f;

    /* renamed from: g */
    private static volatile C63010eb f168457g;

    /* renamed from: a */
    public int f168458a;

    /* renamed from: b */
    public int f168459b;

    /* renamed from: c */
    public int f168460c;

    /* renamed from: d */
    public int f168461d;

    /* renamed from: e */
    public int f168462e;

    static {
        C62405ai aiVar = new C62405ai();
        f168456f = aiVar;
        C62942bv.registerDefaultInstance(C62405ai.class, aiVar);
    }

    private C62405ai() {
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
                return newMessageInfo(f168456f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C62404ah.f168455a});
            case 3:
                return new C62405ai();
            case 4:
                return new C62403ag();
            case 5:
                return f168456f;
            case 6:
                C63010eb ebVar = f168457g;
                if (ebVar == null) {
                    synchronized (C62405ai.class) {
                        ebVar = f168457g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168456f);
                            f168457g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
