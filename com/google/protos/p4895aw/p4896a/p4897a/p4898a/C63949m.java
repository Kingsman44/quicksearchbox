package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.m */
/* compiled from: PG */
public final class C63949m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63949m f172943c;

    /* renamed from: e */
    private static volatile C63010eb f172944e;

    /* renamed from: a */
    public int f172945a = 0;

    /* renamed from: b */
    public Object f172946b;

    /* renamed from: d */
    private byte f172947d = 2;

    static {
        C63949m mVar = new C63949m();
        f172943c = mVar;
        C62942bv.registerDefaultInstance(C63949m.class, mVar);
    }

    private C63949m() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172947d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172947d = b;
                return null;
            case 2:
                return newMessageInfo(f172943c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000", new Object[]{"b", "a", C63951o.class, C63951o.class, C63949m.class, C63955s.class});
            case 3:
                return new C63949m();
            case 4:
                return new C63948l();
            case 5:
                return f172943c;
            case 6:
                C63010eb ebVar = f172944e;
                if (ebVar == null) {
                    synchronized (C63949m.class) {
                        ebVar = f172944e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172943c);
                            f172944e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
