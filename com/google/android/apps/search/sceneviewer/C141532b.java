package com.google.android.apps.search.sceneviewer;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.sceneviewer.b */
/* compiled from: PG */
public final class C141532b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141532b f384155d;

    /* renamed from: e */
    private static volatile C63010eb f384156e;

    /* renamed from: a */
    public int f384157a;

    /* renamed from: b */
    public boolean f384158b;

    /* renamed from: c */
    public boolean f384159c;

    static {
        C141532b bVar = new C141532b();
        f384155d = bVar;
        C62942bv.registerDefaultInstance(C141532b.class, bVar);
    }

    private C141532b() {
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
                return newMessageInfo(f384155d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141532b();
            case 4:
                return new C141525a();
            case 5:
                return f384155d;
            case 6:
                C63010eb ebVar = f384156e;
                if (ebVar == null) {
                    synchronized (C141532b.class) {
                        ebVar = f384156e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384155d);
                            f384156e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
