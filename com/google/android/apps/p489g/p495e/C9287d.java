package com.google.android.apps.p489g.p495e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7931pg;
import com.google.p375ai.p378b.C8139wz;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.e.d */
/* compiled from: PG */
public final class C9287d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9287d f32233f;

    /* renamed from: h */
    private static volatile C63010eb f32234h;

    /* renamed from: a */
    public int f32235a;

    /* renamed from: b */
    public C8139wz f32236b;

    /* renamed from: c */
    public C7931pg f32237c;

    /* renamed from: d */
    public C62971cq f32238d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f32239e = emptyProtobufList();

    /* renamed from: g */
    private byte f32240g = 2;

    static {
        C9287d dVar = new C9287d();
        f32233f = dVar;
        C62942bv.registerDefaultInstance(C9287d.class, dVar);
    }

    private C9287d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32240g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32240g = b;
                return null;
            case 2:
                return newMessageInfo(f32233f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003Л\u0004Л", new Object[]{"a", "b", C45240c.f118157a, "d", C7918ou.class, "e", C9285b.class});
            case 3:
                return new C9287d();
            case 4:
                return new C9286c();
            case 5:
                return f32233f;
            case 6:
                C63010eb ebVar = f32234h;
                if (ebVar == null) {
                    synchronized (C9287d.class) {
                        ebVar = f32234h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32233f);
                            f32234h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
