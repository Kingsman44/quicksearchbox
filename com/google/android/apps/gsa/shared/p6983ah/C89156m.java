package com.google.android.apps.gsa.shared.p6983ah;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88079oj;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ah.m */
/* compiled from: PG */
public final class C89156m extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C89156m f241706i;

    /* renamed from: j */
    private static volatile C63010eb f241707j;

    /* renamed from: a */
    public int f241708a;

    /* renamed from: b */
    public boolean f241709b;

    /* renamed from: c */
    public boolean f241710c;

    /* renamed from: d */
    public boolean f241711d;

    /* renamed from: e */
    public boolean f241712e;

    /* renamed from: f */
    public C89158o f241713f;

    /* renamed from: g */
    public int f241714g;

    /* renamed from: h */
    public C89154k f241715h;

    static {
        C89156m mVar = new C89156m();
        f241706i = mVar;
        C62942bv.registerDefaultInstance(C89156m.class, mVar);
    }

    private C89156m() {
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
                return newMessageInfo(f241706i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဌ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C88079oj.m142781b(), C19618h.f54585a});
            case 3:
                return new C89156m();
            case 4:
                return new C89155l();
            case 5:
                return f241706i;
            case 6:
                C63010eb ebVar = f241707j;
                if (ebVar == null) {
                    synchronized (C89156m.class) {
                        ebVar = f241707j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241706i);
                            f241707j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
