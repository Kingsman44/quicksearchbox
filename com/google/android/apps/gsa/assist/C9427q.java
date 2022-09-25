package com.google.android.apps.gsa.assist;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.q */
/* compiled from: PG */
public final class C9427q extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C9427q f32742d;

    /* renamed from: f */
    private static volatile C63010eb f32743f;

    /* renamed from: a */
    public int f32744a;

    /* renamed from: b */
    public C62971cq f32745b = emptyProtobufList();

    /* renamed from: c */
    public C9422l f32746c;

    /* renamed from: e */
    private byte f32747e = 2;

    static {
        C9427q qVar = new C9427q();
        f32742d = qVar;
        C62942bv.registerDefaultInstance(C9427q.class, qVar);
    }

    private C9427q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f32747e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f32747e = b;
                return null;
            case 2:
                return newMessageInfo(f32742d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", C9431u.class, C45240c.f118157a});
            case 3:
                return new C9427q();
            case 4:
                return new C9426p();
            case 5:
                return f32742d;
            case 6:
                C63010eb ebVar = f32743f;
                if (ebVar == null) {
                    synchronized (C9427q.class) {
                        ebVar = f32743f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32742d);
                            f32743f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
