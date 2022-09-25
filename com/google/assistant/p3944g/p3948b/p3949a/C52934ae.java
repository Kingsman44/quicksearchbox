package com.google.assistant.p3944g.p3948b.p3949a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.ae */
/* compiled from: PG */
public final class C52934ae extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52934ae f138786b;

    /* renamed from: c */
    private static volatile C63010eb f138787c;

    /* renamed from: a */
    public C62971cq f138788a = emptyProtobufList();

    static {
        C52934ae aeVar = new C52934ae();
        f138786b = aeVar;
        C62942bv.registerDefaultInstance(C52934ae.class, aeVar);
    }

    private C52934ae() {
    }

    /* renamed from: a */
    public final void mo53949a() {
        C62971cq cqVar = this.f138788a;
        if (!cqVar.mo58948c()) {
            this.f138788a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138786b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", C52957v.class});
            case 3:
                return new C52934ae();
            case 4:
                return new C52933ad();
            case 5:
                return f138786b;
            case 6:
                C63010eb ebVar = f138787c;
                if (ebVar == null) {
                    synchronized (C52934ae.class) {
                        ebVar = f138787c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138786b);
                            f138787c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
