package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.u */
/* compiled from: PG */
public final class C53612u extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53612u f140716a;

    /* renamed from: e */
    private static volatile C63010eb f140717e;

    /* renamed from: b */
    private int f140718b;

    /* renamed from: c */
    private C53548ah f140719c;

    /* renamed from: d */
    private byte f140720d = 2;

    static {
        C53612u uVar = new C53612u();
        f140716a = uVar;
        C62942bv.registerDefaultInstance(C53612u.class, uVar);
    }

    private C53612u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140720d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140720d = b;
                return null;
            case 2:
                return newMessageInfo(f140716a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C53612u();
            case 4:
                return new C53611t();
            case 5:
                return f140716a;
            case 6:
                C63010eb ebVar = f140717e;
                if (ebVar == null) {
                    synchronized (C53612u.class) {
                        ebVar = f140717e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140716a);
                            f140717e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
