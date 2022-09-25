package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7818lb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.ap */
/* compiled from: PG */
public final class C9153ap extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9153ap f31590f;

    /* renamed from: h */
    private static volatile C63010eb f31591h;

    /* renamed from: a */
    public int f31592a;

    /* renamed from: b */
    public C9164b f31593b;

    /* renamed from: c */
    public C62971cq f31594c = emptyProtobufList();

    /* renamed from: d */
    public C9278v f31595d;

    /* renamed from: e */
    public int f31596e = 1;

    /* renamed from: g */
    private byte f31597g = 2;

    static {
        C9153ap apVar = new C9153ap();
        f31590f = apVar;
        C62942bv.registerDefaultInstance(C9153ap.class, apVar);
    }

    private C9153ap() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31597g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31597g = b;
                return null;
            case 2:
                return newMessageInfo(f31590f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001ဉ\u0000\u0002\u001b\u0003ᐉ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7818lb.class, "d", "e", C9151an.f31589a});
            case 3:
                return new C9153ap();
            case 4:
                return new C9150am();
            case 5:
                return f31590f;
            case 6:
                C63010eb ebVar = f31591h;
                if (ebVar == null) {
                    synchronized (C9153ap.class) {
                        ebVar = f31591h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31590f);
                            f31591h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
