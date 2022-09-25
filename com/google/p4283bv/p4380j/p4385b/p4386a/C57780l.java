package com.google.p4283bv.p4380j.p4385b.p4386a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63070h;

/* renamed from: com.google.bv.j.b.a.l */
/* compiled from: PG */
public final class C57780l extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C57780l f154376c;

    /* renamed from: e */
    private static volatile C63010eb f154377e;

    /* renamed from: a */
    public int f154378a;

    /* renamed from: b */
    public C63070h f154379b;

    /* renamed from: d */
    private byte f154380d = 2;

    static {
        C57780l lVar = new C57780l();
        f154376c = lVar;
        C62942bv.registerDefaultInstance(C57780l.class, lVar);
    }

    private C57780l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154380d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154380d = b;
                return null;
            case 2:
                return newMessageInfo(f154376c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C57780l();
            case 4:
                return new C57779k();
            case 5:
                return f154376c;
            case 6:
                C63010eb ebVar = f154377e;
                if (ebVar == null) {
                    synchronized (C57780l.class) {
                        ebVar = f154377e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154376c);
                            f154377e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
