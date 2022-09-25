package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.ii */
/* compiled from: PG */
public final class C65283ii extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65283ii f176593d;

    /* renamed from: f */
    private static volatile C63010eb f176594f;

    /* renamed from: a */
    public C62971cq f176595a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C65161dv f176596b;

    /* renamed from: c */
    public C62964ck f176597c = emptyLongList();

    /* renamed from: e */
    private int f176598e;

    static {
        C65283ii iiVar = new C65283ii();
        f176593d = iiVar;
        C62942bv.registerDefaultInstance(C65283ii.class, iiVar);
    }

    private C65283ii() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f176593d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002ဉ\u0000\u0003%", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C65283ii();
            case 4:
                return new C65282ih();
            case 5:
                return f176593d;
            case 6:
                C63010eb ebVar = f176594f;
                if (ebVar == null) {
                    synchronized (C65283ii.class) {
                        ebVar = f176594f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176593d);
                            f176594f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
