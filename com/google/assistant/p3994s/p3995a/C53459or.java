package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.or */
/* compiled from: PG */
public final class C53459or extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53459or f140307d;

    /* renamed from: f */
    private static volatile C63010eb f140308f;

    /* renamed from: a */
    public int f140309a;

    /* renamed from: b */
    public C62971cq f140310b = emptyProtobufList();

    /* renamed from: c */
    public C53453ol f140311c;

    /* renamed from: e */
    private byte f140312e = 2;

    static {
        C53459or orVar = new C53459or();
        f140307d = orVar;
        C62942bv.registerDefaultInstance(C53459or.class, orVar);
    }

    private C53459or() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140312e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f140312e = b;
                return null;
            case 2:
                return newMessageInfo(f140307d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000", new Object[]{"a", "b", C53458oq.class, C45240c.f118157a});
            case 3:
                return new C53459or();
            case 4:
                return new C53456oo();
            case 5:
                return f140307d;
            case 6:
                C63010eb ebVar = f140308f;
                if (ebVar == null) {
                    synchronized (C53459or.class) {
                        ebVar = f140308f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140307d);
                            f140308f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
