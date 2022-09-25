package com.google.lens.p4712n.p4713a.p4714a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4056g.p4057a.p4058a.C54002bj;
import com.google.p4017at.p4056g.p4057a.p4058a.C54008bp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.n.a.a.b */
/* compiled from: PG */
public final class C62634b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62634b f169103b;

    /* renamed from: f */
    private static volatile C63010eb f169104f;

    /* renamed from: a */
    public C62971cq f169105a = emptyProtobufList();

    /* renamed from: c */
    private int f169106c;

    /* renamed from: d */
    private C54002bj f169107d;

    /* renamed from: e */
    private byte f169108e = 2;

    static {
        C62634b bVar = new C62634b();
        f169103b = bVar;
        C62942bv.registerDefaultInstance(C62634b.class, bVar);
    }

    private C62634b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169108e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169108e = b;
                return null;
            case 2:
                return newMessageInfo(f169103b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{C45240c.f118157a, "a", C54008bp.class, "d"});
            case 3:
                return new C62634b();
            case 4:
                return new C62633a();
            case 5:
                return f169103b;
            case 6:
                C63010eb ebVar = f169104f;
                if (ebVar == null) {
                    synchronized (C62634b.class) {
                        ebVar = f169104f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169103b);
                            f169104f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
