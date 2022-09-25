package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.x */
/* compiled from: PG */
public final class C88474x extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C88474x f239172h;

    /* renamed from: j */
    private static volatile C63010eb f239173j;

    /* renamed from: a */
    public int f239174a;

    /* renamed from: b */
    public int f239175b;

    /* renamed from: c */
    public int f239176c = 2;

    /* renamed from: d */
    public int f239177d;

    /* renamed from: e */
    public int f239178e;

    /* renamed from: f */
    public int f239179f;

    /* renamed from: g */
    public int f239180g;

    /* renamed from: i */
    private byte f239181i = 2;

    static {
        C88474x xVar = new C88474x();
        f239172h = xVar;
        C62942bv.registerDefaultInstance(C88474x.class, xVar);
    }

    private C88474x() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f239181i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f239181i = b;
                return null;
            case 2:
                return newMessageInfo(f239172h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003\u0006င\u0004\u0007ဌ\u0005", new Object[]{"a", "b", C88473w.m142820b(), C45240c.f118157a, C88468r.f239164a, "d", C88467q.m142816b(), "e", C88470t.f239165a, C10662f.f35572a, C30325g.f82003a, C88465o.m142814b()});
            case 3:
                return new C88474x();
            case 4:
                return new C88463m();
            case 5:
                return f239172h;
            case 6:
                C63010eb ebVar = f239173j;
                if (ebVar == null) {
                    synchronized (C88474x.class) {
                        ebVar = f239173j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239172h);
                            f239173j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
