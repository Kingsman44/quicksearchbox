package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.p6939a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.a.c */
/* compiled from: PG */
public final class C88401c extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C88401c f239018j;

    /* renamed from: k */
    private static volatile C63010eb f239019k;

    /* renamed from: a */
    public int f239020a;

    /* renamed from: b */
    public int f239021b = 1;

    /* renamed from: c */
    public String f239022c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f239023d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f239024e;

    /* renamed from: f */
    public boolean f239025f;

    /* renamed from: g */
    public boolean f239026g;

    /* renamed from: h */
    public boolean f239027h;

    /* renamed from: i */
    public boolean f239028i;

    static {
        C88401c cVar = new C88401c();
        f239018j = cVar;
        C62942bv.registerDefaultInstance(C88401c.class, cVar);
    }

    private C88401c() {
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
                return newMessageInfo(f239018j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0007ဇ\u0004\bဇ\u0005\tဇ\u0006\nဇ\u0007", new Object[]{"a", "b", C88399a.f239017a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C88401c();
            case 4:
                return new C88400b();
            case 5:
                return f239018j;
            case 6:
                C63010eb ebVar = f239019k;
                if (ebVar == null) {
                    synchronized (C88401c.class) {
                        ebVar = f239019k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239018j);
                            f239019k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
