package com.google.lens.p4698d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.d.s */
/* compiled from: PG */
public final class C62180s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62180s f167887d;

    /* renamed from: g */
    private static volatile C63010eb f167888g;

    /* renamed from: a */
    public long f167889a;

    /* renamed from: b */
    public C62184w f167890b;

    /* renamed from: c */
    public C62182u f167891c;

    /* renamed from: e */
    private int f167892e;

    /* renamed from: f */
    private byte f167893f = 2;

    static {
        C62180s sVar = new C62180s();
        f167887d = sVar;
        C62942bv.registerDefaultInstance(C62180s.class, sVar);
    }

    private C62180s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167893f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167893f = b;
                return null;
            case 2:
                return newMessageInfo(f167887d, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0001\u0001ဂ\u0000\u0003ဉ\u0002\u0005ᐉ\u0004", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C62180s();
            case 4:
                return new C62179r();
            case 5:
                return f167887d;
            case 6:
                C63010eb ebVar = f167888g;
                if (ebVar == null) {
                    synchronized (C62180s.class) {
                        ebVar = f167888g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167887d);
                            f167888g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
