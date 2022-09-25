package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.j */
/* compiled from: PG */
public final class C50838j extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50838j f132370b;

    /* renamed from: c */
    private static volatile C63010eb f132371c;

    /* renamed from: a */
    public C62971cq f132372a = emptyProtobufList();

    static {
        C50838j jVar = new C50838j();
        f132370b = jVar;
        C62942bv.registerDefaultInstance(C50838j.class, jVar);
    }

    private C50838j() {
    }

    /* renamed from: a */
    public final void mo53484a() {
        C62971cq cqVar = this.f132372a;
        if (!cqVar.mo58948c()) {
            this.f132372a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f132370b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C50715b.class});
            case 3:
                return new C50838j();
            case 4:
                return new C50830e();
            case 5:
                return f132370b;
            case 6:
                C63010eb ebVar = f132371c;
                if (ebVar == null) {
                    synchronized (C50838j.class) {
                        ebVar = f132371c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132370b);
                            f132371c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
