package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.rz */
/* compiled from: PG */
public final class C8004rz extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8004rz f28119f;

    /* renamed from: h */
    private static volatile C63010eb f28120h;

    /* renamed from: a */
    public int f28121a;

    /* renamed from: b */
    public C7838lv f28122b;

    /* renamed from: c */
    public C62971cq f28123c = emptyProtobufList();

    /* renamed from: d */
    public C7994rp f28124d;

    /* renamed from: e */
    public int f28125e = 1;

    /* renamed from: g */
    private byte f28126g = 2;

    static {
        C8004rz rzVar = new C8004rz();
        f28119f = rzVar;
        C62942bv.registerDefaultInstance(C8004rz.class, rzVar);
    }

    private C8004rz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28126g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28126g = b;
                return null;
            case 2:
                return newMessageInfo(f28119f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7818lb.class, "d", "e", C8002rx.f28118a});
            case 3:
                return new C8004rz();
            case 4:
                return new C8001rw();
            case 5:
                return f28119f;
            case 6:
                C63010eb ebVar = f28120h;
                if (ebVar == null) {
                    synchronized (C8004rz.class) {
                        ebVar = f28120h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28119f);
                            f28120h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
