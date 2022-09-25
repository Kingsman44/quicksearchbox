package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.cw */
/* compiled from: PG */
public final class C51889cw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51889cw f136108c;

    /* renamed from: f */
    private static volatile C63010eb f136109f;

    /* renamed from: a */
    public C62971cq f136110a = emptyProtobufList();

    /* renamed from: b */
    public int f136111b;

    /* renamed from: d */
    private int f136112d;

    /* renamed from: e */
    private byte f136113e = 2;

    static {
        C51889cw cwVar = new C51889cw();
        f136108c = cwVar;
        C62942bv.registerDefaultInstance(C51889cw.class, cwVar);
    }

    private C51889cw() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* renamed from: a */
    public static C63010eb m86408a() {
        return f136108c.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136113e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136113e = b;
                return null;
            case 2:
                return newMessageInfo(f136108c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0001", new Object[]{"d", "a", C52066y.class, "b", C51887cu.f136107a});
            case 3:
                return new C51889cw();
            case 4:
                return new C51886ct();
            case 5:
                return f136108c;
            case 6:
                C63010eb ebVar = f136109f;
                if (ebVar == null) {
                    synchronized (C51889cw.class) {
                        ebVar = f136109f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136108c);
                            f136109f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
