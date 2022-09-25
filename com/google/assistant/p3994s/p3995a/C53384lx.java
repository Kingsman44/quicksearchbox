package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4284a.p4285a.C56602b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.lx */
/* compiled from: PG */
public final class C53384lx extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53384lx f140083a;

    /* renamed from: e */
    private static volatile C63010eb f140084e;

    /* renamed from: b */
    private int f140085b;

    /* renamed from: c */
    private C56602b f140086c;

    /* renamed from: d */
    private byte f140087d = 2;

    static {
        C53384lx lxVar = new C53384lx();
        f140083a = lxVar;
        C62942bv.registerDefaultInstance(C53384lx.class, lxVar);
    }

    private C53384lx() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140087d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140087d = b;
                return null;
            case 2:
                return newMessageInfo(f140083a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C53384lx();
            case 4:
                return new C53383lw();
            case 5:
                return f140083a;
            case 6:
                C63010eb ebVar = f140084e;
                if (ebVar == null) {
                    synchronized (C53384lx.class) {
                        ebVar = f140084e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140083a);
                            f140084e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
