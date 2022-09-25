package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.dg */
/* compiled from: PG */
public final class C7607dg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7607dg f26290e;

    /* renamed from: g */
    private static volatile C63010eb f26291g;

    /* renamed from: a */
    public int f26292a;

    /* renamed from: b */
    public C8150xj f26293b;

    /* renamed from: c */
    public C62971cq f26294c = emptyProtobufList();

    /* renamed from: d */
    public C7799kj f26295d;

    /* renamed from: f */
    private byte f26296f = 2;

    static {
        C7607dg dgVar = new C7607dg();
        f26290e = dgVar;
        C62942bv.registerDefaultInstance(C7607dg.class, dgVar);
    }

    private C7607dg() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26296f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f26296f = b;
                return null;
            case 2:
                return newMessageInfo(f26290e, "\u0001\u0003\u0000\u0001\u0006\b\u0003\u0000\u0001\u0001\u0006\u001b\u0007ᐉ\u0001\bဉ\u0000", new Object[]{"a", C45240c.f118157a, C7893nw.class, "d", "b"});
            case 3:
                return new C7607dg();
            case 4:
                return new C7606df();
            case 5:
                return f26290e;
            case 6:
                C63010eb ebVar = f26291g;
                if (ebVar == null) {
                    synchronized (C7607dg.class) {
                        ebVar = f26291g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26290e);
                            f26291g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
