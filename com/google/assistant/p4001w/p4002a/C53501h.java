package com.google.assistant.p4001w.p4002a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.w.a.h */
/* compiled from: PG */
public final class C53501h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53501h f140402e;

    /* renamed from: f */
    private static volatile C63010eb f140403f;

    /* renamed from: a */
    public int f140404a;

    /* renamed from: b */
    public C62910ar f140405b;

    /* renamed from: c */
    public C62910ar f140406c;

    /* renamed from: d */
    public C53503j f140407d;

    static {
        C53501h hVar = new C53501h();
        f140402e = hVar;
        C62942bv.registerDefaultInstance(C53501h.class, hVar);
    }

    private C53501h() {
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
                return newMessageInfo(f140402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C53501h();
            case 4:
                return new C53500g();
            case 5:
                return f140402e;
            case 6:
                C63010eb ebVar = f140403f;
                if (ebVar == null) {
                    synchronized (C53501h.class) {
                        ebVar = f140403f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140402e);
                            f140403f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
