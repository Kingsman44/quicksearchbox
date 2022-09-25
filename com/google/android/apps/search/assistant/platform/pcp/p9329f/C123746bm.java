package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.bm */
/* compiled from: PG */
public final class C123746bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123746bm f341818b;

    /* renamed from: d */
    private static volatile C63010eb f341819d;

    /* renamed from: a */
    public C62971cq f341820a = emptyProtobufList();

    /* renamed from: c */
    private byte f341821c = 2;

    static {
        C123746bm bmVar = new C123746bm();
        f341818b = bmVar;
        C62942bv.registerDefaultInstance(C123746bm.class, bmVar);
    }

    private C123746bm() {
    }

    /* renamed from: a */
    public final void mo106127a() {
        C62971cq cqVar = this.f341820a;
        if (!cqVar.mo58948c()) {
            this.f341820a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341821c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341821c = b;
                return null;
            case 2:
                return newMessageInfo(f341818b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C123744bk.class});
            case 3:
                return new C123746bm();
            case 4:
                return new C123745bl();
            case 5:
                return f341818b;
            case 6:
                C63010eb ebVar = f341819d;
                if (ebVar == null) {
                    synchronized (C123746bm.class) {
                        ebVar = f341819d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341818b);
                            f341819d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
