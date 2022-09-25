package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.fl */
/* compiled from: PG */
public final class C57495fl extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C57495fl f153576d;

    /* renamed from: g */
    private static volatile C63010eb f153577g;

    /* renamed from: a */
    public int f153578a = 0;

    /* renamed from: b */
    public Object f153579b;

    /* renamed from: c */
    public C57474er f153580c;

    /* renamed from: e */
    private int f153581e;

    /* renamed from: f */
    private byte f153582f = 2;

    static {
        C57495fl flVar = new C57495fl();
        f153576d = flVar;
        C62942bv.registerDefaultInstance(C57495fl.class, flVar);
    }

    private C57495fl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153582f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153582f = b;
                return null;
            case 2:
                return newMessageInfo(f153576d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ြ\u0000\u0003ᐼ\u0000", new Object[]{"b", "a", "e", C45240c.f118157a, C57515w.class, C57414cl.class});
            case 3:
                return new C57495fl();
            case 4:
                return new C57493fj();
            case 5:
                return f153576d;
            case 6:
                C63010eb ebVar = f153577g;
                if (ebVar == null) {
                    synchronized (C57495fl.class) {
                        ebVar = f153577g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153576d);
                            f153577g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
