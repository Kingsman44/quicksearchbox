package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.br */
/* compiled from: PG */
public final class C51720br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51720br f135690d;

    /* renamed from: e */
    private static volatile C63010eb f135691e;

    /* renamed from: a */
    public int f135692a;

    /* renamed from: b */
    public boolean f135693b;

    /* renamed from: c */
    public boolean f135694c;

    static {
        C51720br brVar = new C51720br();
        f135690d = brVar;
        C62942bv.registerDefaultInstance(C51720br.class, brVar);
    }

    private C51720br() {
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
                return newMessageInfo(f135690d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51720br();
            case 4:
                return new C51719bq();
            case 5:
                return f135690d;
            case 6:
                C63010eb ebVar = f135691e;
                if (ebVar == null) {
                    synchronized (C51720br.class) {
                        ebVar = f135691e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135690d);
                            f135691e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
