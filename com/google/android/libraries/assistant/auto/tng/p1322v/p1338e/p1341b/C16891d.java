package com.google.android.libraries.assistant.auto.tng.p1322v.p1338e.p1341b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.v.e.b.d */
/* compiled from: PG */
public final class C16891d extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C16891d f49387g;

    /* renamed from: h */
    private static volatile C63010eb f49388h;

    /* renamed from: a */
    public int f49389a;

    /* renamed from: b */
    public boolean f49390b;

    /* renamed from: c */
    public boolean f49391c;

    /* renamed from: d */
    public boolean f49392d;

    /* renamed from: e */
    public boolean f49393e = true;

    /* renamed from: f */
    public boolean f49394f;

    static {
        C16891d dVar = new C16891d();
        f49387g = dVar;
        C62942bv.registerDefaultInstance(C16891d.class, dVar);
    }

    private C16891d() {
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
                return newMessageInfo(f49387g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C16891d();
            case 4:
                return new C16890c();
            case 5:
                return f49387g;
            case 6:
                C63010eb ebVar = f49388h;
                if (ebVar == null) {
                    synchronized (C16891d.class) {
                        ebVar = f49388h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f49387g);
                            f49388h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
