package com.google.android.apps.p489g.p495e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7918ou;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.e.b */
/* compiled from: PG */
public final class C9285b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9285b f32227d;

    /* renamed from: f */
    private static volatile C63010eb f32228f;

    /* renamed from: a */
    public int f32229a;

    /* renamed from: b */
    public C7918ou f32230b;

    /* renamed from: c */
    public C7718hj f32231c;

    /* renamed from: e */
    private byte f32232e = 2;

    static {
        C9285b bVar = new C9285b();
        f32227d = bVar;
        C62942bv.registerDefaultInstance(C9285b.class, bVar);
    }

    private C9285b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32232e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32232e = b;
                return null;
            case 2:
                return newMessageInfo(f32227d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9285b();
            case 4:
                return new C9284a();
            case 5:
                return f32227d;
            case 6:
                C63010eb ebVar = f32228f;
                if (ebVar == null) {
                    synchronized (C9285b.class) {
                        ebVar = f32228f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32227d);
                            f32228f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
