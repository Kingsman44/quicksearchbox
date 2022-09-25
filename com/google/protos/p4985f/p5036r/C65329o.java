package com.google.protos.p4985f.p5036r;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C49067ff;
import com.google.assistant.p3803ag.p3809c.C49078fq;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.r.o */
/* compiled from: PG */
public final class C65329o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65329o f176676e;

    /* renamed from: g */
    private static volatile C63010eb f176677g;

    /* renamed from: a */
    public int f176678a;

    /* renamed from: b */
    public C62971cq f176679b = emptyProtobufList();

    /* renamed from: c */
    public C49067ff f176680c;

    /* renamed from: d */
    public C49078fq f176681d;

    /* renamed from: f */
    private byte f176682f = 2;

    static {
        C65329o oVar = new C65329o();
        f176676e = oVar;
        C62942bv.registerDefaultInstance(C65329o.class, oVar);
    }

    private C65329o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176682f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176682f = b;
                return null;
            case 2:
                return newMessageInfo(f176676e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", aas.class, C45240c.f118157a, "d"});
            case 3:
                return new C65329o();
            case 4:
                return new C65328n();
            case 5:
                return f176676e;
            case 6:
                C63010eb ebVar = f176677g;
                if (ebVar == null) {
                    synchronized (C65329o.class) {
                        ebVar = f176677g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176676e);
                            f176677g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
