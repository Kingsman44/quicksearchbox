package com.google.android.apps.search.googleapp.promomanager.p10374c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.c.d */
/* compiled from: PG */
public final class C137035d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C137035d f372929f;

    /* renamed from: g */
    private static volatile C63010eb f372930g;

    /* renamed from: a */
    public int f372931a;

    /* renamed from: b */
    public C137034c f372932b;

    /* renamed from: c */
    public C137034c f372933c;

    /* renamed from: d */
    public C137034c f372934d;

    /* renamed from: e */
    public C137034c f372935e;

    static {
        C137035d dVar = new C137035d();
        f372929f = dVar;
        C62942bv.registerDefaultInstance(C137035d.class, dVar);
    }

    private C137035d() {
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
                return newMessageInfo(f372929f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C137035d();
            case 4:
                return new C137032a();
            case 5:
                return f372929f;
            case 6:
                C63010eb ebVar = f372930g;
                if (ebVar == null) {
                    synchronized (C137035d.class) {
                        ebVar = f372930g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372929f);
                            f372930g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
