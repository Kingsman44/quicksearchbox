package com.google.assistant.p3861at;

import com.google.assistant.p3897e.p3910e.p3911a.C51201p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.acp */
/* compiled from: PG */
public final class acp extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final acp f128863c;

    /* renamed from: f */
    private static volatile C63010eb f128864f;

    /* renamed from: a */
    public abf f128865a;

    /* renamed from: b */
    public C62971cq f128866b = emptyProtobufList();

    /* renamed from: d */
    private int f128867d;

    /* renamed from: e */
    private byte f128868e = 2;

    static {
        acp acp = new acp();
        f128863c = acp;
        C62942bv.registerDefaultInstance(acp.class, acp);
    }

    private acp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128868e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128868e = b;
                return null;
            case 2:
                return newMessageInfo(f128863c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л", new Object[]{"d", "a", "b", C51201p.class});
            case 3:
                return new acp();
            case 4:
                return new aco();
            case 5:
                return f128863c;
            case 6:
                C63010eb ebVar = f128864f;
                if (ebVar == null) {
                    synchronized (acp.class) {
                        ebVar = f128864f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128863c);
                            f128864f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
