package com.google.assistant.p4016z;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.z.h */
/* compiled from: PG */
public final class C53723h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53723h f141037b;

    /* renamed from: c */
    private static volatile C63010eb f141038c;

    /* renamed from: a */
    public C62971cq f141039a = emptyProtobufList();

    static {
        C53723h hVar = new C53723h();
        f141037b = hVar;
        C62942bv.registerDefaultInstance(C53723h.class, hVar);
    }

    private C53723h() {
    }

    /* renamed from: a */
    public final void mo54011a() {
        C62971cq cqVar = this.f141039a;
        if (!cqVar.mo58948c()) {
            this.f141039a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f141037b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C53698aw.class});
            case 3:
                return new C53723h();
            case 4:
                return new C53722g();
            case 5:
                return f141037b;
            case 6:
                C63010eb ebVar = f141038c;
                if (ebVar == null) {
                    synchronized (C53723h.class) {
                        ebVar = f141038c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141037b);
                            f141038c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
