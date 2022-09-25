package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.rk */
/* compiled from: PG */
public final class C55412rk extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C55412rk f146007f;

    /* renamed from: h */
    private static volatile C63010eb f146008h;

    /* renamed from: a */
    public int f146009a;

    /* renamed from: b */
    public String f146010b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146011c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public int f146012d;

    /* renamed from: e */
    public C54969b f146013e;

    /* renamed from: g */
    private byte f146014g = 2;

    static {
        C55412rk rkVar = new C55412rk();
        f146007f = rkVar;
        C62942bv.registerDefaultInstance(C55412rk.class, rkVar);
    }

    private C55412rk() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146014g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146014g = b;
                return null;
            case 2:
                return newMessageInfo(f146007f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဈ\u0000\u0002\u001a\u0003ᐉ\u0002\u0004င\u0001", new Object[]{"a", "b", C45240c.f118157a, "e", "d"});
            case 3:
                return new C55412rk();
            case 4:
                return new C55411rj();
            case 5:
                return f146007f;
            case 6:
                C63010eb ebVar = f146008h;
                if (ebVar == null) {
                    synchronized (C55412rk.class) {
                        ebVar = f146008h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146007f);
                            f146008h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
