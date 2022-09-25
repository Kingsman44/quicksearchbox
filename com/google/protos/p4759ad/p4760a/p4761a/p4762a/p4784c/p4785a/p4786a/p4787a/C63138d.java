package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.c.a.a.a.d */
/* compiled from: PG */
public final class C63138d extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C63138d f170494j;

    /* renamed from: k */
    private static volatile C63010eb f170495k;

    /* renamed from: a */
    public int f170496a;

    /* renamed from: b */
    public String f170497b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f170498c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public String f170499d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f170500e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f170501f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f170502g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f170503h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public boolean f170504i;

    static {
        C63138d dVar = new C63138d();
        f170494j = dVar;
        C62942bv.registerDefaultInstance(C63138d.class, dVar);
    }

    private C63138d() {
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
                return newMessageInfo(f170494j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C63138d();
            case 4:
                return new C63137c();
            case 5:
                return f170494j;
            case 6:
                C63010eb ebVar = f170495k;
                if (ebVar == null) {
                    synchronized (C63138d.class) {
                        ebVar = f170495k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170494j);
                            f170495k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
