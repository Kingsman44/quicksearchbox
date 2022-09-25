package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.p8137a;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.a.b */
/* compiled from: PG */
public final class C105178b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C105178b f293242g;

    /* renamed from: h */
    public static final C62940bt f293243h;

    /* renamed from: i */
    private static volatile C63010eb f293244i;

    /* renamed from: a */
    public int f293245a;

    /* renamed from: b */
    public int f293246b;

    /* renamed from: c */
    public int f293247c;

    /* renamed from: d */
    public long f293248d;

    /* renamed from: e */
    public long f293249e;

    /* renamed from: f */
    public boolean f293250f;

    static {
        C105178b bVar = new C105178b();
        f293242g = bVar;
        C62942bv.registerDefaultInstance(C105178b.class, bVar);
        f293243h = C62942bv.newSingularGeneratedExtension(C91000i.f254200e, bVar, bVar, (C62958ce) null, 176451718, C63066gd.MESSAGE, C105178b.class);
    }

    private C105178b() {
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
                return newMessageInfo(f293242g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0007ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C105178b();
            case 4:
                return new C105177a();
            case 5:
                return f293242g;
            case 6:
                C63010eb ebVar = f293244i;
                if (ebVar == null) {
                    synchronized (C105178b.class) {
                        ebVar = f293244i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f293242g);
                            f293244i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
