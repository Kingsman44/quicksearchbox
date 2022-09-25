package com.google.protos.p4816ai.p4818b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.b.b */
/* compiled from: PG */
public final class C63196b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63196b f170734b;

    /* renamed from: d */
    private static volatile C63010eb f170735d;

    /* renamed from: a */
    public C62971cq f170736a = emptyProtobufList();

    /* renamed from: c */
    private byte f170737c = 2;

    static {
        C63196b bVar = new C63196b();
        f170734b = bVar;
        C62942bv.registerDefaultInstance(C63196b.class, bVar);
    }

    private C63196b() {
    }

    /* renamed from: a */
    public final void mo59194a() {
        C62971cq cqVar = this.f170736a;
        if (!cqVar.mo58948c()) {
            this.f170736a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f170737c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f170737c = b;
                return null;
            case 2:
                return newMessageInfo(f170734b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63198d.class});
            case 3:
                return new C63196b();
            case 4:
                return new C63195a();
            case 5:
                return f170734b;
            case 6:
                C63010eb ebVar = f170735d;
                if (ebVar == null) {
                    synchronized (C63196b.class) {
                        ebVar = f170735d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170734b);
                            f170735d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
