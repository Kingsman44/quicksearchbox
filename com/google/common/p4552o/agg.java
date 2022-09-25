package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agg */
/* compiled from: PG */
public final class agg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agg f158622e;

    /* renamed from: g */
    private static volatile C63010eb f158623g;

    /* renamed from: a */
    public int f158624a;

    /* renamed from: b */
    public C62971cq f158625b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f158626c = emptyProtobufList();

    /* renamed from: d */
    public afv f158627d;

    /* renamed from: f */
    private byte f158628f = 2;

    static {
        agg agg = new agg();
        f158622e = agg;
        C62942bv.registerDefaultInstance(agg.class, agg);
    }

    private agg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f158628f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f158628f = b;
                return null;
            case 2:
                return newMessageInfo(f158622e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\u001b\u0002Л\u0003ဉ\u0000", new Object[]{"a", "b", agf.class, C45240c.f118157a, afz.class, "d"});
            case 3:
                return new agg();
            case 4:
                return new aft();
            case 5:
                return f158622e;
            case 6:
                C63010eb ebVar = f158623g;
                if (ebVar == null) {
                    synchronized (agg.class) {
                        ebVar = f158623g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158622e);
                            f158623g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
