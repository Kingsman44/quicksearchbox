package com.google.android.libraries.search.p2904c;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.eu */
/* compiled from: PG */
public final class C37580eu extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C37580eu f99853g;

    /* renamed from: h */
    private static volatile C63010eb f99854h;

    /* renamed from: a */
    public int f99855a;

    /* renamed from: b */
    public boolean f99856b;

    /* renamed from: c */
    public int f99857c;

    /* renamed from: d */
    public boolean f99858d;

    /* renamed from: e */
    public int f99859e;

    /* renamed from: f */
    public C37360ay f99860f;

    static {
        C37580eu euVar = new C37580eu();
        f99853g = euVar;
        C62942bv.registerDefaultInstance(C37580eu.class, euVar);
    }

    private C37580eu() {
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
                return newMessageInfo(f99853g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C37577er.f99852a, "d", "e", C37581ev.f99861a, C10662f.f35572a});
            case 3:
                return new C37580eu();
            case 4:
                return new C37579et();
            case 5:
                return f99853g;
            case 6:
                C63010eb ebVar = f99854h;
                if (ebVar == null) {
                    synchronized (C37580eu.class) {
                        ebVar = f99854h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99853g);
                            f99854h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
