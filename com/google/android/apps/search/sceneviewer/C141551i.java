package com.google.android.apps.search.sceneviewer;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.sceneviewer.i */
/* compiled from: PG */
public final class C141551i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C141551i f384206d;

    /* renamed from: e */
    private static volatile C63010eb f384207e;

    /* renamed from: a */
    public int f384208a;

    /* renamed from: b */
    public C141570m f384209b;

    /* renamed from: c */
    public C141568k f384210c;

    static {
        C141551i iVar = new C141551i();
        f384206d = iVar;
        C62942bv.registerDefaultInstance(C141551i.class, iVar);
    }

    private C141551i() {
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
                return newMessageInfo(f384206d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C141551i();
            case 4:
                return new C141550h();
            case 5:
                return f384206d;
            case 6:
                C63010eb ebVar = f384207e;
                if (ebVar == null) {
                    synchronized (C141551i.class) {
                        ebVar = f384207e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384206d);
                            f384207e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
