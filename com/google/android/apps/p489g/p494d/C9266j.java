package com.google.android.apps.p489g.p494d;

import com.google.android.apps.gsa.assist.C9419i;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.g.d.j */
/* compiled from: PG */
public final class C9266j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9266j f32060d;

    /* renamed from: e */
    private static volatile C63010eb f32061e;

    /* renamed from: a */
    public int f32062a;

    /* renamed from: b */
    public int f32063b;

    /* renamed from: c */
    public C63088z f32064c = C63088z.f170246b;

    static {
        C9266j jVar = new C9266j();
        f32060d = jVar;
        C62942bv.registerDefaultInstance(C9266j.class, jVar);
    }

    private C9266j() {
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
                return newMessageInfo(f32060d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ည\u0001", new Object[]{"a", "b", C9419i.f32727a, C45240c.f118157a});
            case 3:
                return new C9266j();
            case 4:
                return new C9265i();
            case 5:
                return f32060d;
            case 6:
                C63010eb ebVar = f32061e;
                if (ebVar == null) {
                    synchronized (C9266j.class) {
                        ebVar = f32061e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32060d);
                            f32061e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
