package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.cm.a.c.a.a.h */
/* compiled from: PG */
public final class C58156h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C58156h f155482e;

    /* renamed from: f */
    private static volatile C63010eb f155483f;

    /* renamed from: a */
    public int f155484a;

    /* renamed from: b */
    public long f155485b;

    /* renamed from: c */
    public C62971cq f155486c = emptyProtobufList();

    /* renamed from: d */
    public C63088z f155487d = C63088z.f170246b;

    static {
        C58156h hVar = new C58156h();
        f155482e = hVar;
        C62942bv.registerDefaultInstance(C58156h.class, hVar);
    }

    private C58156h() {
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
                return newMessageInfo(f155482e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a, C58154f.class, "d"});
            case 3:
                return new C58156h();
            case 4:
                return new C58155g();
            case 5:
                return f155482e;
            case 6:
                C63010eb ebVar = f155483f;
                if (ebVar == null) {
                    synchronized (C58156h.class) {
                        ebVar = f155483f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155482e);
                            f155483f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
