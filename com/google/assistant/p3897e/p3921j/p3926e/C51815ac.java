package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ac */
/* compiled from: PG */
public final class C51815ac extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51815ac f135941f;

    /* renamed from: g */
    private static volatile C63010eb f135942g;

    /* renamed from: a */
    public int f135943a;

    /* renamed from: b */
    public int f135944b;

    /* renamed from: c */
    public boolean f135945c = true;

    /* renamed from: d */
    public boolean f135946d = true;

    /* renamed from: e */
    public boolean f135947e = true;

    static {
        C51815ac acVar = new C51815ac();
        f135941f = acVar;
        C62942bv.registerDefaultInstance(C51815ac.class, acVar);
    }

    private C51815ac() {
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
                return newMessageInfo(f135941f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဇ\u0002\u0003ဇ\u0003\u0004ဌ\u0000", new Object[]{"a", C45240c.f118157a, "d", "e", "b", C51813aa.f135940a});
            case 3:
                return new C51815ac();
            case 4:
                return new C52067z();
            case 5:
                return f135941f;
            case 6:
                C63010eb ebVar = f135942g;
                if (ebVar == null) {
                    synchronized (C51815ac.class) {
                        ebVar = f135942g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135941f);
                            f135942g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
