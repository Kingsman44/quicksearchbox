package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.bq */
/* compiled from: PG */
public final class C65786bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65786bq f178834b;

    /* renamed from: d */
    private static volatile C63010eb f178835d;

    /* renamed from: a */
    public C62995dn f178836a = C62995dn.f170057a;

    /* renamed from: c */
    private byte f178837c = 2;

    static {
        C65786bq bqVar = new C65786bq();
        f178834b = bqVar;
        C62942bv.registerDefaultInstance(C65786bq.class, bqVar);
    }

    private C65786bq() {
    }

    /* renamed from: a */
    public final C62995dn mo59427a() {
        C62995dn dnVar = this.f178836a;
        if (!dnVar.f170058b) {
            this.f178836a = dnVar.mo58980a();
        }
        return this.f178836a;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178837c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178837c = b;
                return null;
            case 2:
                return newMessageInfo(f178834b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"a", C65781bl.f178828a});
            case 3:
                return new C65786bq();
            case 4:
                return new C65776bg();
            case 5:
                return f178834b;
            case 6:
                C63010eb ebVar = f178835d;
                if (ebVar == null) {
                    synchronized (C65786bq.class) {
                        ebVar = f178835d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178834b);
                            f178835d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
