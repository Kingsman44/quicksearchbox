package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.bp */
/* compiled from: PG */
public final class C57599bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57599bp f153875d;

    /* renamed from: f */
    private static volatile C63010eb f153876f;

    /* renamed from: a */
    public C57601br f153877a;

    /* renamed from: b */
    public C62971cq f153878b = emptyProtobufList();

    /* renamed from: c */
    public C57566aj f153879c;

    /* renamed from: e */
    private byte f153880e = 2;

    static {
        C57599bp bpVar = new C57599bp();
        f153875d = bpVar;
        C62942bv.registerDefaultInstance(C57599bp.class, bpVar);
    }

    private C57599bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153880e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153880e = b;
                return null;
            case 2:
                return newMessageInfo(f153875d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0001\u0001\t\u0002Л\u0003\t", new Object[]{"a", "b", C57663x.class, C45240c.f118157a});
            case 3:
                return new C57599bp();
            case 4:
                return new C57598bo();
            case 5:
                return f153875d;
            case 6:
                C63010eb ebVar = f153876f;
                if (ebVar == null) {
                    synchronized (C57599bp.class) {
                        ebVar = f153876f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153875d);
                            f153876f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
