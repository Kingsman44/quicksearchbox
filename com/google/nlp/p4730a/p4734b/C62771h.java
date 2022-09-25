package com.google.nlp.p4730a.p4734b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.b.h */
/* compiled from: PG */
public final class C62771h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62771h f169514c;

    /* renamed from: e */
    private static volatile C63010eb f169515e;

    /* renamed from: a */
    public int f169516a = 0;

    /* renamed from: b */
    public Object f169517b;

    /* renamed from: d */
    private byte f169518d = 2;

    static {
        C62771h hVar = new C62771h();
        f169514c = hVar;
        C62942bv.registerDefaultInstance(C62771h.class, hVar);
    }

    private C62771h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169518d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169518d = b;
                return null;
            case 2:
                return newMessageInfo(f169514c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C62781r.class, C62779p.class, C62777n.class});
            case 3:
                return new C62771h();
            case 4:
                return new C62770g();
            case 5:
                return f169514c;
            case 6:
                C63010eb ebVar = f169515e;
                if (ebVar == null) {
                    synchronized (C62771h.class) {
                        ebVar = f169515e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169514c);
                            f169515e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
