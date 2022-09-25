package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.ag.a.br */
/* compiled from: PG */
public final class C48851br extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C48851br f126412f;

    /* renamed from: g */
    private static volatile C63010eb f126413g;

    /* renamed from: a */
    public int f126414a;

    /* renamed from: b */
    public int f126415b = 0;

    /* renamed from: c */
    public Object f126416c;

    /* renamed from: d */
    public C48855bv f126417d;

    /* renamed from: e */
    public C63088z f126418e = C63088z.f170246b;

    static {
        C48851br brVar = new C48851br();
        f126412f = brVar;
        C62942bv.registerDefaultInstance(C48851br.class, brVar);
    }

    private C48851br() {
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
                return newMessageInfo(f126412f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ြ\u0000\u0004ွ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C48798af.class});
            case 3:
                return new C48851br();
            case 4:
                return new C48850bq();
            case 5:
                return f126412f;
            case 6:
                C63010eb ebVar = f126413g;
                if (ebVar == null) {
                    synchronized (C48851br.class) {
                        ebVar = f126413g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126412f);
                            f126413g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
