package com.google.protos.p5129p.p5131b;

import com.google.assistant.p3781ad.p3782a.p3783a.C48478d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.b */
/* compiled from: PG */
public final class C65769b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65769b f178801c;

    /* renamed from: e */
    private static volatile C63010eb f178802e;

    /* renamed from: a */
    public int f178803a;

    /* renamed from: b */
    public C48478d f178804b;

    /* renamed from: d */
    private byte f178805d = 2;

    static {
        C65769b bVar = new C65769b();
        f178801c = bVar;
        C62942bv.registerDefaultInstance(C65769b.class, bVar);
    }

    private C65769b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178805d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178805d = b;
                return null;
            case 2:
                return newMessageInfo(f178801c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65769b();
            case 4:
                return new C65742a();
            case 5:
                return f178801c;
            case 6:
                C63010eb ebVar = f178802e;
                if (ebVar == null) {
                    synchronized (C65769b.class) {
                        ebVar = f178802e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178801c);
                            f178802e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
