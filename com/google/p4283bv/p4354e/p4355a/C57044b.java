package com.google.p4283bv.p4354e.p4355a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.a.b */
/* compiled from: PG */
public final class C57044b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57044b f152285d;

    /* renamed from: e */
    private static volatile C63010eb f152286e;

    /* renamed from: a */
    public int f152287a;

    /* renamed from: b */
    public long f152288b;

    /* renamed from: c */
    public long f152289c;

    static {
        C57044b bVar = new C57044b();
        f152285d = bVar;
        C62942bv.registerDefaultInstance(C57044b.class, bVar);
    }

    private C57044b() {
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
                return newMessageInfo(f152285d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57044b();
            case 4:
                return new C57043a();
            case 5:
                return f152285d;
            case 6:
                C63010eb ebVar = f152286e;
                if (ebVar == null) {
                    synchronized (C57044b.class) {
                        ebVar = f152286e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152285d);
                            f152286e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
