package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.d */
/* compiled from: PG */
public final class C51893d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51893d f136119d;

    /* renamed from: f */
    private static volatile C63010eb f136120f;

    /* renamed from: a */
    public boolean f136121a;

    /* renamed from: b */
    public boolean f136122b;

    /* renamed from: c */
    public boolean f136123c;

    /* renamed from: e */
    private int f136124e;

    static {
        C51893d dVar = new C51893d();
        f136119d = dVar;
        C62942bv.registerDefaultInstance(C51893d.class, dVar);
    }

    private C51893d() {
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
                return newMessageInfo(f136119d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C51893d();
            case 4:
                return new C51866c();
            case 5:
                return f136119d;
            case 6:
                C63010eb ebVar = f136120f;
                if (ebVar == null) {
                    synchronized (C51893d.class) {
                        ebVar = f136120f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136119d);
                            f136120f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
