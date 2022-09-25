package com.google.lens.p4701g;

import com.google.p4172bg.p4174b.C55721j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.g.ax */
/* compiled from: PG */
public final class C62274ax extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62274ax f168126b;

    /* renamed from: d */
    private static volatile C63010eb f168127d;

    /* renamed from: a */
    public C62971cq f168128a = emptyProtobufList();

    /* renamed from: c */
    private byte f168129c = 2;

    static {
        C62274ax axVar = new C62274ax();
        f168126b = axVar;
        C62942bv.registerDefaultInstance(C62274ax.class, axVar);
    }

    private C62274ax() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168129c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168129c = b;
                return null;
            case 2:
                return newMessageInfo(f168126b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C55721j.class});
            case 3:
                return new C62274ax();
            case 4:
                return new C62273aw();
            case 5:
                return f168126b;
            case 6:
                C63010eb ebVar = f168127d;
                if (ebVar == null) {
                    synchronized (C62274ax.class) {
                        ebVar = f168127d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168126b);
                            f168127d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
