package com.google.lens.p4694a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4056g.p4057a.p4058a.C54024ce;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.bb */
/* compiled from: PG */
public final class C62050bb extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62050bb f167631e;

    /* renamed from: g */
    private static volatile C63010eb f167632g;

    /* renamed from: a */
    public int f167633a;

    /* renamed from: b */
    public C62971cq f167634b = emptyProtobufList();

    /* renamed from: c */
    public int f167635c;

    /* renamed from: d */
    public int f167636d = -1;

    /* renamed from: f */
    private byte f167637f = 2;

    static {
        C62050bb bbVar = new C62050bb();
        f167631e = bbVar;
        C62942bv.registerDefaultInstance(C62050bb.class, bbVar);
    }

    private C62050bb() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167637f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167637f = b;
                return null;
            case 2:
                return newMessageInfo(f167631e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000\u0003င\u0001", new Object[]{"a", "b", C54024ce.class, C45240c.f118157a, C62047az.f167628a, "d"});
            case 3:
                return new C62050bb();
            case 4:
                return new C62046ay();
            case 5:
                return f167631e;
            case 6:
                C63010eb ebVar = f167632g;
                if (ebVar == null) {
                    synchronized (C62050bb.class) {
                        ebVar = f167632g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167631e);
                            f167632g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
