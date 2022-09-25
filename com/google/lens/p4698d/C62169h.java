package com.google.lens.p4698d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4488cj.p4489a.p4490a.p4491a.C58124d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.h */
/* compiled from: PG */
public final class C62169h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62169h f167834e;

    /* renamed from: g */
    private static volatile C63010eb f167835g;

    /* renamed from: a */
    public int f167836a;

    /* renamed from: b */
    public long f167837b;

    /* renamed from: c */
    public C58124d f167838c;

    /* renamed from: d */
    public C62961ch f167839d = emptyIntList();

    /* renamed from: f */
    private byte f167840f = 2;

    static {
        C62169h hVar = new C62169h();
        f167834e = hVar;
        C62942bv.registerDefaultInstance(C62169h.class, hVar);
    }

    private C62169h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167840f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167840f = b;
                return null;
            case 2:
                return newMessageInfo(f167834e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ᐉ\u0001\u0003\u0016", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62169h();
            case 4:
                return new C62168g();
            case 5:
                return f167834e;
            case 6:
                C63010eb ebVar = f167835g;
                if (ebVar == null) {
                    synchronized (C62169h.class) {
                        ebVar = f167835g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167834e);
                            f167835g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
