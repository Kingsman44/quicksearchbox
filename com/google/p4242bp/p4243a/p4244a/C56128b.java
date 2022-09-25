package com.google.p4242bp.p4243a.p4244a;

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

/* renamed from: com.google.bp.a.a.b */
/* compiled from: PG */
public final class C56128b extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C56128b f149531j;

    /* renamed from: k */
    private static volatile C63010eb f149532k;

    /* renamed from: a */
    public int f149533a;

    /* renamed from: b */
    public String f149534b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f149535c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f149536d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C56138l f149537e;

    /* renamed from: f */
    public C56140n f149538f;

    /* renamed from: g */
    public int f149539g;

    /* renamed from: h */
    public boolean f149540h;

    /* renamed from: i */
    public int f149541i;

    static {
        C56128b bVar = new C56128b();
        f149531j = bVar;
        C62942bv.registerDefaultInstance(C56128b.class, bVar);
    }

    private C56128b() {
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
                return newMessageInfo(f149531j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\bဌ\u0007\tဇ\b\nင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C56129c.f149542a, C19618h.f54585a, "i"});
            case 3:
                return new C56128b();
            case 4:
                return new C56127a();
            case 5:
                return f149531j;
            case 6:
                C63010eb ebVar = f149532k;
                if (ebVar == null) {
                    synchronized (C56128b.class) {
                        ebVar = f149532k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149531j);
                            f149532k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
