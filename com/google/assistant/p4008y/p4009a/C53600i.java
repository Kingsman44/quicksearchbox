package com.google.assistant.p4008y.p4009a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.i */
/* compiled from: PG */
public final class C53600i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53600i f140681c;

    /* renamed from: f */
    private static volatile C63010eb f140682f;

    /* renamed from: a */
    public int f140683a;

    /* renamed from: b */
    public C53595d f140684b;

    /* renamed from: d */
    private C53548ah f140685d;

    /* renamed from: e */
    private byte f140686e = 2;

    static {
        C53600i iVar = new C53600i();
        f140681c = iVar;
        C62942bv.registerDefaultInstance(C53600i.class, iVar);
    }

    private C53600i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140686e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140686e = b;
                return null;
            case 2:
                return newMessageInfo(f140681c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "d", "b"});
            case 3:
                return new C53600i();
            case 4:
                return new C53599h();
            case 5:
                return f140681c;
            case 6:
                C63010eb ebVar = f140682f;
                if (ebVar == null) {
                    synchronized (C53600i.class) {
                        ebVar = f140682f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140681c);
                            f140682f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
