package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.y */
/* compiled from: PG */
public final class C80028y extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C80028y f219613g;

    /* renamed from: h */
    private static volatile C63010eb f219614h;

    /* renamed from: a */
    public int f219615a;

    /* renamed from: b */
    public float f219616b;

    /* renamed from: c */
    public int f219617c;

    /* renamed from: d */
    public int f219618d;

    /* renamed from: e */
    public float f219619e = -1.0f;

    /* renamed from: f */
    public float f219620f = -1.0f;

    static {
        C80028y yVar = new C80028y();
        f219613g = yVar;
        C62942bv.registerDefaultInstance(C80028y.class, yVar);
    }

    private C80028y() {
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
                return newMessageInfo(f219613g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C80028y();
            case 4:
                return new C80027x();
            case 5:
                return f219613g;
            case 6:
                C63010eb ebVar = f219614h;
                if (ebVar == null) {
                    synchronized (C80028y.class) {
                        ebVar = f219614h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219613g);
                            f219614h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
