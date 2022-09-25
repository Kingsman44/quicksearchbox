package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.bj */
/* compiled from: PG */
public final class C50965bj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50965bj f132670e;

    /* renamed from: g */
    private static volatile C63010eb f132671g;

    /* renamed from: a */
    public int f132672a;

    /* renamed from: b */
    public int f132673b = 0;

    /* renamed from: c */
    public Object f132674c;

    /* renamed from: d */
    public int f132675d;

    /* renamed from: f */
    private byte f132676f = 2;

    static {
        C50965bj bjVar = new C50965bj();
        f132670e = bjVar;
        C62942bv.registerDefaultInstance(C50965bj.class, bjVar);
    }

    private C50965bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132676f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132676f = b;
                return null;
            case 2:
                return newMessageInfo(f132670e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C50963bh.f132669a, alf.class, C51141hx.class});
            case 3:
                return new C50965bj();
            case 4:
                return new C50962bg();
            case 5:
                return f132670e;
            case 6:
                C63010eb ebVar = f132671g;
                if (ebVar == null) {
                    synchronized (C50965bj.class) {
                        ebVar = f132671g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132670e);
                            f132671g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
