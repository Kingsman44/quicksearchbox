package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ai.b.eh */
/* compiled from: PG */
public final class C7635eh extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C7635eh f26379f;

    /* renamed from: g */
    private static volatile C63010eb f26380g;

    /* renamed from: a */
    public int f26381a;

    /* renamed from: b */
    public C63088z f26382b = C63088z.f170246b;

    /* renamed from: c */
    public int f26383c;

    /* renamed from: d */
    public int f26384d;

    /* renamed from: e */
    public int f26385e = 1;

    static {
        C7635eh ehVar = new C7635eh();
        f26379f = ehVar;
        C62942bv.registerDefaultInstance(C7635eh.class, ehVar);
    }

    private C7635eh() {
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
                return newMessageInfo(f26379f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C7797kh.f27261a});
            case 3:
                return new C7635eh();
            case 4:
                return new C7634eg();
            case 5:
                return f26379f;
            case 6:
                C63010eb ebVar = f26380g;
                if (ebVar == null) {
                    synchronized (C7635eh.class) {
                        ebVar = f26380g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26379f);
                            f26380g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
