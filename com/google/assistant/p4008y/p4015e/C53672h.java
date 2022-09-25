package com.google.assistant.p4008y.p4015e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51965fr;
import com.google.assistant.p3897e.p3921j.p3926e.C52003hb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.e.h */
/* compiled from: PG */
public final class C53672h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53672h f140878e;

    /* renamed from: f */
    private static volatile C63010eb f140879f;

    /* renamed from: a */
    public int f140880a;

    /* renamed from: b */
    public int f140881b = 0;

    /* renamed from: c */
    public Object f140882c;

    /* renamed from: d */
    public int f140883d;

    static {
        C53672h hVar = new C53672h();
        f140878e = hVar;
        C62942bv.registerDefaultInstance(C53672h.class, hVar);
    }

    private C53672h() {
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
                return newMessageInfo(f140878e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003င\u0002", new Object[]{C45240c.f118157a, "b", "a", C52003hb.class, C51965fr.class, "d"});
            case 3:
                return new C53672h();
            case 4:
                return new C53671g();
            case 5:
                return f140878e;
            case 6:
                C63010eb ebVar = f140879f;
                if (ebVar == null) {
                    synchronized (C53672h.class) {
                        ebVar = f140879f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140878e);
                            f140879f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
