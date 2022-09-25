package com.google.assistant.p3803ag.p3809c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.br */
/* compiled from: PG */
public final class C48971br extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48971br f126689d;

    /* renamed from: f */
    private static volatile C63010eb f126690f;

    /* renamed from: a */
    public int f126691a = 0;

    /* renamed from: b */
    public Object f126692b;

    /* renamed from: c */
    public C48970bq f126693c;

    /* renamed from: e */
    private int f126694e;

    static {
        C48971br brVar = new C48971br();
        f126689d = brVar;
        C62942bv.registerDefaultInstance(C48971br.class, brVar);
    }

    private C48971br() {
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
                return newMessageInfo(f126689d, "\u0001\u000e\u0001\u0001\u0001\u000f\u000e\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ဉ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fြ\u0000\rြ\u0000\u000eြ\u0000\u000fြ\u0000", new Object[]{"b", "a", "e", C49156z.class, C49017dj.class, C45240c.f118157a, C48985ce.class, C48991ck.class, C48947au.class, C48943aq.class, C48964bk.class, C49003cw.class, C48997cq.class, C48960bg.class, C48939am.class, C48932af.class, C48987cg.class});
            case 3:
                return new C48971br();
            case 4:
                return new C48965bl();
            case 5:
                return f126689d;
            case 6:
                C63010eb ebVar = f126690f;
                if (ebVar == null) {
                    synchronized (C48971br.class) {
                        ebVar = f126690f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126689d);
                            f126690f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
