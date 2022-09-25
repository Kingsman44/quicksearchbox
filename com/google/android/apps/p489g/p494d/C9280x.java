package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7998rt;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.x */
/* compiled from: PG */
public final class C9280x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9280x f32220d;

    /* renamed from: f */
    private static volatile C63010eb f32221f;

    /* renamed from: a */
    public int f32222a;

    /* renamed from: b */
    public C62971cq f32223b = emptyProtobufList();

    /* renamed from: c */
    public C7998rt f32224c;

    /* renamed from: e */
    private byte f32225e = 2;

    static {
        C9280x xVar = new C9280x();
        f32220d = xVar;
        C62942bv.registerDefaultInstance(C9280x.class, xVar);
    }

    private C9280x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32225e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32225e = b;
                return null;
            case 2:
                return newMessageInfo(f32220d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", C9278v.class, C45240c.f118157a});
            case 3:
                return new C9280x();
            case 4:
                return new C9279w();
            case 5:
                return f32220d;
            case 6:
                C63010eb ebVar = f32221f;
                if (ebVar == null) {
                    synchronized (C9280x.class) {
                        ebVar = f32221f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32220d);
                            f32221f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
