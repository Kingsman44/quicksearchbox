package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C8140x;
import com.google.p375ai.p378b.C8194z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.p */
/* compiled from: PG */
public final class C9272p extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9272p f32079d;

    /* renamed from: f */
    private static volatile C63010eb f32080f;

    /* renamed from: a */
    public int f32081a;

    /* renamed from: b */
    public C62971cq f32082b = emptyProtobufList();

    /* renamed from: c */
    public C8140x f32083c;

    /* renamed from: e */
    private byte f32084e = 2;

    static {
        C9272p pVar = new C9272p();
        f32079d = pVar;
        C62942bv.registerDefaultInstance(C9272p.class, pVar);
    }

    private C9272p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32084e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32084e = b;
                return null;
            case 2:
                return newMessageInfo(f32079d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002Л\u0003ᐉ\u0000", new Object[]{"a", "b", C8194z.class, C45240c.f118157a});
            case 3:
                return new C9272p();
            case 4:
                return new C9271o();
            case 5:
                return f32079d;
            case 6:
                C63010eb ebVar = f32080f;
                if (ebVar == null) {
                    synchronized (C9272p.class) {
                        ebVar = f32080f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32079d);
                            f32080f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
