package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.o */
/* compiled from: PG */
public final class C18985o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C18985o f53347b;

    /* renamed from: d */
    private static volatile C63010eb f53348d;

    /* renamed from: a */
    public C62971cq f53349a = emptyProtobufList();

    /* renamed from: c */
    private byte f53350c = 2;

    static {
        C18985o oVar = new C18985o();
        f53347b = oVar;
        C62942bv.registerDefaultInstance(C18985o.class, oVar);
    }

    private C18985o() {
    }

    /* renamed from: a */
    public final void mo24235a() {
        C62971cq cqVar = this.f53349a;
        if (!cqVar.mo58948c()) {
            this.f53349a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53350c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53350c = b;
                return null;
            case 2:
                return newMessageInfo(f53347b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C18983m.class});
            case 3:
                return new C18985o();
            case 4:
                return new C18984n();
            case 5:
                return f53347b;
            case 6:
                C63010eb ebVar = f53348d;
                if (ebVar == null) {
                    synchronized (C18985o.class) {
                        ebVar = f53348d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53347b);
                            f53348d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
