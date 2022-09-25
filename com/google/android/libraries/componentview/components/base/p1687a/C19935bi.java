package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.bi */
/* compiled from: PG */
public final class C19935bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C19935bi f55786c;

    /* renamed from: e */
    private static volatile C63010eb f55787e;

    /* renamed from: a */
    public float f55788a;

    /* renamed from: b */
    public float f55789b;

    /* renamed from: d */
    private int f55790d;

    static {
        C19935bi biVar = new C19935bi();
        f55786c = biVar;
        C62942bv.registerDefaultInstance(C19935bi.class, biVar);
    }

    private C19935bi() {
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
                return newMessageInfo(f55786c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C19935bi();
            case 4:
                return new C19934bh();
            case 5:
                return f55786c;
            case 6:
                C63010eb ebVar = f55787e;
                if (ebVar == null) {
                    synchronized (C19935bi.class) {
                        ebVar = f55787e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55786c);
                            f55787e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
