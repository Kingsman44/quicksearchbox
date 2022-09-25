package com.google.android.apps.gsa.nga.engine.p6262y.p6267c.p6268a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79891m;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4841al.p4842a.p4844b.C63299b;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.c.a.g */
/* compiled from: PG */
public final class C79906g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C79906g f219026e;

    /* renamed from: f */
    public static final C62940bt f219027f;

    /* renamed from: h */
    private static volatile C63010eb f219028h;

    /* renamed from: a */
    public boolean f219029a;

    /* renamed from: b */
    public boolean f219030b;

    /* renamed from: c */
    public int f219031c;

    /* renamed from: d */
    public C63299b f219032d;

    /* renamed from: g */
    private int f219033g;

    static {
        C79906g gVar = new C79906g();
        f219026e = gVar;
        C62942bv.registerDefaultInstance(C79906g.class, gVar);
        f219027f = C62942bv.newSingularGeneratedExtension(C79891m.f218975e, gVar, gVar, (C62958ce) null, 283352692, C63066gd.MESSAGE, C79906g.class);
    }

    private C79906g() {
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
                return newMessageInfo(f219026e, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0004ဉ\u0003\u0006င\u0002", new Object[]{C30325g.f82003a, "a", "b", "d", C45240c.f118157a});
            case 3:
                return new C79906g();
            case 4:
                return new C79905f();
            case 5:
                return f219026e;
            case 6:
                C63010eb ebVar = f219028h;
                if (ebVar == null) {
                    synchronized (C79906g.class) {
                        ebVar = f219028h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219026e);
                            f219028h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
