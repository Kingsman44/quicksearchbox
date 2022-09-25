package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4919b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.c.a.a.a.c.b.b */
/* compiled from: PG */
public final class C64177b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64177b f173519d;

    /* renamed from: e */
    private static volatile C63010eb f173520e;

    /* renamed from: a */
    public int f173521a;

    /* renamed from: b */
    public C63088z f173522b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f173523c;

    static {
        C64177b bVar = new C64177b();
        f173519d = bVar;
        C62942bv.registerDefaultInstance(C64177b.class, bVar);
    }

    private C64177b() {
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
                return newMessageInfo(f173519d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C64177b();
            case 4:
                return new C64172a();
            case 5:
                return f173519d;
            case 6:
                C63010eb ebVar = f173520e;
                if (ebVar == null) {
                    synchronized (C64177b.class) {
                        ebVar = f173520e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173519d);
                            f173520e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
