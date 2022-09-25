package com.google.assistant.p3886c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.dp */
/* compiled from: PG */
public final class C50819dp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50819dp f132330b;

    /* renamed from: d */
    private static volatile C63010eb f132331d;

    /* renamed from: a */
    public C62971cq f132332a = emptyProtobufList();

    /* renamed from: c */
    private byte f132333c = 2;

    static {
        C50819dp dpVar = new C50819dp();
        f132330b = dpVar;
        C62942bv.registerDefaultInstance(C50819dp.class, dpVar);
    }

    private C50819dp() {
    }

    /* renamed from: a */
    public final void mo53470a() {
        C62971cq cqVar = this.f132332a;
        if (!cqVar.mo58948c()) {
            this.f132332a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132333c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132333c = b;
                return null;
            case 2:
                return newMessageInfo(f132330b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C50818do.class});
            case 3:
                return new C50819dp();
            case 4:
                return new C50785ci();
            case 5:
                return f132330b;
            case 6:
                C63010eb ebVar = f132331d;
                if (ebVar == null) {
                    synchronized (C50819dp.class) {
                        ebVar = f132331d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132330b);
                            f132331d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
