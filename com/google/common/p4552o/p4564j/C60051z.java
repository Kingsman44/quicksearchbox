package com.google.common.p4552o.p4564j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.z */
/* compiled from: PG */
public final class C60051z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C60051z f162308c;

    /* renamed from: f */
    private static volatile C63010eb f162309f;

    /* renamed from: a */
    public int f162310a;

    /* renamed from: b */
    public C60045t f162311b;

    /* renamed from: d */
    private C60033h f162312d;

    /* renamed from: e */
    private byte f162313e = 2;

    static {
        C60051z zVar = new C60051z();
        f162308c = zVar;
        C62942bv.registerDefaultInstance(C60051z.class, zVar);
    }

    private C60051z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162313e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162313e = b;
                return null;
            case 2:
                return newMessageInfo(f162308c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "d", "b"});
            case 3:
                return new C60051z();
            case 4:
                return new C60050y();
            case 5:
                return f162308c;
            case 6:
                C63010eb ebVar = f162309f;
                if (ebVar == null) {
                    synchronized (C60051z.class) {
                        ebVar = f162309f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162308c);
                            f162309f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
