package com.google.android.apps.search.googleapp.launcher.p10341b.p10348f;

import com.google.android.apps.search.googleapp.launcher.p10341b.p10344c.C136455h;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.f.c */
/* compiled from: PG */
public final class C136467c extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C136467c f371545i;

    /* renamed from: j */
    private static volatile C63010eb f371546j;

    /* renamed from: a */
    public int f371547a;

    /* renamed from: b */
    public int f371548b = 1;

    /* renamed from: c */
    public boolean f371549c;

    /* renamed from: d */
    public C136455h f371550d;

    /* renamed from: e */
    public boolean f371551e;

    /* renamed from: f */
    public boolean f371552f;

    /* renamed from: g */
    public boolean f371553g;

    /* renamed from: h */
    public boolean f371554h;

    static {
        C136467c cVar = new C136467c();
        f371545i = cVar;
        C62942bv.registerDefaultInstance(C136467c.class, cVar);
    }

    private C136467c() {
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
                return newMessageInfo(f371545i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C136469e.m221781b(), C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C136467c();
            case 4:
                return new C136466b();
            case 5:
                return f371545i;
            case 6:
                C63010eb ebVar = f371546j;
                if (ebVar == null) {
                    synchronized (C136467c.class) {
                        ebVar = f371546j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371545i);
                            f371546j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
