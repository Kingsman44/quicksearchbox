package com.google.protos.p5129p.p5131b;

import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.n */
/* compiled from: PG */
public final class C65845n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65845n f178992c;

    /* renamed from: e */
    private static volatile C63010eb f178993e;

    /* renamed from: a */
    public int f178994a;

    /* renamed from: b */
    public C19088t f178995b;

    /* renamed from: d */
    private byte f178996d = 2;

    static {
        C65845n nVar = new C65845n();
        f178992c = nVar;
        C62942bv.registerDefaultInstance(C65845n.class, nVar);
    }

    private C65845n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178996d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178996d = b;
                return null;
            case 2:
                return newMessageInfo(f178992c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C65845n();
            case 4:
                return new C65844m();
            case 5:
                return f178992c;
            case 6:
                C63010eb ebVar = f178993e;
                if (ebVar == null) {
                    synchronized (C65845n.class) {
                        ebVar = f178993e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178992c);
                            f178993e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
