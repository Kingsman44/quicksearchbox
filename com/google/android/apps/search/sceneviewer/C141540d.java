package com.google.android.apps.search.sceneviewer;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.sceneviewer.d */
/* compiled from: PG */
public final class C141540d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141540d f384175c;

    /* renamed from: d */
    private static volatile C63010eb f384176d;

    /* renamed from: a */
    public int f384177a;

    /* renamed from: b */
    public C141532b f384178b;

    static {
        C141540d dVar = new C141540d();
        f384175c = dVar;
        C62942bv.registerDefaultInstance(C141540d.class, dVar);
    }

    private C141540d() {
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
                return newMessageInfo(f384175c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C141540d();
            case 4:
                return new C141535c();
            case 5:
                return f384175c;
            case 6:
                C63010eb ebVar = f384176d;
                if (ebVar == null) {
                    synchronized (C141540d.class) {
                        ebVar = f384176d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f384175c);
                            f384176d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
