package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.an */
/* compiled from: PG */
public final class C57362an extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57362an f153241c;

    /* renamed from: e */
    private static volatile C63010eb f153242e;

    /* renamed from: a */
    public int f153243a = 0;

    /* renamed from: b */
    public Object f153244b;

    /* renamed from: d */
    private byte f153245d = 2;

    static {
        C57362an anVar = new C57362an();
        f153241c = anVar;
        C62942bv.registerDefaultInstance(C57362an.class, anVar);
    }

    private C57362an() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153245d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153245d = b;
                return null;
            case 2:
                return newMessageInfo(f153241c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C57369au.class, C57511s.class, C57394bs.class, C57353ae.class});
            case 3:
                return new C57362an();
            case 4:
                return new C57360al();
            case 5:
                return f153241c;
            case 6:
                C63010eb ebVar = f153242e;
                if (ebVar == null) {
                    synchronized (C57362an.class) {
                        ebVar = f153242e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153241c);
                            f153242e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
