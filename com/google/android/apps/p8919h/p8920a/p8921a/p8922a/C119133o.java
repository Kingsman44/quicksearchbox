package com.google.android.apps.p8919h.p8920a.p8921a.p8922a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.h.a.a.a.o */
/* compiled from: PG */
public final class C119133o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C119133o f332284f;

    /* renamed from: g */
    private static volatile C63010eb f332285g;

    /* renamed from: a */
    public int f332286a;

    /* renamed from: b */
    public String f332287b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f332288c;

    /* renamed from: d */
    public int f332289d;

    /* renamed from: e */
    public int f332290e;

    static {
        C119133o oVar = new C119133o();
        f332284f = oVar;
        C62942bv.registerDefaultInstance(C119133o.class, oVar);
    }

    private C119133o() {
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
                return newMessageInfo(f332284f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\f\u0004\u0004\u0005\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C119133o();
            case 4:
                return new C119132n();
            case 5:
                return f332284f;
            case 6:
                C63010eb ebVar = f332285g;
                if (ebVar == null) {
                    synchronized (C119133o.class) {
                        ebVar = f332285g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f332284f);
                            f332285g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
