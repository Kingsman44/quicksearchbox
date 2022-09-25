package com.google.p4656j.p4657a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.j.a.b */
/* compiled from: PG */
public final class C61718b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61718b f166739e;

    /* renamed from: f */
    private static volatile C63010eb f166740f;

    /* renamed from: a */
    public int f166741a;

    /* renamed from: b */
    public C63088z f166742b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f166743c;

    /* renamed from: d */
    public C63088z f166744d;

    static {
        C61718b bVar = new C61718b();
        f166739e = bVar;
        C62942bv.registerDefaultInstance(C61718b.class, bVar);
    }

    private C61718b() {
        C63088z zVar = C63088z.f170246b;
        this.f166743c = zVar;
        this.f166744d = zVar;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f166739e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C61718b();
            case 4:
                return new C61717a();
            case 5:
                return f166739e;
            case 6:
                C63010eb ebVar = f166740f;
                if (ebVar == null) {
                    synchronized (C61718b.class) {
                        ebVar = f166740f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166739e);
                            f166740f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
