package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.gx */
/* compiled from: PG */
public final class C87877gx extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87877gx f237731f;

    /* renamed from: g */
    private static volatile C63010eb f237732g;

    /* renamed from: a */
    public int f237733a;

    /* renamed from: b */
    public boolean f237734b;

    /* renamed from: c */
    public boolean f237735c;

    /* renamed from: d */
    public boolean f237736d;

    /* renamed from: e */
    public boolean f237737e;

    static {
        C87877gx gxVar = new C87877gx();
        f237731f = gxVar;
        C62942bv.registerDefaultInstance(C87877gx.class, gxVar);
    }

    private C87877gx() {
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
                return newMessageInfo(f237731f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87877gx();
            case 4:
                return new C87876gw();
            case 5:
                return f237731f;
            case 6:
                C63010eb ebVar = f237732g;
                if (ebVar == null) {
                    synchronized (C87877gx.class) {
                        ebVar = f237732g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237731f);
                            f237732g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
