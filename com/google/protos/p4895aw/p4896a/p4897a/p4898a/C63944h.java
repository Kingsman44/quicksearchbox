package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.h */
/* compiled from: PG */
public final class C63944h extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C63944h f172933b;

    /* renamed from: e */
    private static volatile C63010eb f172934e;

    /* renamed from: a */
    public int f172935a;

    /* renamed from: c */
    private int f172936c;

    /* renamed from: d */
    private byte f172937d = 2;

    static {
        C63944h hVar = new C63944h();
        f172933b = hVar;
        C62942bv.registerDefaultInstance(C63944h.class, hVar);
    }

    private C63944h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172937d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172937d = b;
                return null;
            case 2:
                return newMessageInfo(f172933b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C63943g.m96324b()});
            case 3:
                return new C63944h();
            case 4:
                return new C63941e();
            case 5:
                return f172933b;
            case 6:
                C63010eb ebVar = f172934e;
                if (ebVar == null) {
                    synchronized (C63944h.class) {
                        ebVar = f172934e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172933b);
                            f172934e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
