package com.google.p4017at.p4060h.p4061a.p4062a.p4067e;

import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.h.a.a.e.b */
/* compiled from: PG */
public final class C54177b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54177b f142184c;

    /* renamed from: f */
    private static volatile C63010eb f142185f;

    /* renamed from: a */
    public int f142186a;

    /* renamed from: b */
    public C63088z f142187b = C63088z.f170246b;

    /* renamed from: d */
    private C54128b f142188d;

    /* renamed from: e */
    private byte f142189e = 2;

    static {
        C54177b bVar = new C54177b();
        f142184c = bVar;
        C62942bv.registerDefaultInstance(C54177b.class, bVar);
    }

    private C54177b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142189e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142189e = b;
                return null;
            case 2:
                return newMessageInfo(f142184c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C54177b();
            case 4:
                return new C54176a();
            case 5:
                return f142184c;
            case 6:
                C63010eb ebVar = f142185f;
                if (ebVar == null) {
                    synchronized (C54177b.class) {
                        ebVar = f142185f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142184c);
                            f142185f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
