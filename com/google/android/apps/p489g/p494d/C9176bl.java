package com.google.android.apps.p489g.p494d;

import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.bl */
/* compiled from: PG */
public final class C9176bl extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9176bl f31692c;

    /* renamed from: e */
    private static volatile C63010eb f31693e;

    /* renamed from: a */
    public int f31694a;

    /* renamed from: b */
    public C7799kj f31695b;

    /* renamed from: d */
    private byte f31696d = 2;

    static {
        C9176bl blVar = new C9176bl();
        f31692c = blVar;
        C62942bv.registerDefaultInstance(C9176bl.class, blVar);
    }

    private C9176bl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31696d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31696d = b;
                return null;
            case 2:
                return newMessageInfo(f31692c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9176bl();
            case 4:
                return new C9175bk();
            case 5:
                return f31692c;
            case 6:
                C63010eb ebVar = f31693e;
                if (ebVar == null) {
                    synchronized (C9176bl.class) {
                        ebVar = f31693e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31692c);
                            f31693e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
