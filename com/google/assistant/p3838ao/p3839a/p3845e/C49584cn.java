package com.google.assistant.p3838ao.p3839a.p3845e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ao.a.e.cn */
/* compiled from: PG */
public final class C49584cn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49584cn f127941c;

    /* renamed from: e */
    private static volatile C63010eb f127942e;

    /* renamed from: a */
    public int f127943a = 0;

    /* renamed from: b */
    public Object f127944b;

    /* renamed from: d */
    private byte f127945d = 2;

    static {
        C49584cn cnVar = new C49584cn();
        f127941c = cnVar;
        C62942bv.registerDefaultInstance(C49584cn.class, cnVar);
    }

    private C49584cn() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127945d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127945d = b;
                return null;
            case 2:
                return newMessageInfo(f127941c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ျ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C49585co.class, C49520ad.class});
            case 3:
                return new C49584cn();
            case 4:
                return new C49583cm();
            case 5:
                return f127941c;
            case 6:
                C63010eb ebVar = f127942e;
                if (ebVar == null) {
                    synchronized (C49584cn.class) {
                        ebVar = f127942e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127941c);
                            f127942e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
