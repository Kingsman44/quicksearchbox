package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ps */
/* compiled from: PG */
public final class C14613ps extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C14613ps f44173e;

    /* renamed from: g */
    private static volatile C63010eb f44174g;

    /* renamed from: a */
    public int f44175a;

    /* renamed from: b */
    public C62971cq f44176b = emptyProtobufList();

    /* renamed from: c */
    public int f44177c;

    /* renamed from: d */
    public C14333fi f44178d;

    /* renamed from: f */
    private byte f44179f = 2;

    static {
        C14613ps psVar = new C14613ps();
        f44173e = psVar;
        C62942bv.registerDefaultInstance(C14613ps.class, psVar);
    }

    private C14613ps() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f44179f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f44179f = b;
                return null;
            case 2:
                return newMessageInfo(f44173e, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0001\u0002\u0002Л\u0003\f\u0004Љ\u0005\f", new Object[]{"b", C14292dv.class, C45240c.f118157a, "d", "a"});
            case 3:
                return new C14613ps();
            case 4:
                return new C14611pq();
            case 5:
                return f44173e;
            case 6:
                C63010eb ebVar = f44174g;
                if (ebVar == null) {
                    synchronized (C14613ps.class) {
                        ebVar = f44174g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f44173e);
                            f44174g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
