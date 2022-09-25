package com.google.assistant.p4008y.p4009a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.x */
/* compiled from: PG */
public final class C53615x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53615x f140722d;

    /* renamed from: f */
    private static volatile C63010eb f140723f;

    /* renamed from: a */
    public C62971cq f140724a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f140725b = emptyProtobufList();

    /* renamed from: c */
    public C62995dn f140726c = C62995dn.f170057a;

    /* renamed from: e */
    private byte f140727e = 2;

    static {
        C53615x xVar = new C53615x();
        f140722d = xVar;
        C62942bv.registerDefaultInstance(C53615x.class, xVar);
    }

    private C53615x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140727e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140727e = b;
                return null;
            case 2:
                return newMessageInfo(f140722d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0002\u0002\u0001Л\u0002\u001b\u0003в", new Object[]{"a", C53593bz.class, "b", C53589bv.class, C45240c.f118157a, C53614w.f140721a});
            case 3:
                return new C53615x();
            case 4:
                return new C53613v();
            case 5:
                return f140722d;
            case 6:
                C63010eb ebVar = f140723f;
                if (ebVar == null) {
                    synchronized (C53615x.class) {
                        ebVar = f140723f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140722d);
                            f140723f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
