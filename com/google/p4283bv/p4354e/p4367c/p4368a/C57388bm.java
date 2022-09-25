package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bm */
/* compiled from: PG */
public final class C57388bm extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57388bm f153297c;

    /* renamed from: e */
    private static volatile C63010eb f153298e;

    /* renamed from: a */
    public int f153299a = 0;

    /* renamed from: b */
    public Object f153300b;

    /* renamed from: d */
    private byte f153301d = 2;

    static {
        C57388bm bmVar = new C57388bm();
        f153297c = bmVar;
        C62942bv.registerDefaultInstance(C57388bm.class, bmVar);
    }

    private C57388bm() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153301d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153301d = b;
                return null;
            case 2:
                return newMessageInfo(f153297c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0001\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", C57515w.class, C57414cl.class});
            case 3:
                return new C57388bm();
            case 4:
                return new C57386bk();
            case 5:
                return f153297c;
            case 6:
                C63010eb ebVar = f153298e;
                if (ebVar == null) {
                    synchronized (C57388bm.class) {
                        ebVar = f153298e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153297c);
                            f153298e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
