package com.google.protos.p4985f.p5030q;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p4280bt.C56488d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.er */
/* compiled from: PG */
public final class C65184er extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65184er f176398e;

    /* renamed from: g */
    private static volatile C63010eb f176399g;

    /* renamed from: a */
    public int f176400a = 0;

    /* renamed from: b */
    public Object f176401b;

    /* renamed from: c */
    public int f176402c;

    /* renamed from: d */
    public C62971cq f176403d = emptyProtobufList();

    /* renamed from: f */
    private byte f176404f = 2;

    static {
        C65184er erVar = new C65184er();
        f176398e = erVar;
        C62942bv.registerDefaultInstance(C65184er.class, erVar);
    }

    private C65184er() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176404f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176404f = b;
                return null;
            case 2:
                return newMessageInfo(f176398e, "\u0000\u0004\u0001\u0000\u0001\u0005\u0004\u0000\u0001\u0001\u0001\f\u0002Л\u0003<\u0000\u0005<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C61752n.class, C65159dt.class, C56488d.class});
            case 3:
                return new C65184er();
            case 4:
                return new C65183eq();
            case 5:
                return f176398e;
            case 6:
                C63010eb ebVar = f176399g;
                if (ebVar == null) {
                    synchronized (C65184er.class) {
                        ebVar = f176399g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176398e);
                            f176399g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
